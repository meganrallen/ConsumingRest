import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    @Bean
    @Profile("!test")
    public CommandLineRunner run1(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject("http://localhost:8080/api/random", Quote.class);
            log.info(quote.toString());
        };
    }

    @Bean
    @Profile("!test")
    public CommandLineRunner run2(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject("http://localhost:8080/api/1", Quote.class);
            log.info(quote.toString());
        };
    }

    @Bean
    @Profile("!test")
    public CommandLineRunner run3(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject("http://localhost:8080/api/2", Quote.class);
            log.info(quote.toString());
        };
    }

    @Bean
    @Profile("!test")
    public CommandLineRunner run4(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject("http://localhost:8080/api/3", Quote.class);
            log.info(quote.toString());
        };
    }
}
