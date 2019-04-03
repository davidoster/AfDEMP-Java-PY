/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Spyros
 */
public class CustomerDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> fetchAll() {
        String sql = "Select * from Customers";
        List<Customer> customers = new ArrayList<Customer>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            Customer customer = new Customer();

            customers.add(customer);
        }

        return customers;

    }

    public List<Customer> findAll() {

        String sql = "SELECT * FROM CUSTOMERS";

        List<Customer> customers = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Customer.class));

        return customers;
    }

}
