package com.project.notificationservice.service.bot;

import com.project.notificationservice.config.TelegramBotConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class TelegramBotService extends TelegramLongPollingBot {

    private final TelegramBotConfig telegramBotConfig;

    public TelegramBotService(@Value("${bot.token}") String botToken, TelegramBotConfig telegramBotConfig) {
        super(botToken);
        this.telegramBotConfig = telegramBotConfig;
    }

    @Override
    public String getBotUsername() {
        return telegramBotConfig.getBotName();
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

    public void sendMessage(long chatId, String text) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(chatId)
                .text(text)
                .build();

        executeMessage(sendMessage);
    }

    public void executeMessage(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
