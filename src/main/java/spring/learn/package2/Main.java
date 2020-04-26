package spring.learn.package2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-09
 **/

public class Main {

  public static void main(String[] args) {

    //加载配置文件
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean2.xml");
    //AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
    //多次获取并不会创建多个accountService对象,因为spring默认创建是单实例的作用域
    AccountService accountService= (AccountService) applicationContext.getBean("accountService");
    accountService.doSomething();
  }
}