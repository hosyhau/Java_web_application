/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.User;
import bkap.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping(value="/register",method=RequestMethod.GET)
public class UserController {
    private UserModel userModel;

    public UserController() {
        userModel = new UserModel();
    }
    @RequestMapping(value="/initInsertUser")
    public ModelAndView initInsertUser() 
    {
        ModelAndView model = new ModelAndView("FrontEnd/Register");
        User Register = new User();
        model.getModelMap().put("Register", Register);
        return model;
    }
    @RequestMapping(value="/insertUser")
    public String insertUser(@ModelAttribute("Register")User user)
    {
        boolean check= userModel.insertUser(user);
        if (check)
        {
            return "FrontEnd/welcome";
        }
        else {
            return "FrontEnd/Register";
        }
    }    
}
