package com.Dealership2.carDealer.Controller;

import DTO.Bid;
import com.Dealership2.carDealer.Database.MockDatabaseCustomers;
import com.Dealership2.carDealer.Entity.Car;
import com.Dealership2.carDealer.Entity.Customer;
import com.Dealership2.carDealer.Entity.Payment;
import com.Dealership2.carDealer.Entity.Transaction;
import com.Dealership2.carDealer.Repository.TransactionRepository;
import com.Dealership2.carDealer.Service.CarDirectoryService;
import com.Dealership2.carDealer.Service.CustomerService;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.lang.constant.Constable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;


@Controller
public class DealerController {

    @Autowired
    CarDirectoryService carDirectory;

    @Autowired
    CustomerService customerService;

    @Autowired
    TransactionRepository transactionRepository;

    Car clickedCar = new Car();

    @GetMapping("/")
    public String welcome(Model model) {
        // model.addAttribute("allCars", carDirectory.getAllCars());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {

        return "about";
    }


    @GetMapping("/contact")
    public String contact(Model model) {
        //  Customer customer = new Customer();
        //model.addAttribute("customer", customer);
        return "contact";
    }

    @GetMapping("/thank-you")
    public String mapToThankYou(Model model) {
        return "thank-you";
    }

    @GetMapping("/make-model")
    public String searchMakeModel(Model model) {
        return "make-model";
    }

    //Inventory page for ALL Cars on lot
    @GetMapping("/allCars")
    public String searchInventory(Model model) {
        model.addAttribute("carsOnLot", carDirectory.getUnsoldList());
        System.out.println("allCars running a-ok!");

        return "allCars";
    }
    @GetMapping("/soldCars")
    public String searchSold(Model model) {
        model.addAttribute("carsOnLot", carDirectory.getSoldList());
        System.out.println("sold cars running a-ok!");

        return "allCars";
    }

    // select car to view more details
    @PostMapping("/allCars")
    public String chooseCar(Model model, int vin, @ModelAttribute("car") Car car) { //HttpSession session) {
        car = carDirectory.findByVin(vin);
        System.out.println("post mapping allCars - " + vin);
        //  model.addAttribute("car", new Car());
        //session.getAttribute("car");
        return "selected-car";

    }
    // selected car details page, choose to purchase or return to inventory
    @GetMapping("/selected-car")
    public String selectedCar(@RequestParam int vin, Model model, HttpSession session) {
        model.addAttribute("carList", carDirectory.findByVin(vin));
        //clickedCar = carDirectory.findByVin(vin);
        System.out.println("get mapping selected - " + vin);
        return "selected-car";
    }

//    @PostMapping("/selected-car")
//    public String buyFromDetails(@RequestParam int vin, Model model, @ModelAttribute("carList") Car car) { //HttpSession session) {
//    //    car = carDirectory.findByVin(vin);
//        model.addAttribute("carList", carDirectory.findByVin(vin));
//        System.out.println("post mapping selected car - " + vin);
//        return "purchase";
//
//    }

    @PostMapping("/selected-car")
    public String buyFromDetails(Model model, int vin, @ModelAttribute("car") Car car) { //HttpSession session) {
        car = carDirectory.findByVin(vin);
        System.out.println("post mapping newCars - " + vin);
        //  model.addAttribute("car", new Car());
        //session.getAttribute("car");
        return "purchase";

    // this doesn't work, trying to map from selected-car to purchase page with car attribute
//
//    @GetMapping("/selected-car/purchase")
//    public String buyChosenCar(Model model, int vin, @ModelAttribute ("car") Car car) { //HttpSession session) {
//        System.out.println("post mapping allCars - ");
//        model.addAttribute("car", carDirectory.findByVin(vin));
//
//        return "purchase";

  }

    @GetMapping("/addCarForm")
    public String addCarToInventory(Model model) {
        Car newCar = new Car();
        carDirectory.addCar(newCar);
        model.addAttribute("newCar", newCar);
        return "addCarForm";
    }

    @PostMapping("/addCarForm")
    public String postAddCar(@ModelAttribute("car") Car car, Model model, HttpSession session) {
        model.addAttribute("newCar", car);
        carDirectory.addCar(car);
        return "addCarSuccess";
    }


    @GetMapping("/salesdash")
    public String showSalesDash(Model model){
            model.addAttribute("transactions", transactionRepository.getAllTransaction());
            System.out.println("sales dash running a-ok!");
        return "salesdash";
    }


