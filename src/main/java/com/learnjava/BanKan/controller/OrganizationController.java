package com.learnjava.BanKan.controller;

import com.learnjava.BanKan.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    @GetMapping("")
    public String getOrgById() {
        throw new ResourceNotFoundException("123");
    }
}
