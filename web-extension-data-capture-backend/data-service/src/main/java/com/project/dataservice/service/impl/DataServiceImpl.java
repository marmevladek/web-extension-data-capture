package com.project.dataservice.service.impl;

import com.project.dataservice.dto.DataDto;
import com.project.dataservice.mapping.DataMapping;
import com.project.dataservice.repository.DataRepository;
import com.project.dataservice.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {
    private final DataRepository dataRepository;

    public void save(DataDto dataDto) {
        dataRepository.save(DataMapping.mapToData(dataDto));
    }
}
