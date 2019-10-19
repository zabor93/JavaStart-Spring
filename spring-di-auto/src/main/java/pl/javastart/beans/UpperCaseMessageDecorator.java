package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upperCase")
public class UpperCaseMessageDecorator implements MessageDecorator {

    public String decorata(String word) {
        return word.toUpperCase();
    }


}
