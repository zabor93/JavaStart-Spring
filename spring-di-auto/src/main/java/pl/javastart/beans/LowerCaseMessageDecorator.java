package pl.javastart.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class LowerCaseMessageDecorator implements MessageDecorator {
    public String decorata(String word) {
        return word.toLowerCase();
    }
}
