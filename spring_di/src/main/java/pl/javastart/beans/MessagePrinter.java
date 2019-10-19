package pl.javastart.beans;

public class MessagePrinter {

    private MessageProducer messageProducer;


    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public MessagePrinter() {
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printer(){
        System.out.println(messageProducer.getMessage());
    }
}
