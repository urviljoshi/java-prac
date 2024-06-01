package com.example.jp.j18;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpHandlers;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.Request;
import com.sun.net.httpserver.SimpleFileServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.util.function.Predicate;

public class SimpleHttpServEx {
    public static void main(String[] args) throws IOException {
        InetSocketAddress  inetSocketAddress = new InetSocketAddress(8888);
        Path p = Path.of("C:\\RTG\\ebooks");
        Predicate<Request> requestPredicate = request -> {
            return request.getRequestURI().getPath().equals("/hehe");
        };
        HttpHandler allowedResp = HttpHandlers.of(200, Headers.of("ALLOW","GET"),"welcome batman");
        HttpHandler denyResp = HttpHandlers.of(401, Headers.of("DENY","GET"),"get better");
        HttpHandler httpHandler = HttpHandlers.handleOrElse(requestPredicate,allowedResp,denyResp);
        Filter filter = SimpleFileServer.createOutputFilter(System.out, SimpleFileServer.OutputLevel.VERBOSE);
       /* HttpServer httpServer = SimpleFileServer.createFileServer(inetSocketAddress,p, SimpleFileServer.OutputLevel.VERBOSE);
        httpServer.createContext("/hehe",httpHandler);*/
        HttpServer httpServer = HttpServer.create(inetSocketAddress,10,"/hehe",httpHandler,filter);
        httpServer.start();

    }
}
