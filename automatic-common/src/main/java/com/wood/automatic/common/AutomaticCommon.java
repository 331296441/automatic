package com.wood.automatic.common;

import com.wood.automatic.common.constants.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomaticCommon {
    public static void main(String[] args) {
        SpringApplication.run(AutomaticCommon.class, args);
        System.out.println("启动成功");
        System.out.println(Constants.TAG);
    }
}
