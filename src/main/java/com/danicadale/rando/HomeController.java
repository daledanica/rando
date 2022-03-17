package com.danicadale.rando;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;



@RestController
public class HomeController {


    /**
     * Get new instance of Java's standard random number generator
     */
    private static final Random rand = new Random();



    @GetMapping(value = "/")
    public String root() {

        return "Hello, welcome to danica's REST microservice";
    }



    @GetMapping(value = "/random")
    public RandomNumber getRandom() {

        return new RandomNumber(rand.nextInt(11));
    }



    @GetMapping(value = "/random/{upperLimit}")
    public RandomNumber getRandom(@PathVariable(value = "upperLimit") int upperLimit) {

        return new RandomNumber(rand.nextInt(upperLimit + 1));
    }


}
