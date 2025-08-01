package com.springweb.SpringWebApp01;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
//        int result= num1 + num2;
//        System.out.println(result);
//        session.setAttribute("result", result);
//        return "add.jsp";
//    }

//    Use request parameters directly in controller instead of HttpServletRequest
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
//        int result= num + num2;
//        session.setAttribute("result", result);
//        return "add.jsp";
//    }

//    Use Model object instead of using session
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, int num2, Model model) {
//        int result= num + num2;
//        model.addAttribute("result", result);
//        return "add.jsp";
//    }

//    Remove the extension
//@RequestMapping("add")
//public String add(@RequestParam("num1") int num, int num2, Model model) {
//    int result= num + num2;
//    model.addAttribute("result", result);
//    return "add";
//}

//    Use Model and View Object
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
        int result= num + num2;
        mv.addObject("result", result);
        mv.setViewName("add");
        return mv;
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

    @RequestMapping("alien")
    public String getAlien() {
        return "alien";
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(int aid, String aname, ModelAndView mv) {
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("welcomeAlien");
//
//        return mv;
//    }

//    Use Model Attribute to assign request values to the object directly
//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@ModelAttribute Alien alien, ModelAndView mv) {
//
//        mv.addObject("alien", alien);
//        mv.setViewName("welcomeAlien");
//
//        return mv;
//    }

//    Remove model and view
    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
        return "welcomeAlien";
    }

    @ModelAttribute("course")
    public String course() {
        return "Java";
    }
}
