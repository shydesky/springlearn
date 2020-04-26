package spring.learn.package3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-15
 **/

public class Main {

  public static void main(String[] args) {
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    beanFactory.setAllowCircularReferences(false);
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(beanFactory);
    context.register(DefaultConfig.class);
    context.refresh();
   /* ICompactDisc cp = context.getBean(ICompactDisc.class);
    cp.playTrack2();
    cp.playTrack();*/
    CompactDisc cp2 = context.getBean(CompactDisc.class);
    cp2.playTrack(new Block(1,"s"));
    cp2.playTrack();
    // (new Block(1,"ss"));
  }
}