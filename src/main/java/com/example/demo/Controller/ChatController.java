package com.example.demo.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ChatMessgage;

@RestController
@RequestMapping("/live/chat")
public class ChatController {
	
	@MessageMapping("/send")
    @SendTo("/topic/messages")
    public ChatMessgage sendMessage(@Payload ChatMessgage chatMessage) {
        // Save chat message to the database (optional)
        return chatMessage;
    }
}
