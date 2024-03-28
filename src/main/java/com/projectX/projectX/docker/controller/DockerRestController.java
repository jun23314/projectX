package com.projectX.projectX.docker.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {
    @RequestMapping("/sample")
    public String docker() {
        return "docker sample";
    }

    @GetMapping("")
    public String test(){return "its test!";}
}
