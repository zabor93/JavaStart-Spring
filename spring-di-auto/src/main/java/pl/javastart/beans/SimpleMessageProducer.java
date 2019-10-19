package pl.javastart.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer implements MessageProducer {

    public String getMessage() {
        return "Example Message" + System.currentTimeMillis();
    }
}
