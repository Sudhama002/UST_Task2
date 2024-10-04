package com.ust.LaptopBudgetApplication.Controller;
import com.ust.LaptopBudgetApplication.model.LaptopInfo;
import com.ust.LaptopBudgetApplication.Service.Laptopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/laptops")
public class Laptopcontroller {
    @Autowired
    private Laptopservice laptopService;

    // Endpoint to find laptops under a specified budget
    @GetMapping("/under-budget")
    public List<LaptopInfo> getLaptopsUnderBudget(@RequestParam double budget) {
        return laptopService.findLaptopsByBudget(budget);
    }

}
