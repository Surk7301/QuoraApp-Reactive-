package com.example.QuoraApp.models;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

public class Answers {

    @Id
    private String id;

    @NotBlank
    private String content;
}
