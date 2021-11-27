package com.Dealership2.carDealer.Controller;

import DTO.Bid;
import com.Dealership2.carDealer.Entity.Car;
import com.Dealership2.carDealer.Entity.Customer;
import com.Dealership2.carDealer.Entity.Payment;
import com.Dealership2.carDealer.Entity.Transaction;
import com.Dealership2.carDealer.Service.CarDirectoryService;
import com.Dealership2.carDealer.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class DealerController {

    @Autowired
    CarDirectoryService carDirectory;

    @Autowired
    CustomerService customerService;

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

//    @PostMapping("/contact")
//    public String postContact(@ModelAttribute("customer") Customer customer, Model model, HttpSession session) {
//        model.addAttribute("newCustomer", customer);
//        customerInfo.saveCustomer(customer); // change method to new leads for sales dash
//        return "thank-you";
//    }
    //trying to map and carry car attribute for details
//    @GetMapping("/allCars/details")
//    public String showDetails(@PathVariable double vin, Model model) {
//        Car selectedCar = carDirectory.findByVin(vin);
//
//
//    }


    //Inventory page for ALL Cars on lot
    @GetMapping("/allCars")
    public String searchInventory(Model model) {
        model.addAttribute("carsOnLot", carDirectory.getAllCars());
        System.out.println("allCars running a-ok!");

        return "allCars";
    }


    //    // select car
    @PostMapping("/allCars")
    public String chooseCar(Model model, int vin, @ModelAttribute("car") Car car) { //HttpSession session) {
        car = carDirectory.findByVin(vin);
        System.out.println("post mapping allCars - " + vin);
        //  model.addAttribute("car", new Car());
        //session.getAttribute("car");
        return "selected-car";

    }

    @GetMapping("/selected-car")
    public String selectedCar(@RequestParam int vin, Model model, HttpSession session) {
        model.addAttribute("carList", carDirectory.findByVin(vin));
        //clickedCar = carDirectory.findByVin(vin);
        System.out.println("get mapping selected - " + vin);
        return "selected-car";
    }

    @GetMapping("/bid")
    public String getBid(@RequestParam int vin, Model model) {
        // create a Bid DTO
        // but first modify your Bid DTO to have a min price
        // it should also have a max price

        // inject the needed objects for the BidDTO
            // ie the selected Car


        // render the jsp
        return "MAKE ME.jsp";
    }

    @PostMapping("/bid")
    public String postBid(@ModelAttribute("bid") Bid bid, Model model) {
        // extract information / objects from the bidDTO
        // make sure the bid price is in the correct range
        // if it is
            // save the bid
        // if not
            // redirect back

        // render the jsp
        return "MAKE ME.jsp";
    }

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

        // but also save the customer object from the transaction into our customer database
        Customer customer = transaction.getCustomer();

        // and finally save our payment object from the transaction into our payment database


        model.addAttribute("newTransaction", transaction);

        return "thank-you";

    }

    // POST SIGN UP SPRING MVC LAB
//@PostMapping("/signup")
//public String postSign(@ModelAttribute("student") Student student, Model model, HttpSession session) {
//    model.addAttribute("newStudent", student);
//    studentService.saveStudent(student);
//    return "thankyou";
//}


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

    @GetMapping("/preowned")
    public String searchPreOwned(Model model) {
        model.addAttribute("preOwned", carDirectory.getPreOwned());
        return "preowned";
    }

    @GetMapping("/promoCars")
    public String searchPromos(Model model) {
        model.addAttribute("promoCars", carDirectory.findPromos());
        return "promoCars";
    }
//
//    @GetMapping("/purchase")
//    public String purchaseCar(Model model) {
//        model.addAttribute("inventory", carDirectory.findPromo());
//        return "purchase";
//    }


    @GetMapping("/saleslogin")
    public String employee(Model model) {
        return "saleslogin";
    }


//    @GetMapping("/newCars")
//    public ModelAndView searchNewCars(Model model, Car car)  {
//        model.addAttribute("newCars", "newCars");
//        return new ModelAndView("newCars", "newCars", carDirectory.findByNew(car);
//    }


//
//        @GetMapping("/login")
//        public String getLogin(Model model) {
//            model.addAttribute("newLogin", new Student());
//            return "login";
//        }
//
//        @PostMapping("login")
//        public String checkLogin(@ModelAttribute("newLogin") Student student, Model model, RedirectAttributes redirectAttributes) {
//
//            boolean validCredentials = studentService.authenticate(student);
//
//            if (validCredentials) {
//                model.addAttribute("allStudents", studentService.getStudents());
//                return "home";
//            } else {
//                model.addAttribute("badCredentials", true);
//                return "login";
//            }
//        }


}