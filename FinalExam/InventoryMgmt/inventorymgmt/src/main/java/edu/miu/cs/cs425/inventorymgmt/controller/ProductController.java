package edu.miu.cs.cs425.inventorymgmt.controller;

import edu.miu.cs.cs425.inventorymgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/inventorymgmt/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping (value = "/list")
    public ModelAndView displayAllProducts(){
        var modelAndView = new ModelAndView();
        modelAndView.addObject("products", productService.getAllProductsSorted());
        modelAndView.setViewName("product/list");
        return modelAndView;
    }
}
