package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;

@Controller
public class ManageController {

    @Autowired
    MovieMapper movieMapper;

    @RequestMapping({"/manage"})
    public String manage(Model model){
    List<Movie> movies=movieMapper.getAll();
    model.addAttribute("movies",movies);
    return "manage";
    }
}
