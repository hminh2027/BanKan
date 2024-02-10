package com.learnjava.BanKan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
@RequiredArgsConstructor
public class BoardController {

    @GetMapping("/hello")
    public String findAllBoards() {
        return "hello";
    }
}
