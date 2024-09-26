package com.project.notificationservice.service.impl;

import com.project.notificationservice.dto.DataDto;
import com.project.notificationservice.service.NotificationService;
import com.project.notificationservice.service.bot.TelegramBotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final TelegramBotService telegramBotService;

    @Override
    public void sendMessage() {
        telegramBotService.sendMessage(1397544955, "Hello world!");
    }

    @Override
    public void sendData(DataDto dataDto) {
        telegramBotService.sendMessage(1397544955, dataDto.getData());
    }
}
