package com.gk.ms.hs.consumer_service.listener;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component

public class MessageListener {


    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @JmsListener(destination = "sample-queue")
    @JmsListener(destination = "new") @JmsListener(destination = "config-queue")
    public void listen(String message) {

        log.info("Received message: {}", message);
    }

}
