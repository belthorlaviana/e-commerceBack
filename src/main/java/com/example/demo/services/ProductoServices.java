package com.example.demo.services;

import com.example.demo.dao.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ProductoServices {

    public Producto getProducto() {
        return new Producto("001", "xbox controller", "mando para xbox one", "videojuegos");
    }

    public ArrayList<Producto> getAllProductos() {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>() {{
            add(new Producto("001", "xbox controller", "mando para xbox one", "videojuegos"));
            add(new Producto("002", "ps4 controller", "mando para play station 4", "videojuegos"));
            add(new Producto("003", "wolfstein ,the new order", "videojuego para xbox one", "videojuegos"));
            add(new Producto("004", "fallout 4", "videojuego para xbox one", "videojuegos"));
            add(new Producto("005", "red dead redemtion", "videojuego para xbox one", "videojuegos"));
            add(new Producto("006", "the division", "videojuego para xbox one", "videojuegos"));
            add(new Producto("007", "batman arkham knigth", "videojuego para xbox one", "videojuegos"));
            add(new Producto("008", "project cars 2", "videojuego para xbox one", "videojuegos"));
            add(new Producto("009", "skyrim", "videojuego para pc", "videojuegos"));
            add(new Producto("010", "the evil withim", "videojuego para pc", "videojuegos"));
            add(new Producto("011", "dragon age inquisition", "mando para play station 4", "videojuegos"));
            add(new Producto("012", "sombras de mordor", "videojuego para play station 4", "videojuegos"));
            add(new Producto("013", "fifa 2021", "videojuego para play station 4", "videojuegos"));
        }};
        return listaProductos;
    }
}
