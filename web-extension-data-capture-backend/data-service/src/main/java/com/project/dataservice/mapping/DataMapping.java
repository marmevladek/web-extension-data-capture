package com.project.dataservice.mapping;

import com.project.dataservice.dto.DataDto;
import com.project.dataservice.model.Data;

import java.time.LocalDateTime;

public class DataMapping {

    public static Data mapToData(DataDto dataDto) {
        return new Data(
                dataDto.getResult(),
                dataDto.getNumberOfPassesTwo(),
                dataDto.getNumberOfPassesThree(),
                dataDto.getNumberOfPassesFour(),
                dataDto.getNumberOfPassesFive(),
                dataDto.getNumberOfPassesSix(),
                dataDto.getNumberOfPassesSeven(),
                dataDto.getNumberOfPassesEight(),
                dataDto.getNumberOfPassesNine(),
                dataDto.getNumberOfPassesTen(),
                dataDto.getNumberOfPassesTwenty(),
                dataDto.getNumberOfPassesThirty(),
                dataDto.getNumberOfPassesFourty(),
                dataDto.getNumberOfPassesFifty(),
                dataDto.getNumberOfPassesSixty(),
                dataDto.getNumberOfPassesSeventy(),
                dataDto.getNumberOfPassesEighty(),
                dataDto.getNumberOfPassesNinty(),
                dataDto.getNumberOfPassesOneHundred(),
                dataDto.getNumberOfPassesThousand(),
                LocalDateTime.now()
        );
    }
}
