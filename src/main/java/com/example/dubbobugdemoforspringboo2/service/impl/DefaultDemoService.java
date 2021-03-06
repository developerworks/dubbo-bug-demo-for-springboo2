package com.example.dubbobugdemoforspringboo2.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbobugdemoforspringboo2.service.DemoService;

@Service(
    version = "1.0.0",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
