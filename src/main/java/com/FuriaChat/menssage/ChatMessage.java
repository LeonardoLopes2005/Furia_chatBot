package com.FuriaChat.menssage;
import com.FuriaChat.menssage.ChatMessage;

public class ChatMessage {
    private String userMessage;
    private String botResponse;

    public ChatMessage() {}

    public ChatMessage(String userMessage, String botResponse) {
        this.userMessage = userMessage;
        this.botResponse = botResponse;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getBotResponse() {
        return botResponse;
    }

    public void setBotResponse(String botResponse) {
        this.botResponse = botResponse;
    }

}