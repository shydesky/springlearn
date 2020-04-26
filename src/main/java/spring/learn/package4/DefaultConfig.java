package spring.learn.package4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.learn.package3.DbBackupHelper;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-15
 **/

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "spring.learn.package4")
public class DefaultConfig {

  @Autowired
  ApplicationContext appCtx;

  public DefaultConfig() {
  }

}