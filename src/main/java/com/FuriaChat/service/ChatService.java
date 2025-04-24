package com.FuriaChat.service;

import com.FuriaChat.menssage.ChatMessage;
import com.FuriaChat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    public String getResponse(String userMessage) {
        String botResponse = "Olá, fã da FURIA! Como posso ajudar?";
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setUserMessage(userMessage);
        chatMessage.setBotResponse(botResponse);
        chatRepository.save(chatMessage);
        return botResponse;
    }
}
