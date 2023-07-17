package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;

@Controller
public class DetailController {
    
    @Autowired
    MovieMapper movieMapper;

    @RequestMapping({"/detail/{id}"})
    public String detail(@PathVariable String id,Model model){
        Movie movie=movieMapper.getMovie(Integer.parseInt(id));
        model.addAttribute("movie",movie);
        return "details";
    }

    @RequestMapping({ "/save" })
    public String save(@RequestParam("name") String name, @RequestParam("hot") String hot,@RequestParam("img") String img,
    @RequestParam("info") String info, @RequestParam("profile") String profile, @RequestParam("site") String site) {
        Movie movie=new Movie(name, Integer.parseInt(hot), img, info, profile, site);
        movieMapper.insert(movie);
        return "redirect:/manage";
    }

        @RequestMapping({"/search"})
    public String search(@RequestParam("name") String name,Model model){
        List<Movie> movies=movieMapper.getSearch(name);
        model.addAttribute("movies",movies);
        return "search";
    }

        @RequestMapping({"/update"})
    public String update(@RequestParam("name") String name, @RequestParam("hot") String hot,@RequestParam("img") String img,
    @RequestParam("info") String info, @RequestParam("profile") String profile, @RequestParam("site") String site){
        Movie movie=new Movie(name, Integer.parseInt(hot), img, info, profile, site);
        movieMapper.update(name, movie);
        return "redirect:/manage";
    }

        @RequestMapping({"/delete/{name}"})
    public String detail(@PathVariable String name){
        movieMapper.delete(name);
        return "redirect:/manage";
    }
}
