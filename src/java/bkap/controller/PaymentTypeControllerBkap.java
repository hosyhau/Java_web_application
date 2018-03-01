/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.PaymentType;
import bkap.model.PaymentTypeModel;
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
@RequestMapping(value="/paymentType",method=RequestMethod.GET)
public class PaymentTypeControllerBkap {
    private PaymentTypeModel payment;
    public PaymentTypeControllerBkap()
    {
        payment= new PaymentTypeModel();
    }
    @RequestMapping(value="/getAllPT")
    public ModelAndView getAllPT()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/listPaymentType");
        List<PaymentType>listPaymentType = payment.getAllPaymentType();
        model.addObject("listPaymentType",listPaymentType);
        return model;
    }
    @RequestMapping(value = "/initInsertPaymentType")
    public ModelAndView initInsertPaymentType(){
        ModelAndView model = new ModelAndView("BackEndBkap/paymentType_Insert");
        PaymentType pm = new PaymentType();
        model.getModelMap().put("newPaymentType", pm);
        return model;
    }
    
    @RequestMapping(value = "/insertPaymentType")
    public String insertPaymentType(@ModelAttribute("newPaymentType") PaymentType pm){
        boolean check = payment.insertPaymentType(pm);
        if (check) {
            return "redirect:getAllPT.htm";
        } else {
            return "newPaymentType";
        }
    }
    
    @RequestMapping(value = "/initUpdatePaymentType", method = RequestMethod.GET)
    public ModelAndView initUpdatePaymentType(@RequestParam("paymentTypeID") String paymenID){
        ModelAndView model = new ModelAndView("BackEndBkap/paymentType_Update");
        PaymentType pm = payment.getPaymentTypeByID(paymenID);
        model.addObject("updatePaymentType", pm);
        return model;
    }
    
    @RequestMapping(value = "/updatePaymentType", method = RequestMethod.GET)
    public String updatePaymentType(@ModelAttribute("updatePaymentType") PaymentType pm){
        boolean check = payment.updatePaymentType(pm);
        if (check) {
            return "redirect:getAllPT.htm";
        } else {
            return "updatePaymentType";
        }
    }
    @RequestMapping(value = "/deletePaymentType")
    public String updatePaymentType(@RequestParam("paymentTypeID") String paymentTypeID){
        boolean check = payment.deletePaymentType(paymentTypeID);
        if (check) {
            return "redirect:getAllPT.htm";
        } else {
            return "error";
        }
    }
}
