package com.wood.automatic.rockermq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

public class RocketMQProducer {
    @Resource
    private RocketMQTemplate rocketMQTemplate;
    private String topicName="test-message";

    public void sendMessage(){
        rocketMQTemplate.convertAndSend(topicName,"Hello World");
        rocketMQTemplate.send(topicName, MessageBuilder.withPayload("Hello World! from spring").build());
    }
}
