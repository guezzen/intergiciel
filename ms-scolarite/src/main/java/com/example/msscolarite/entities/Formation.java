package com.example.msscolarite.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation {
    Long idFormation;
    String name;
    Date duree;
}
