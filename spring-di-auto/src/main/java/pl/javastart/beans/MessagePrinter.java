package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @Autowired
    private MessageProducer messageProducer;

    private MessageDecorator messageDecorator;

    @Autowired
    public MessagePrinter(@Qualifier("upperCase") MessageDecorator messageDecorator) {
        this.messageDecorator=messageDecorator;
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printer() {
        System.out.println(messageDecorator.decorata(messageProducer.getMessage()));
    }
}
