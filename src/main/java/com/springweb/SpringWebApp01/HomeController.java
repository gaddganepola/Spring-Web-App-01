package com.springweb.SpringWebApp01;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
//        int result= num1 + num2;
////        System.out.println(result);
//        session.setAttribute("result", result);
//        return "add.jsp";
//    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
        int result= num + num2;
        session.setAttribute("result", result);
        return "add.jsp";
    }

//    It also supports without session
//    @RequestMapping("add")
//    public String add(HttpServletRequest req) {
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
//        int result= num1 + num2;
//        req.setAttribute("result", result);
//        return "add.jsp";
//    }
}
