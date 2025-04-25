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
        String botResponse;

        // Lógica baseada em palavras-chave
        if (userMessage.toLowerCase().contains("novidades")) {
            botResponse = "As últimas novidades da FURIA incluem vitórias incríveis e novos torneios!";
        } else if (userMessage.toLowerCase().contains("jogadores de cs")) {
            botResponse = "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.";
        }else if (userMessage.toLowerCase().contains("time da furia no cs")) {
            botResponse = "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.";
        } else if (userMessage.toLowerCase().contains("agenda")) {
            botResponse = "A agenda da FURIA inclui torneios internacionais este mês. Fique ligado!";
        } else if (userMessage.toLowerCase().contains("jogadores de valorant")) {
            botResponse = "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!";
        }else if (userMessage.toLowerCase().contains("time da furia no valorant")) {
            botResponse = "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!";
        } else {
            botResponse = "Olá, fã da FURIA! Como posso ajudar?";
        }

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setUserMessage(userMessage);
        chatMessage.setBotResponse(botResponse);
        chatRepository.save(chatMessage);
        return botResponse;
    }
}
