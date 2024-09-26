package com.project.notificationservice.service;


import com.project.notificationservice.dto.DataDto;

public interface NotificationService {

    void sendMessage();

    void sendData(DataDto dataDto);
}
