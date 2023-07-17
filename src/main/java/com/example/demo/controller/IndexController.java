package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;

import org.springframework.ui.Model;

@Controller
public class IndexController {

    @Autowired
    MovieMapper movieMapper;

    @RequestMapping({"/"})
    public String index(Model model) {
        List<Movie> hotMovie=movieMapper.getHot();
        model.addAttribute("hotMovie", hotMovie);
        return "index";
    }
}
