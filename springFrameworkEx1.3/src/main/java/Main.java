public class Main {

    public static void main(String[] args) {

        MessageProducer messageProducer = new SimpleMessageProducer();
        MessagePrinter messagePrinter = new MessagePrinter(messageProducer);
        messagePrinter.printMessage();

    }
}
