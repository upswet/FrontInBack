package ru.back.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Tag(name = "Тестовый контроллер", description = "Просто тестовый контроллер для примера")
@RequestMapping("/api/v1/test")
@Slf4j
@RequiredArgsConstructor
public class MyTestController {

    Random randomizer = new Random();

    @Operation(summary = "Получить случайное значение")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "целое случайное значение в промежутке от 0 до 666")
    })
    @GetMapping(value = "/random")
    public ResponseEntity<Integer> randomApi(){
        return ResponseEntity.ok(randomizer.nextInt(666));
    }
}
