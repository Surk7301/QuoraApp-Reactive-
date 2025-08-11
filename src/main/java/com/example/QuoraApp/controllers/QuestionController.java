package com.example.QuoraApp.controllers;

import com.example.QuoraApp.dto.QuestionRequestDTO;
import com.example.QuoraApp.dto.QuestionResponseDTO;
import com.example.QuoraApp.services.IQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final IQuestionService questionService;
    @PostMapping
    public Mono<QuestionResponseDTO> createQuestion(@RequestBody QuestionRequestDTO questionRequestDTO){
        return questionService.createQuestion(questionRequestDTO)
                .doOnSuccess(response -> System.out.println("Question created successfully: "+ response))
                .doOnError(error -> System.out.println("Error in creating question: "+error));

    }

    @GetMapping("/{id}")
    public Flux<QuestionResponseDTO> getQuestionId(@PathVariable String id){
        throw new UnsupportedOperationException("Not implemented");
    }

    public Flux<QuestionResponseDTO> getAllQuestions(){
        throw new UnsupportedOperationException("Not implemented");
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteQuestionById(@PathVariable String id){
        throw new UnsupportedOperationException("Not implemented");
    }

    @GetMapping("/search")
    public Flux<QuestionResponseDTO>searchQuestion(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ){
        throw new UnsupportedOperationException("Not implemented");
    }

    @GetMapping("/tag/{tag}")
    public Flux<QuestionResponseDTO> getQuestionsByTag(@PathVariable String tag,
                                                       @RequestParam (defaultValue = "0") int page,
                                                       @RequestParam(defaultValue = "10") int size)
    {
        throw new UnsupportedOperationException("Not implemented");
    }
}
