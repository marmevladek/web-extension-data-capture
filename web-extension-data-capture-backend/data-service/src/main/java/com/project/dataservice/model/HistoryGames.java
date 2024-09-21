package com.project.dataservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "history")
@Getter
@Setter
@NoArgsConstructor
public class HistoryGames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "result")
    private float result;

    @Column(name = "number_of_passes_two")
    private int numberOfPassesTwo;

    private int numberOfPassesThree;

    private int numberOfPassesFour;

    private int numberOfPassesFive;

    private int numberOfPassesSix;

    private int numberOfPassesSeven;

    private int numberOfPassesEight;

    private int numberOfPassesNine;

    private int numberOfPassesTen;

    private int numberOfPassesTwenty;

    private int numberOfPassesThirty;

    private int numberOfPassesFourty;

    private int numberOfPassesFifty;

    private int numberOfPassesSixty;

    private int numberOfPassesSeventy;

    private int numberOfPassesEighty;

    private int numberOfPassesNinty;

    private int numberOfPassesOneHundred;

    private LocalDateTime fellOutAt;

    @PrePersist
    private void init() {
        fellOutAt = LocalDateTime.now();
    }

}
