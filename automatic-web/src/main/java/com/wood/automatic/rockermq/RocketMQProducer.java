package com.wood.automatic.rockermq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RocketMQProducer {
    @Resource
    private RocketMQTemplate rocketMQTemplate;
    private String topicName="test-message";

    @Scheduled(cron ="* * * * * ?")
    public void sendMessage(){
        rocketMQTemplate.convertAndSend(topicName,"Hello World");
        rocketMQTemplate.send(topicName, MessageBuilder.withPayload("Hello World! from spring").build());
    }
}
