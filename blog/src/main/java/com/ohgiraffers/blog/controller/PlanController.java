package com.ohgiraffers.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanController {

    @GetMapping("/plan")
    public String plan() {
        return "plan/plan";
    }

    @GetMapping("/sub-plan")
    public String subplan() {
        return "plan/sub-plan";
    }

    @GetMapping("/map")
    public String map() {
        return "plan/map";
    }



}

