package com.example.caffeBardemo.entity;

import com.example.caffeBardemo.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
