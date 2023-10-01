package com.reza.springcloudprojectv1.function;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class TestFunction {

    @Bean
    public Function<Integer, String> getNameById() {
        return value ->
                switch (value) {
                    case 1 -> "A";
                    case 2 -> "B";
                    case 3 -> "C";
                    default -> "";
                };
    }

    @Bean
    public Supplier<Flux<String>> getNames() {
        return () -> Flux.fromIterable(List.of("A", "B", "C"));
    }
}
