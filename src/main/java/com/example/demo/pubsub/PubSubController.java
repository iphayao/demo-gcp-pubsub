package com.example.demo.pubsub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PubSubController {
    private final PubSubOutboundGateway outboundGateway;

    public PubSubController(PubSubOutboundGateway outboundGateway) {
        this.outboundGateway = outboundGateway;
    }

    @PostMapping("/publishMessage")
    public String pubsubMessage(@RequestParam("message") String message) {
        log.info("Publish message: {}", message);
        outboundGateway.sendToPubSub(message);
        return "Published";
    }
}
