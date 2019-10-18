package app;

import beans.MessagePrinter;
import beans.MessageProducer;
import beans.SimpleMessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MessagePrinter getPrinter() {
        MessageProducer messageProducer = new SimpleMessageProducer();

        return new MessagePrinter(messageProducer);
    }

}
