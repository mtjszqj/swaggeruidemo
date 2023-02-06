package lone.swagger;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SwaggerUIApplication {

    public static void main(String[] args) {
		SpringApplication.run(SwaggerUIApplication.class, args);
    }

    @Bean
    GroupedOpenApi userApis() {
        return GroupedOpenApi.builder().group("user").pathsToMatch("/**/user/**").build();
    }

    @Bean
    GroupedOpenApi adminApis() {
        return GroupedOpenApi.builder().group("admin").pathsToMatch("/**/admin/**").build();
    }

    @Bean
    GroupedOpenApi opsApis() {
        return GroupedOpenApi.builder().group("operation").pathsToMatch("/**/operation/**").build();
    }
}
