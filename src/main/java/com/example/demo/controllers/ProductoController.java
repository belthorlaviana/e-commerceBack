package com.example.demo.controllers;

import com.example.demo.dao.Producto;
import com.example.demo.services.ProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("productos")
public class ProductoController {

    @Autowired
    private ProductoServices productoService;

    @GetMapping("/getProducto")
    public Producto getProducto() {
        return productoService.getProducto();
    }

    @GetMapping("/getAllProductos")
    public ArrayList<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }


}
