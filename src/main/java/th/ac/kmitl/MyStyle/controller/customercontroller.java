package th.ac.kmitl.MyStyle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class customercontroller {

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        List<customer> customers = new ArrayList<>();
        customers.add(new customer(1,"Peter",1234));
        customers.add(new customer(2,"Nancy",2345));
        customers.add(new customer(3,"Rick",3456));
        model.addAttribute("allCustomers", customers);
        return "customer"; //customer.html
    }
}
