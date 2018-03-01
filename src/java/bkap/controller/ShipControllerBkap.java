/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.Ship;
import bkap.model.ShipModel;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping(value="/ship",method=RequestMethod.GET)
public class ShipControllerBkap {
    private ShipModel shipModel;
    public ShipControllerBkap()
    {
        shipModel = new ShipModel();
    }
    @RequestMapping(value="/getAllS")
    public ModelAndView getAllS()
    {
        ModelAndView model = new ModelAndView("/listShip");
        List<Ship>listShip = shipModel.getAllShip();
        model.addObject("listShip", listShip);
        return model;
    }
}
