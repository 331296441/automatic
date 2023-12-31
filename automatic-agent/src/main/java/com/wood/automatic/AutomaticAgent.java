package com.wood.automatic;

import com.wood.automatic.common.constants.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomaticAgent {
    public static void main(String[] args) {
        SpringApplication.run(AutomaticAgent.class, args);
        System.out.println("启动成功");
        System.out.println(Constants.TAG);
    }
}
