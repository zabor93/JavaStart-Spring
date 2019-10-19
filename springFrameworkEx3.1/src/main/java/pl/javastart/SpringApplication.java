package pl.javastart;

import pl.javastart.beans.MessagePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printMessage();
        ctx.close();
    }
}
