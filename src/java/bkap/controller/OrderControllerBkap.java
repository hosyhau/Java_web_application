/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.Order;
import bkap.model.OrderModel;
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
@RequestMapping(value="/order",method=RequestMethod.GET)
public class OrderControllerBkap {
    private OrderModel orderModel;
    public OrderControllerBkap()
    {
        orderModel = new OrderModel();
    }
    @RequestMapping(value="/getAllO")
    public ModelAndView getAllO()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/listOrder");
        List<Order>listOrder= orderModel.getAllOrder();
        model.addObject("listOrder", listOrder);
        return model;
    }
    
    @RequestMapping(value="/initUpdateOrder")
    public ModelAndView initUpdate(@RequestParam("orderId")String orderId)
    {
        ModelAndView model= new ModelAndView("BackEndBkap/order_Update");
        Order order = orderModel.getOrderById(orderId);
        model.addObject("updateOrder", order);
        return model;
    }
    @RequestMapping(value="/updateOrder")
    public String updateOrder(@ModelAttribute("updateOrder")Order order)
    {
        boolean check=orderModel.updateOrder(order);
        if (check)
        {
            return "redirect:getAllO.htm";
        }
        else {
            return "updateOrder";
        }
    }
    @RequestMapping(value="/deleteOrder")
    public String deleteOrder(@RequestParam("orderId")String orderId)
    {
        boolean check=orderModel.deleteOrder(orderId);
        if (check)
        {
            return "redirect:getAllO.htm";
        }
        else {
            return "erro";
        }
    }
    
}
