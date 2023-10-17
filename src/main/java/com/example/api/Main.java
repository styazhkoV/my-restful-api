package main.java.com.example.api;

import com.sun.net.httpserver.HttpServer;

import main.java.com.example.api.handlers.HelloWorldHandler;




import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Создайте обработчики для различных маршрутов
        server.createContext("/hello", new HelloWorldHandler());

        server.setExecutor(Executors.newFixedThreadPool(10));
        server.start();
    }
}

                    