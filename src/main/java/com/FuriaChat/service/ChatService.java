package com.FuriaChat.service;

import com.FuriaChat.menssage.ChatMessage;
import com.FuriaChat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    //Mapear de palavras-chave para respostas
    private final Map<String, String> responses;

    public ChatService(){
        responses = new HashMap<>();
        responses.put("novidades", "As últimas novidades da FURIA incluem vitórias incríveis e novos torneios!");
        responses.put("fundada", "A Furia foi fundada em 2017.");
        responses.put("criada", "A Furia foi fundada em 2017 por Jaime Pádua, André Akkari e Cris Guedes. Os três são cofundadores e co-CEOs da organização de esports.");
        responses.put("notícias", "Aqui estão as últimas notícias sobre FURIA: https://furia.gg/news");
        responses.put("foto", "Aqui está uma imagem do time FURIA: https://furia.gg/team-photo.png");
        responses.put("dono da furia", "A Furia foi fundada por Jaime Pádua, André Akkari e Cris Guedes em 2017. Os três são cofundadores e co-CEOs da organização de esports. Neymar também é presidente da FURIA e está envolvido na franquia da Kings League.");
        responses.put("jogadores de cs", "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.");
        responses.put("time de cs", "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.");
        responses.put("cs", "Os principais jogadores de CS da FURIA são: KSCERATO, yuurih, YEKINDAR, Fallen e outros grandes talentos.");
        responses.put("agenda", "A agenda da FURIA inclui torneios internacionais este mês. Fique ligado!");
        responses.put("torneios", "Os próximos torneios serão: BLAST Premier e ESL Pro League.");
        responses.put("valorant", "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!");
        responses.put("jogadores de valorant", "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!");
        responses.put("time da furia no valorant", "Os principais jogadores de Valorant da FURIA são: khalil, havoc, pryze, heat e raafa!");
        responses.put("contato", "Contato do Whatsapp: https://wa.me/5511993404466 da FURIA");
    }

    public String getResponse(String userMessage){
        //Busca a resposta correspondente à palavra-chave
        Optional<String> response = responses.entrySet()
                .stream()
                .filter(entry -> userMessage.toLowerCase().contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();
        //Retorna a resposta nao encontrada e/ou a mensagem padrão
        return response.orElse("Olá, fã da FURIA! Como posso ajudar?");
    }
}