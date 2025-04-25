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
        // Lógica baseada em palavras-chave
        if (userMessage.toLowerCase().contains("novidades")) {
            return  "As últimas novidades da FURIA incluem vitórias incríveis e novos torneios!";
        }else if (userMessage.toLowerCase().contains("notícias")) {
            return "Aqui estão as últimas notícias sobre FURIA: https://furia.gg/news";
        } else if (userMessage.toLowerCase().contains("foto")) {
            return "Aqui está uma imagem do time FURIA: https://furia.gg/team-photo.png";
        } else if (userMessage.toLowerCase().contains("dono da furia")) {
            return  "A Furia foi fundada por Jaime Pádua, André Akkari e Cris Guedes em 2017. Os três são cofundadores e co-CEOs da organização de esports. Neymar também é presidente da FURIA e está envolvido na franquia da Kings League. ";
        }else if (userMessage.toLowerCase().contains("jogadores de cs")) {
            return  "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.";
        }else if (userMessage.toLowerCase().contains("time de cs")) {
            return  "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.";
        } else if (userMessage.toLowerCase().contains("cs")) {
            return  "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.";
        } else if (userMessage.toLowerCase().contains("agenda")) {
            return  "A agenda da FURIA inclui torneios internacionais este mês. Fique ligado!";
        }else if (userMessage.toLowerCase().contains("torneios")) {
            return  "Os próximos torneios serão: BLAST Premier e ESL Pro League.";
        }else if (userMessage.toLowerCase().contains("valorant")) {
            return  "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!";
        } else if (userMessage.toLowerCase().contains("jogadores de valorant")) {
            return  "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!";
        }else if (userMessage.toLowerCase().contains("time da furia no valorant")) {
            return  "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!";
        } else {
            return   "Olá, fã da FURIA! Como posso ajudar?";
        }
    }
}
