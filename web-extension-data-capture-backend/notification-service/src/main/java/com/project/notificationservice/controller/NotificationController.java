package com.project.notificationservice.controller;

import com.project.notificationservice.dto.DataDto;
import com.project.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/message")
    public void sendMessage() {
        notificationService.sendMessage();
    }

    @PostMapping("/sendData")
    public Map<String, Object> sendData(@RequestBody Map<String, Object> data) {

        System.out.println(data.get("title"));

        DataDto dataDto = new DataDto(
                (String) data.get("title")
        );

        notificationService.sendData(dataDto);
        return Map.of("status", "success", "receivedData", data);
    }
}
