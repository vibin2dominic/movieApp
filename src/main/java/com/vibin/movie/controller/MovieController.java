package com.vibin.movie.controller;

import com.vibin.movie.model.Movie;
import com.vibin.movie.model.TicketPrice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/movieplex")
public class MovieController {

//    @GetMapping("/showtimes")
//    public String showMainPage(){
//
//        return "index";
//    }


    @GetMapping("/movies")
    public String findAll(Model model){

        TicketPrice ticketPrice = new TicketPrice(5.00, 10.00);

        Movie movie = new Movie("Batman", "1 hr", "PG", "10:00 pm", "12:00 am", 10, ticketPrice);
        Movie movie2 = new Movie("Superman ", "1 hr 30 min", "PG-13", "3:00 pm", "8:30 pm", 10, ticketPrice);
        Movie movie3 = new Movie("Bad Boys ", "1 hr 15 min", "PG-13", "12:00 pm ", "6:00 pm", 10, ticketPrice);
        Movie movie4 = new Movie("Family Guy ", "2 hr 30 min", "PG-13", "9:00 pm", "10:30 pm", 10, ticketPrice);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        model.addAttribute("allMovies", movieList);

        return "index";

    }



}
