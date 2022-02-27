package main;

import Config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ProductService productService = context.getBean(ProductService.class);
        productService.addNewProduct();

    }
}