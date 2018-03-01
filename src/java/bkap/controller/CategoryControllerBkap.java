/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.Category;
import bkap.model.CategoryModel;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
@RequestMapping(value="/cate",method=RequestMethod.GET)
public class CategoryControllerBkap {
    private CategoryModel categoryModel;
    public CategoryControllerBkap(){
        categoryModel =new CategoryModel();
    }
    @RequestMapping(value="/getAllCate")
    public ModelAndView getAllC()
    {
        ModelAndView model= new ModelAndView("FrontEnd/listCategory");
        List<Category> listCategory = categoryModel.getAllCategory();
        model.addObject("listCategory", listCategory);
        return model;
    }
     @RequestMapping(value="/getAllC")
    public ModelAndView getAllCate()
    {
        ModelAndView model = new ModelAndView("BackEndBkap/listCategory");
        List<Category> listCategory= categoryModel.getAllCategory();
        model.addObject("listCategory", listCategory);
        return model;
    }
    @RequestMapping(value = "/initInsertCatalog")
    public ModelAndView initInsertCatalog() {
        ModelAndView model = new ModelAndView("BackEndBkap/catalog_Insert");
        Category newCatalog = new Category();
        model.getModelMap().put("newCatalog", newCatalog);
        return model;
    }

    @RequestMapping(value = "/insertCatalog")
    public String insertCatalog(@ModelAttribute("newCatalog")Category category)
    {
        boolean check=categoryModel.insertCategory(category);
        if (check)
        {
            return "redirect:getAllC.htm";
        }
        else {
            return "newCatalog";
        }
    }

    @RequestMapping(value = "/initUpdateCatalog",method = RequestMethod.GET)
    public ModelAndView initUpdateCatalog(@RequestParam("catalogID") String catalogID) {
        ModelAndView model = new ModelAndView("BackEndBkap/catalog_Update");
        Category updateCatalog = categoryModel.getCategoryById(catalogID);
        model.addObject("updateCatalog", updateCatalog);
        return model;
    }

    @RequestMapping(value = "/updateCatalog",method = RequestMethod.GET)
    public String updateCatalog(@ModelAttribute("updateCatalog") Category catalog,HttpServletRequest request) {
      boolean check = categoryModel.updateCategory(catalog);
        if (check) {
            return "redirect:getAllC.htm";
        } else {
            return "updateCatalog";
        }
    }
   @RequestMapping(value="/deleteCategory")
   public String deleteCategory(@RequestParam("categoryId")String categoryId)
   {
       boolean check= categoryModel.deleteCategory(categoryId);
       if (check)
       {
           return "redirect:getAllC.htm";
       }
       else {
           return "404Page";
       }
   }
    

}
