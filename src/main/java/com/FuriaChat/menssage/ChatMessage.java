package com.FuriaChat.menssage;
import com.FuriaChat.menssage.ChatMessage;

public class ChatMessage {
    private String userMessage;
    private String botResponse;

    // Construtores
    public ChatMessage() {}

    public ChatMessage(String userMessage, String botResponse) {
        this.userMessage = userMessage;
        this.botResponse = botResponse;
    }

    // Getter e Setter para userMessage
    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    // Getter e Setter para botResponse
    public String getBotResponse() {
        return botResponse;
    }

    public void setBotResponse(String botResponse) {
        this.botResponse = botResponse;
    }

}