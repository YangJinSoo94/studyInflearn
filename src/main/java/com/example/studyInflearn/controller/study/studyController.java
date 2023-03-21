package com.example.studyInflearn.controller.study;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import org.apache.tomcat.util.net.TLSClientHelloExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studyController {

    @RequestMapping("/printname")
    public String printName(HttpServletRequest request, Model model){
        model.addAttribute("name", request.getParameter("name"));
        return "/study/hello_name";
    }

    @GetMapping("apitest1")
    @ResponseBody   // http의 body를 직접 넣어주겠다는 어노테이션
    public String apitest(@RequestParam("name") String name){
        return "hello "+name;
    }

    @GetMapping("apitest2")
    @ResponseBody
    public Hello apitest2(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
