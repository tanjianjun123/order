package com.tz.order.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author tanjianjun
 * @create 2019-01-28 16:25
 * kafka消费者测试
 */
@Component
public class TestConsumer {
    /**
     * 这里的消费者会监听这个主题，有消息就会执行，不需要进行while(true)
     * */
   /* @KafkaListener(topics = "test_topic")
    public void listen(ConsumerRecord<?, ?> record) throws Exception {
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }*/
}
