/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.controller;

import bkap.entity.ImageLink;
import bkap.model.ImageLinkModel;
import java.io.File;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
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
@RequestMapping(value="/image")
public class ImageController {
    private ImageLinkModel imageModel;
    public ImageController()
    {
        imageModel = new ImageLinkModel();
    }
    @RequestMapping(value="/getAllI",method = RequestMethod.GET)
    public ModelAndView getALLI(@RequestParam("productID") String productID)
    {
        ModelAndView model= new ModelAndView("/listImage");
        List<ImageLink>listImageLink= imageModel.getAllImageLink(productID);
        model.addObject("listImageLink", listImageLink);
        return model;
    } 
    @RequestMapping(value = "/initInsertImageLink", method = RequestMethod.GET)
    public ModelAndView initInsertImageLink() {
        ModelAndView model = new ModelAndView("/imagelink_Insert");
        ImageLink newImageLink = new ImageLink();
        model.getModelMap().put("newImageLink", newImageLink);
        return model;
    }

    @RequestMapping(value = "/insertImageLink", method = RequestMethod.POST)
    public String insertImageLink(@ModelAttribute("newImageLink") ImageLink imageLink, HttpServletRequest request) {

        String path = request.getRealPath("/images");
        path = path.substring(0, path.indexOf("\\build"));
        path = path + "\\web\\images";
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload uploader = new ServletFileUpload(factory);
        try {
            List<FileItem> lst = uploader.parseRequest(request);
            for (FileItem fileItem : lst) {
                if (fileItem.isFormField() == false && fileItem.getName() != "") {
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString();
                    if (name.equals("URL")) {
                        //path
                        imageLink.setURL(fileItem.getName());
                        //upload to folder
                        fileItem.write(new File(path + "/" + fileItem.getName()));
                    } 
                } else {
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString();
                    if (name.equals("imageId")) {
                        imageLink.setImageId((value));
                    } 
                    else if (name.equals("description")) {
                        imageLink.setDescription(value);
                    } 
                    else if (name.equals("status")) {
                        imageLink.setStatus(Boolean.parseBoolean(value));
                    }
                    else if (name.equals("productId")) {
                        imageLink.setProductId(value);
                    } 
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        boolean check = imageModel.insertImageLink(imageLink);
        if (check) {
            return "redirect:getAllI.htm";
        } else {
            return "newImageLink";
        }
    }
    
    @RequestMapping(value = "/initUpdateImageLink", method = RequestMethod.GET)
    public ModelAndView initUpdateImageLink(@RequestParam("imageLinkID") String imageLinkID) {
        ModelAndView model = new ModelAndView("/imageLink_Update");
        ImageLink updateImageLink = imageModel.getImageLinkById(imageLinkID);
        model.addObject("updateImageLink", updateImageLink);
        return model;
    }

    @RequestMapping(value = "/updateImageLink", method = RequestMethod.POST)
    public String updateImageLink(@ModelAttribute("updateImageLink") ImageLink imageLink, HttpServletRequest request) {

        String path = request.getRealPath("/images");
        path = path.substring(0, path.indexOf("\\build"));
        path = path + "\\web\\images";
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload uploader = new ServletFileUpload(factory);
        try {
            List<FileItem> lst = uploader.parseRequest(request);
            for (FileItem fileItem : lst) {
                if (fileItem.isFormField() == false && fileItem.getName() != "") {
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString();
                    if (name.equals("URL")) {
                        //path
                        imageLink.setURL(fileItem.getName());
                        //upload to folder
                        fileItem.write(new File(path + "/" + fileItem.getName()));
                    } 
                } else {
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString();
                    if (name.equals("imageId")) {
                        imageLink.setImageId((value));
                    } 
                    else if (name.equals("description")) {
                        imageLink.setDescription(value);
                    } 
                    else if (name.equals("status")) {
                        imageLink.setStatus(Boolean.parseBoolean(value));
                    }
                    else if (name.equals("productId")) {
                        imageLink.setProductId(value);
                    } 
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        boolean check = imageModel.updateImageLink(imageLink);
        if (check) {
            return "redirect:getAllI.htm";
        } else {
            return "updateImageLink";
        }
    }
    
    @RequestMapping(value="/deleteImage")
    public String deleteImage(@RequestParam("imageLinkId")String imageLinkId)
    {
        boolean check=imageModel.deleteImageLink(imageLinkId);
        if (check)
        {
            return "redirect:getAllI.htm";
        }
        else {
            return "404Page";
        }
    }
}
