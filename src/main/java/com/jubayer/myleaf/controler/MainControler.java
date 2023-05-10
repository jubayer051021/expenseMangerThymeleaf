package com.jubayer.myleaf.controler;

import com.jubayer.myleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class MainControler {
    @GetMapping("/home")
    public String homePage(){
        return "home.html";
    }
    ArrayList<User> userList=new ArrayList<>();

    @PostMapping("/receive")
    public ModelAndView recieveData(@ModelAttribute User user, ModelAndView model){
      model.setViewName("success.html");
      model.addObject("user",user);
      userList.add(user);
      return model;
    }
    @GetMapping("/showall")
    public ModelAndView showDetailsPage(ModelAndView model){
        model.setViewName("showDetails.html");
        model.addObject("userList",userList);
        return model;
    }

}
