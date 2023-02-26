package nus.iss.tfip.ssf.day12._ssfworkshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping(path={"/home", "/index"})
public class HomeController {

  @GetMapping()
  public String home(Model model) {

    Calendar cal = Calendar.getInstance();

    model.addAttribute("currTime", new Date().toString());
    model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));

    return "index";
  }  
}
