package com.FuriaChat.controller;

import com.FuriaChat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String userMessage) {
        return chatService.getResponse(userMessage);
    }
}