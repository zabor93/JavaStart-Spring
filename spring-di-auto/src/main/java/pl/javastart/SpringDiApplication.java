package pl.javastart;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.beans.MessageDecorator;
import pl.javastart.beans.MessagePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javastart.beans.MessageProducer;
import pl.javastart.beans.SimpleMessageProducer;

@Configuration
@ComponentScan
public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printer();
        ctx.close();
    }

}
