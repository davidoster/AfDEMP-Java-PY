/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.CustomerDAO;
import com.model.Customer;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {

    @RequestMapping(value = ("/hello"), method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "This tis not Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping(value = ("/fetchcust"), method = RequestMethod.GET)
    public String fetch(ModelMap model) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/beans.xml");

        CustomerDAO dao = (CustomerDAO) ctx.getBean("cdao");
        List<Customer> slist = dao.findAll();
        model.addAttribute("message", "Model only");
        model.addAttribute("cust", slist);
        return "hello";
    }

    @RequestMapping(value = ("/fetchcustmv"), method = RequestMethod.GET)
    // @RequestMapping(value = ("/fetchcustmv/{username}/{lala}"), method = RequestMethod.GET)
    //@PathVariable("username") String name, @PathVariable("lala") String lala,
    public ModelAndView fetchMV(@RequestParam("myname") String name, ModelMap model) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/beans.xml");
        ModelAndView modelAndView = new ModelAndView("hello");

        CustomerDAO dao = (CustomerDAO) ctx.getBean("cdao");
        List<Customer> slist = dao.findAll();
        modelAndView.addObject("message", "Model and view");
        modelAndView.addObject("name", name);

        modelAndView.addObject("cust", slist);
        return modelAndView;
    }
}
