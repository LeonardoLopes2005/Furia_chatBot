package com.FuriaChat.repository;

import com.FuriaChat.menssage.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<ChatMessage, String> {
}
