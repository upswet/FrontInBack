package ru.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.back.config.OpenApiConfig;
import ru.back.config.WebConfig;


@SpringBootApplication
@Import({
        WebConfig.class,
        OpenApiConfig.class
})
public class ServerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ServerApplication.class, args);
    }
}
