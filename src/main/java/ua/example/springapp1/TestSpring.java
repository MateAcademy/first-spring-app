package ua.example.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            TestBean testBean = context.getBean("testBean", TestBean.class);
            System.out.println(testBean.getName());
        }
    }

}
