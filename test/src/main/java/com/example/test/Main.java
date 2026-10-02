package com.example.test;

import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {
    public static void main(String[] args) {
        URI uri = URI.create("http://localhost:8080");

        ResourceConfig config = new ResourceConfig();

        config.register(HelloResource.class);

        HttpServer httpServer = GrizzlyHttpServerFactory.createHttpServer(uri, config);

        System.out.println("server starting!!");

    }
}
