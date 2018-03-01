/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.User;
import bkap.model.UserModel;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
    private UserModel userModel;
    public LoginController()
    {
        userModel = new UserModel();
    }
    @RequestMapping(value="/initLogin", method = RequestMethod.GET)
    public String login(ModelMap mm)
    {
        mm.put("user", new User());
        return "FrontEnd/Login";
    }
    @RequestMapping(value="/Login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, ModelMap mm, HttpSession session) {
        
        UserModel userModel = new UserModel();
        boolean check = userModel.checkLogin(user.getEmail(), user.getPassWord());
        if (check) {
            session.setAttribute("email", user.getEmail());
                return "FrontEnd/welcome";
        } else {
            mm.put("message", "Please Check your Email or Password<br>");
            return "FrontEnd/Login";
        }
    }
}
