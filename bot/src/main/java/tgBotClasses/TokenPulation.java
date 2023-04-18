package tgBotClasses;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TokenPulation {

    @Value("${bot.token}")
    private String token;

    @Bean
    public String getToken() {
        return token;
    }
}
