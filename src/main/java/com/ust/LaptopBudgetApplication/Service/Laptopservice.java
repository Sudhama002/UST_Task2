package com.ust.LaptopBudgetApplication.Service;
import com.ust.LaptopBudgetApplication.model.LaptopInfo;
import com.ust.LaptopBudgetApplication.repository.Laptoprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class Laptopservice {
    @Autowired
    private Laptoprepo laptopRepository;
    // Fetch laptops within the budget
    public List<LaptopInfo> findLaptopsByBudget(double budget) {
        return laptopRepository.findByPriceLessThanEqual(budget);
    }

}
