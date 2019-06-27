package com.tz.order.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.kafka.core.KafkaTemplate;
/**
 * @author tanjianjun
 * @create 2019-01-28 16:02
 */
/**
 * 测试kafka生产者
 */
@RestController
@RequestMapping("kafka")
public class TestKafkaProducerController {
     @Autowired
     private KafkaTemplate<String, String> kafkaTemplate;
     @RequestMapping("send")
     public String send(String msg){
         for(int i=0;i<1000;i++){
             kafkaTemplate.send("test_topic", String.valueOf(i));
         }
         return "success";
     }
 }
