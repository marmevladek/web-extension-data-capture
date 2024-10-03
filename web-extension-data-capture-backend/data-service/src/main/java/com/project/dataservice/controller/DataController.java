package com.project.dataservice.controller;

import com.project.dataservice.dto.DataDto;
import com.project.dataservice.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class DataController {
    private final DataService dataService;

    @PostMapping("/save")
    public void save(@RequestBody DataDto dataDto) {
        System.out.println(dataDto.toString());
        dataService.save(dataDto);
    }
}
