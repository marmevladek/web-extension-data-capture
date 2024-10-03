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
public class Data {

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

    private int numberOfPassesThousand;

    private LocalDateTime fellOutAt;

    public Data(float result, int numberOfPassesTwo, int numberOfPassesThree, int numberOfPassesFour, int numberOfPassesFive, int numberOfPassesSix, int numberOfPassesSeven, int numberOfPassesEight, int numberOfPassesNine, int numberOfPassesTen, int numberOfPassesTwenty, int numberOfPassesThirty, int numberOfPassesFourty, int numberOfPassesFifty, int numberOfPassesSixty, int numberOfPassesSeventy, int numberOfPassesEighty, int numberOfPassesNinty, int numberOfPassesOneHundred, int numberOfPassesThousand, LocalDateTime fellOutAt) {
        this.result = result;
        this.numberOfPassesTwo = numberOfPassesTwo;
        this.numberOfPassesThree = numberOfPassesThree;
        this.numberOfPassesFour = numberOfPassesFour;
        this.numberOfPassesFive = numberOfPassesFive;
        this.numberOfPassesSix = numberOfPassesSix;
        this.numberOfPassesSeven = numberOfPassesSeven;
        this.numberOfPassesEight = numberOfPassesEight;
        this.numberOfPassesNine = numberOfPassesNine;
        this.numberOfPassesTen = numberOfPassesTen;
        this.numberOfPassesTwenty = numberOfPassesTwenty;
        this.numberOfPassesThirty = numberOfPassesThirty;
        this.numberOfPassesFourty = numberOfPassesFourty;
        this.numberOfPassesFifty = numberOfPassesFifty;
        this.numberOfPassesSixty = numberOfPassesSixty;
        this.numberOfPassesSeventy = numberOfPassesSeventy;
        this.numberOfPassesEighty = numberOfPassesEighty;
        this.numberOfPassesNinty = numberOfPassesNinty;
        this.numberOfPassesOneHundred = numberOfPassesOneHundred;
        this.numberOfPassesThousand = numberOfPassesThousand;
        this.fellOutAt = fellOutAt;
    }
}
