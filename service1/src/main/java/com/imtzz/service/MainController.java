package com.imtzz.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TZZ
 */
@RestController
public class MainController {

    @RequestMapping(value = "/")
    public String index() {
        return "This is service1.";
    }
}
