public class MessagePrinter {

    private MessageProducer messageProducer = new MessageProducer();
    public void printMessage(){
        String message = messageProducer.getMessage();
        System.out.println(message);

    }
}
