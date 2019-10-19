package pl.javastart;

import pl.javastart.beans.MessagePrinter;
import pl.javastart.beans.MessageProducer;
import pl.javastart.beans.SimpleMessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {


    @Bean
    public MessagePrinter getPrinter(){
        MessageProducer messageProducer=new SimpleMessageProducer();
        return new MessagePrinter(messageProducer);
    }
}
