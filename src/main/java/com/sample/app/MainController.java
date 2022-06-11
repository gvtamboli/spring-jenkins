package com.sample.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/info")
    public String getMessage(){
        return "App is running on port:"+port;
    }

}
