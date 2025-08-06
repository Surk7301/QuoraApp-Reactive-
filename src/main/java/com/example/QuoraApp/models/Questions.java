package com.example.QuoraApp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Questions {
    private String id;

    @NotBlank(message= "Title is required")
    private String title;
    
    private String authorId;
}
