package com.example.QuoraApp.repository;

import com.example.QuoraApp.models.Questions;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.print.Pageable;


@Repository
@EnableReactiveMongoRepositories
public interface QuestionRepository extends ReactiveMongoRepository<Questions, String> {

//    Flux<Questions> findByAuthorId(String authorId);

//    Mono<Long> countByAuthorId(String authorId);
    @Query("{'$or': [ { 'title': {}}, {'content': {}}]}")
    Flux<Questions> findByTitleOrContentContainingIgnoreCase(String searchTerm, Pageable pageable);

}
