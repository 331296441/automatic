package com.wood.automatic.rockermq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
//@RocketMQMessageListener(topic="test-message",consumerGroup ="my-group")
public class RocketMQConsumer implements RocketMQListener<String> {


    @Override
    public void onMessage(String o) {
        log.info("收到MQ消息，内容是：{}",o);
    }
}
