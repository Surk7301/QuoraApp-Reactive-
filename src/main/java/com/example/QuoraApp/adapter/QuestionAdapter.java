package com.example.QuoraApp.adapter;

import com.example.QuoraApp.dto.QuestionResponseDTO;
import com.example.QuoraApp.models.Questions;

public class QuestionAdapter {

    public static QuestionResponseDTO toQuestionResponseDTO(Questions questions){
        return QuestionResponseDTO.builder()
                .id(questions.getId())
                .title(questions.getTitle())
                .content(questions.getContent())
                .createdAt(questions.getCreatedAt())
                .build();
    }
}
