package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;

@Controller
public class PanelController {
    
    @Autowired
    MovieMapper movieMapper;

    // @RequestMapping({"/savepanel"})
    // public String savepanel(){
    //     return "savepanel";
    // }

    @RequestMapping({"/updatepanel/{id}"})
    public String updatepanel(@PathVariable String id,Model model){
        Movie m=movieMapper.getMovie(Integer.parseInt(id));
        model.addAttribute("m",m);
        return "updatepanel";
    }
}
