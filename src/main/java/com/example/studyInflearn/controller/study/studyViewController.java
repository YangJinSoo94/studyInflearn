package com.example.studyInflearn.controller.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class studyViewController {

    @GetMapping("nameform")
    public String main(Model model){
        return "/study/hello_inputName";
    }
}