    @PostMapping("/bid/{vin}")
    public String postBid(@PathVariable("vin") int vin, @RequestParam("bid") int bid, Model model) {
        // extract information / objects from the bidDTO
        Car promoCar = carDirectory.findByVin(vin);
        double maxDiscount = promoCar.getPrice() - (promoCar.getPrice() * .1);
        if (bid <= maxDiscount) {
            return "redirect:/promoCars";
        }

        Transaction newTransaction = new Transaction();
        Bid custBid = new Bid();

        newTransaction.setCar(promoCar);
        custBid.setOffer(bid);
        newTransaction.setBid(custBid);
       // newTransaction.setPrice();
        // install above object into jsp
        model.addAttribute("transaction", newTransaction);
        System.out.println(promoCar.getPrice());
        // render the jsp
        return "purchase";

        }

        //@PostMapping("/login")
//        public String checkLogin(@ModelAttribute("newLogin") Employee employee, Model model, RedirectAttributes redirectAttributes) {
//
//            boolean validCredentials = studentService.authenticate(student);
//
//            if (validCredentials) {
//                model.addAttribute("allEmployees", employeeService.getEmployee());
//                return "home";
//            } else {
//                model.addAttribute("badCredentials", true);
//                return "login";
//            }
//        }

    @GetMapping("/purchase")
    public String purchaseCar(@RequestParam int vin, Model model, HttpSession session) {
        // creating an object to install into our jsp
        Car selectedCar = carDirectory.findByVin(vin);
        Transaction newTransaction = new Transaction();
        newTransaction.setCar(selectedCar);

        // install above object into jsp
        model.addAttribute("transaction", newTransaction);

        // render the jsp
        return "purchase";
    }

    @PostMapping("/purchase")
    public String postPurchase(@ModelAttribute("transaction") Transaction transaction, Model model, HttpSession session) {
        Car selectedCar = carDirectory.findByVin(transaction.getCar().getVin());
        transaction.setCar(selectedCar);

        // we will assume that the user filled out the form properly

        // so lets save this transaction object into our mock database
        LocalDate newDate = LocalDate.now();
        transaction.setTransactionDate(newDate);

        // but also save the customer object from the transaction into our customer database
        Customer newCustomer = transaction.getCustomer();
        customerService.saveCustomer(newCustomer);
        transaction.setCustomer(newCustomer);

        // and finally save our payment object from the transaction into our payment database
        Payment newPayment = transaction.getPayment();
        newPayment.setCustomer(newCustomer);
        transaction.setPayment(newPayment);

        transaction.setSetSold(true);
        System.out.println("sold status");
        transactionRepository.saveTransaction(transaction);


        model.addAttribute("newTransaction", transaction);


        System.out.println("payment submitted" + transaction);



        return "thank-you";

    }


//    // this works
//    @GetMapping ("/allCars/details")
//    public String getDetails(Model model, @ModelAttribute("car") Car car, HttpSession session) {
//        session.getAttribute("car");
//        return "selected-car";
//    }

//    @GetMapping("allCars/purchase")
//        public String purchase(Model model) {
//        Customer customer = new Customer();
//        Payment payment = new Payment();
//        customer.setPayment(payment);
//        model.addAttribute("customer", customer);
//        return "purchase";
//
//    }
//
//    @PostMapping("/purchase")
//        public String postPurchase(@ModelAttribute("customer") Customer customer, Model model, HttpSession session){
//            model.addAttribute("newCustomer", customer);
//            customerService.saveCustomer(customer);
//            return "thank-you";
//        }


    @GetMapping("/newCars")
    public String searchNewInventory(Model model) {
        model.addAttribute("newCars", carDirectory.NewInventory());
        return "newCars";
    }

    @PostMapping("/newCars")
    public String BuyFromNew(Model model, int vin, @ModelAttribute("car") Car car) { //HttpSession session) {
        car = carDirectory.findByVin(vin);
        System.out.println("post mapping newCars - " + vin);
        //  model.addAttribute("car", new Car());
        //session.getAttribute("car");
        return "purchase";
    }
    @GetMapping("/preowned")
    public String searchPreOwned(Model model) {
        model.addAttribute("preOwned", carDirectory.getPreOwned());
        return "preowned";
    }

    @PostMapping("/preowned")
    public String BuyFromUsed(Model model, int vin, @ModelAttribute("car") Car car) { //HttpSession session) {
        car = carDirectory.findByVin(vin);
        System.out.println("post mapping newCars - " + vin);
        //  model.addAttribute("car", new Car());
        //session.getAttribute("car");
        return "purchase";

    }
    @GetMapping("/promoCars")
    public String searchPromos(Model model) {
        model.addAttribute("promoCars", carDirectory.findPromos());
        return "promoCars";
    }


    @GetMapping("/saleslogin")
    public String employee(Model model) {
        return "saleslogin";
    }

}