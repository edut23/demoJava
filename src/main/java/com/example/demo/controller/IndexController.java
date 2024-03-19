package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class IndexController {
    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity init(@RequestParam(value = "nome", defaultValue = "none") String nome){
        System.out.println("O param:" + nome);

        return new ResponseEntity("Ola:" + nome, HttpStatus.OK);
    }
}
