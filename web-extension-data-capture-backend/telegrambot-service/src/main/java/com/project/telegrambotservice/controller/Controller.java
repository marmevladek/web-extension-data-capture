package com.project.telegrambotservice.controller;

import com.project.telegrambotservice.dto.MessageDto;
import com.project.telegrambotservice.service.TelegramBotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/telegrambot")
@RequiredArgsConstructor
public class Controller {

    private final TelegramBotService telegramBotService;

    @GetMapping("/message")
    public ResponseEntity<?> message() {
        telegramBotService.sendMessage(/* id */, "Hello world");
        return ResponseEntity.ok(new MessageDto("Hello World"));
    }
}
