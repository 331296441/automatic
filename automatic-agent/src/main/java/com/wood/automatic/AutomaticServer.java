package com.wood.automatic;

import com.wood.automatic.common.constants.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomaticServer {
    public static void main(String[] args) {
        SpringApplication.run(AutomaticServer.class, args);
        System.out.println("启动成功");
        System.out.println(Constants.TAG);
    }
}
