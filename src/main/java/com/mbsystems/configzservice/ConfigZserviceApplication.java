package com.mbsystems.configzservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigZserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigZserviceApplication.class, args);
    }

}
