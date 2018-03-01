<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-md-3 single-right">
    <div class="w_sidebar">
        <section  class="sky-form">
            <h4>Catogories</h4>
            <div class="row1 scroll-pane">
                <div class="col col-4">
                    <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Accessories</label>
                </div>

                <div class="col col-4">	
                    <c:forEach var="car" items="${listCategory}" >
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i><a href="<%=request.getContextPath()%>/product/getAllCategogy.htm?categoryId=${car.categoryId}">${car.categoryName}</a></label>
                     </c:forEach>

                </div>
        </section>
        <section  class="sky-form">
            <h4>Brand</h4>
            <div class="row1 row2 scroll-pane">

                <div class="col col-4">
                    <c:forEach var="product" items="${listMaterial}">
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i><a href="<%=request.getContextPath()%>/product/getProductMaterial.htm?Material=${product.material}">${product.material}</a></label>
                    </c:forEach>

                </div>
            </div>
        </section>
        <section class="sky-form">
            <h4>Colour</h4>
            <ul class="w_nav2">
                <li><a class="color1" href="#"></a></li>
                <li><a class="color2" href="#"></a></li>
                <li><a class="color3" href="#"></a></li>
                <li><a class="color4" href="#"></a></li>
                <li><a class="color5" href="#"></a></li>
                <li><a class="color6" href="#"></a></li>
                <li><a class="color7" href="#"></a></li>
                <li><a class="color8" href="#"></a></li>
                <li><a class="color9" href="#"></a></li>
                <li><a class="color10" href="#"></a></li>
                <li><a class="color12" href="#"></a></li>
                <li><a class="color13" href="#"></a></li>
              

            </ul>
        </section>
        <section class="sky-form">
            <h4>Size</h4>
            <div class="row1 row2 scroll-pane">

                <div class="col col-4">
                    <c:forEach var="size" items="${listSize}">
                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i><a href="<%=request.getContextPath()%>/product/getProductSize.htm?Size=${size.size}">${size.size}</a></label>
                            </c:forEach>


                </div>
            </div>						
        </section>
        <section class="sky-form">
            <h4>Price</h4>
            <div class="row1 row2 scroll-pane">
                <div class="col col-4">
                    <label class="radio"><input type="radio" name="radio" checked=""><i></i>Above 200$<a href="<%=request.getContextPath()%>/product/getProductPrice.htm?Price=${1000}"></a></label>
                    <label class="radio"><input type="radio" name="radio"><i></i>above 400$</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>above 800$</label>
                </div>
                <div class="col col-4">
                    <label class="radio"><input type="radio" name="radio"><i></i>above 1200$</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>above 1400$</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>above 1600$</label>
                </div>
            </div>						
        </section>
    </div>
</div>