package com.example.demo.pubsub;

import org.springframework.integration.annotation.MessagingGateway;

import static com.example.demo.pubsub.Constants.PUBSUB_OUTPUT_CHANNEL;

@MessagingGateway(defaultRequestChannel = PUBSUB_OUTPUT_CHANNEL)
public interface PubSubOutboundGateway {
    void sendToPubSub(String text);
}
