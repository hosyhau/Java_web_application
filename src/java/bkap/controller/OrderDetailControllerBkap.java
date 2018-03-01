/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.OrderDetail;
import bkap.model.OrderDetailModel;
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
@RequestMapping(value="/orderDetail",method=RequestMethod.GET)
public class OrderDetailControllerBkap {
    private OrderDetailModel orderModel;
    public OrderDetailControllerBkap()
    {
        orderModel = new OrderDetailModel();
    }
    @RequestMapping(value="/getAllOD")
    public ModelAndView getAllOD()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/listOrderDetail");
        List<OrderDetail>listOrderDetail=orderModel.getAllOrderDetail();
        model.addObject("listOrderDetail", listOrderDetail);
        return model;
    }
    @RequestMapping(value="/initInsertOrderDetail")
    public ModelAndView initInsertOrderDetail()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/newOrderDetail");
        OrderDetail newOrderDetail = new OrderDetail();
        model.getModelMap().put("newOrderDetail", newOrderDetail);
        return model;
    }
    @RequestMapping(value="/insertOrderDetail")
    public String insertOrderDetail(@ModelAttribute("insertOrderDetail")OrderDetail orderDetail)
    {
        boolean check= orderModel.insertOrderDetail(orderDetail);
        if (check)
        {
            return "redirect:getAllOD.htm";
        }
        else {
            return "newOrderDetail";
        }
    }
    @RequestMapping(value="/initUpdateOrderDetail")
    public ModelAndView initUpdateOrderDetail(@RequestParam("orderId,productId")String orderId,String productId)
    {
        ModelAndView model = new ModelAndView("BackEndBkap/orderDetail_update");
        OrderDetail updateOrderDetail= orderModel.getOrderDetailById(orderId, productId);
        model.addObject("updateOrderDetail", updateOrderDetail);
        return model;
    }
    @RequestMapping(value="/updateOrderDetail")
    public String updateOrderDetail(@ModelAttribute("updateOrderDetail")OrderDetail orderDetail)
    {
        boolean check= orderModel.updateOrderDetail(orderDetail);
        if (check)
        {
            return "redirect:getAllOD.htm";
        }
        else {
            return "orderDetail_update";
        }
    }
    @RequestMapping(value="/deleteOrderDetail")
    public String deleteOrderDetail(@RequestParam("orderId,productId")String orderId,String productId)
    {
        boolean check= orderModel.deleteOrderDetail(orderId, productId);
        if (check)
        {
            return "redirect:getAllOD.htm";
        }
        else {
            return "404Page";
        }
    }
}
