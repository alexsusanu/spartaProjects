package com.sparta.simplerest.controllers;

import com.sparta.simplerest.model.CalcParams;
import com.sparta.simplerest.model.CalcResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    @GetMapping(value = "/sayhello")
    public String sayHello(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer id){
        return "Hello " + firstName + " " + lastName + " " + id;
    }

    @GetMapping(value = "/add")
    @ResponseBody
    @ResponseStatus(code= HttpStatus.I_AM_A_TEAPOT)
    public CalcResult add(@RequestParam Integer param1, @RequestParam Integer param2){
        // can also return a ResponseEntity
        CalcResult result = new CalcResult(param1, param2, param1 + param2, "add");
        return result;
    }

    @PostMapping("/add")
    public CalcResult addPost(@RequestBody CalcParams params){
        CalcResult result = new CalcResult(params.getParam1(), params.getParam2(),
                params.getParam1() + params.getParam2(), "add");
        return result;
    }

    @GetMapping("/add/{p1}/{p2}")
    public CalcResult addURL(@PathVariable Integer p1, @PathVariable Integer p2){
        CalcResult result = new CalcResult(p1, p2, p1 + p2, "add");
        return result;
    }
}
