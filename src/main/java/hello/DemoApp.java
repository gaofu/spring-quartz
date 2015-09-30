package hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("beans.xml");
    }
}


