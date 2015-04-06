/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdl.bmaven.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hardinal
 */
@RestController
public class ProductController {
    @RequestMapping
    public String halo(){
        return "halo Dunia Hardinal";
    }
    
}
