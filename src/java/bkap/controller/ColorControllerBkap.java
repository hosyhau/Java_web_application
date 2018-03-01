/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.Color;
import bkap.model.ColorModel;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping(value="/color",method=RequestMethod.GET)
public class ColorControllerBkap {
    private ColorModel colorModel;
    public ColorControllerBkap()
    {
        colorModel = new ColorModel();
    }
    @RequestMapping(value="/getAllCo")
    public ModelAndView getAllCo()
    {
        ModelAndView model = new ModelAndView("/listColor");
        List<Color>listColor= colorModel.getAllColor();
        model.addObject("listColor", listColor);
        return model;
    }
    @RequestMapping(value = "/initInsertColor")
    public ModelAndView initInsertColor() {
        ModelAndView model = new ModelAndView("/color_Insert");
        Color cl = new Color();
        model.getModelMap().put("newColor", cl);
        return model;
    }

    @RequestMapping(value = "/insertColor")
    public String insertColor(@ModelAttribute("newColor") Color cl) {
        boolean check = colorModel.insertColor(cl);
        if (check) {
            return "redirect:getAllCo.htm";
                    
        } else {
            return "newColor";
        }
    }
    
    @RequestMapping(value = "/initUpdateColor")
    public ModelAndView initInsertColor(@RequestParam("colorID") String colorID){
        ModelAndView model = new ModelAndView("/color_Update");
        Color cl = colorModel.getColorByID(colorID);
        model.addObject("updateColor", cl);
        return model;
    }
    
    @RequestMapping(value = "/updateColor")
    public String updateColor(@ModelAttribute("updateColor") Color cl) {
        boolean check = colorModel.updateColor(cl);
        if (check) {
            return "redirect:getAllCo.htm";
                    
        } else {
            return "updateColor";
        }
    }
    @RequestMapping(value = "/deleteColor")
    public String updateColor(@RequestParam("colorID") String colorID) {
        boolean check = colorModel.deleteColor(colorID);
        if (check) {
            return "redirect:getAllCo.htm";
                    
        } else {
            return "error";
        }
    }
}
