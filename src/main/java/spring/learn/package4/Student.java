package spring.learn.package4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-29
 **/

@Component
public class Student {
  private Integer age;
  private String name;

  @Autowired
  @Qualifier("book2")
  IBook book;

  @Autowired
  @Qualifier("book")
  IBook book2;

  @Autowired(required=false)
  public void setAge(Integer age) {
    this.age = age;
  }
  public Integer getAge() {
    return age;
  }

  @Autowired(required=false)
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}