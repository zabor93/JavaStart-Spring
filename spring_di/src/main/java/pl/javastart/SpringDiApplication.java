package pl.javastart;

import pl.javastart.beans.MessagePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printer();
        ctx.close();
    }

}
