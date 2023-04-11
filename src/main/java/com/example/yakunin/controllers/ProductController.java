package com.example.yakunin.controllers;

import com.example.yakunin.models.Product;
import com.example.yakunin.services.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RequiredArgsConstructor для того, чтобы productService работал. productService хранит, удаляет, добавляет новые продукты
@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/")
    public String product(@RequestParam(name = "title", required = false) String title, Model model){
        model.addAttribute("products", productService.listProducts(title));
        return "products";
    }
    //PostMapping for taking data from forms in html file
    //Берет из Product все значения полей, вызываем метод saveProduct из productService и сохраняем в List
    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }
    //Переходим по ссылке на товар, берем значение айди товара и удаляем его из List products по id
    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";

    }
    //подробное описание товара, динамическая ссылка по айди и кнопка удаления товара
    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }
}
