package spring.learn;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-09
 **/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoIocTest {

  public static void main(String[] args) {
    String[] locations = {"bean.xml"};
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("bean.xml");
    Boss boss = (Boss)ctx.getBean("boss");
    System.out.println(boss);
  }
}