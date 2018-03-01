/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.Cart;
import bkap.model.ProductModel;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
@RequestMapping(value = "/display")
public class CartController {
    private ProductModel productModel;

    public CartController() {
        productModel = new ProductModel();
    }
   @RequestMapping(value = ("/showCart") , method = RequestMethod.GET)
   public String showCart()
   {
       return "FrontEnd/cart";
   }
    @RequestMapping(value = "/addCart", method = RequestMethod.GET)
    public ModelAndView addCart(@RequestParam("productId")String productId, HttpSession session) {
        ModelAndView model = new ModelAndView("FrontEnd/cart");
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        if(listCart==null){
            // case chưa có dsach nào add luôn sp vao cart được chọn
            listCart = new ArrayList<>();
            listCart.add(new Cart(productModel.getProductById(productId), 1));
        }else{
            boolean flag = false;
            for(Cart c : listCart){
                if(c.getProduct().getProductId().equals(productId)){
                    int a = c.getQuantity();
                    c.setQuantity(a+1);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                listCart.add(new Cart(productModel.getProductById(productId), 1));
            }
        }
        session.setAttribute("listCart", listCart);
        session.setAttribute("total", getTotal(listCart));
        session.setAttribute("totalProduct", getTotalProduct(listCart));
        return model;
    }
    //     kiem tra sp co ton tai k
    private int isExisTing(String productId,HttpSession session){
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        for (int i = 0; i < listCart.size(); i++)
            if(listCart.get(i).getProduct().getProductId()==productId)
                return i;
        return -1;
    }
    public double getTotal(List<Cart> listCart) {
        double total = 0;
        for (Cart cart : listCart) {
            total += cart.getQuantity() * cart.getProduct().getPriceExport();
        }
        return total;
    }
    public int getTotalProduct(List<Cart> listCart)
    {
        int total=0;
        for (Cart cart :listCart)
        {
            total=total+1;
        }
        return total;
    }
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public ModelAndView remove(@RequestParam("productId")String productId,HttpSession session){
        ModelAndView model = new ModelAndView("FrontEnd/cart");
        // lấy dssp session kh
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        if(listCart!=null){
            for(int i=0;i < listCart.size();i++){
                if(listCart.get(i).getProduct().getProductId().equals(productId)){
                    // neu sp ton tai thi remove
                    listCart.remove(i).getProduct().getProductId();
                    break;
                }
            }
        }
        // luu ds sp va tong tien
        session.setAttribute("listCart", listCart);
        session.setAttribute("total", getTotal(listCart));
         session.setAttribute("totalProduct", getTotalProduct(listCart));
        return model;
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(String productId,HttpServletRequest request,HttpSession session){
        ModelAndView model = new ModelAndView("FrontEnd/cart");
        // lay dssp khach hang trong session 
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        // lay danh sach sl san pham muon mua
        String[] arrQuantity = request.getParameterValues("quantity");
        
        for(int i=0; i < listCart.size();i++){
            listCart.get(i).setQuantity(Integer.parseInt(arrQuantity[i]));
            int sl = productModel.getProductById(productId).getQuantity();
//            if(Integer.parseInt(arrQuantity[i])>productModel.getProductById(productId).getQuantity()){
//                listCart.get(i).setQuantity(productModel.getProductById(productId).getQuantity());
//            }
            if(Integer.parseInt(arrQuantity[i])<1){
                listCart.get(i).setQuantity(1);
            }   
        }
        // luu ds sp va tong tien
        session.setAttribute("listCart", listCart);
        session.setAttribute("total", getTotal(listCart));
        return model;
    }
    
    @RequestMapping(value = "/decrement", method = RequestMethod.GET)
    public ModelAndView incrrment(@RequestParam("productId")String productId,HttpSession session){
        ModelAndView model = new ModelAndView("FrontEnd/cart");
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        for (Cart c : listCart) {
            if(c.getProduct().getProductId().equals(productId)){
                int a = c.getQuantity();
                c.setQuantity(a-1);  
            }
        }
                for (int i = 0; i < listCart.size(); i++) {
                    if(listCart.get(i).getQuantity()==0){
                       listCart.remove(i).getProduct().getProductId();   
                    }
                }
        session.setAttribute("listCart", listCart);
        session.setAttribute("total", getTotal(listCart));
        return model;
    }
    @RequestMapping(value = "/increment", method = RequestMethod.GET)
    public ModelAndView increment(@RequestParam("productId")String productId,HttpSession session){
        ModelAndView model = new ModelAndView("FrontEnd/cart");
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        for(Cart c : listCart){
            if(c.getProduct().getProductId().equals(productId)){
            int a = c.getQuantity();
            c.setQuantity(a+1);
            }
        }
        for(int i = 0; i < listCart.size(); i++){    
            if(listCart.get(i).getQuantity()>productModel.getProductById(productId).getQuantity()){
                listCart.get(i).setQuantity(productModel.getProductById(productId).getQuantity());
            }
        }
        session.setAttribute("listCart", listCart);
        session.setAttribute("total", getTotal(listCart));
        return  model;
    }
    @RequestMapping(value="/order")
    public ModelAndView order()
    {
        ModelAndView model= new ModelAndView("FrontEnd/order");
        return model;
    }

    
}
