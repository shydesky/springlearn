package spring.learn.package4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.learn.package3.DefaultConfig;
import spring.learn.package3.ICompactDisc;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-29
 **/

public class Main {
  public static void main(String[] args) {
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    beanFactory.setAllowCircularReferences(false);
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(beanFactory);
    context.register(DefaultConfig.class);
    context.refresh();
    Student st = context.getBean(Student.class);
    System.out.println(st.getName());
    System.out.println(st.book.getBookName());
    System.out.println(st.book2.getBookName());

  }
}