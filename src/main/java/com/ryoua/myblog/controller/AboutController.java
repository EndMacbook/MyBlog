package com.ryoua.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ryoua Created on 2019-05-14
 */
@Controller
@RequestMapping("/about")
public class AboutController {
    @GetMapping
    public String about() {
        return "about";
    }
}
