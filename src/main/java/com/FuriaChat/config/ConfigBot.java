package com.FuriaChat.config;

import com.FuriaChat.bot.TelegramBotConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class ConfigBot {

    @Bean
    public TelegramBotsApi telegramBotsApi(TelegramBotConfig telegramBotConfig) throws Exception {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(telegramBotConfig);
        return telegramBotsApi;
    }
}
