/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping(value="/home",method=RequestMethod.GET)
public class HomeController {
    @RequestMapping(value="/getHome")
    public ModelAndView getAll()
    {
        ModelAndView model= new ModelAndView("BackEndBkap/home");
        return model;
    }
    @RequestMapping(value="/page404")
    public ModelAndView page404()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/404Page");
        return model;
    }
    @RequestMapping(value="/fileUpload")
    public ModelAndView fileUpload()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/fileUpload");
        return model;
    }
    @RequestMapping(value="/calendar")
    public ModelAndView calendar()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/calendar");
        return model;
    }
    @RequestMapping(value="/forgotPassword")
    public ModelAndView forgotPassword()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/forgotPassword");
        return model;
    }
}
