package com.ust.LaptopBudgetApplication.repository;
import com.ust.LaptopBudgetApplication.model.LaptopInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public class Laptoprepo {

    public List<LaptopInfo> findByPriceLessThanEqual(double budget) {
        return null;
    }

    @Repository
    public interface LaptopRepository extends JpaRepository<LaptopInfo, Long> {

        // Method to find laptops by price less than or equal to a specific budget
        List<LaptopInfo> findByPriceLessThanEqual(double budget);

    }

}
