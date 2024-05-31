package com.wood.automatic.rockermq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class RocketMQProducer {
    @Resource
    private RocketMQTemplate rocketMQTemplate;
    private String topicName="test-message";

//    @Scheduled(cron ="* * * * * ?")
    public void sendMessage(){
        rocketMQTemplate.convertAndSend(topicName,"Hello World");
        rocketMQTemplate.send(topicName, MessageBuilder.withPayload("Hello World! from spring").build());
    }
}
