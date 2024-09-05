package com.wood.automatic.handler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class XXLJobHandlerTry {

    @XxlJob("xxlTest")
    public void helloWorld(){
        XxlJobHelper.log("xxl Job Hello World!");
        log.info("xxl Job Hello World!");
    }
}
