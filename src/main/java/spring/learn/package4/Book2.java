package spring.learn.package4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-29
 **/

@Component
public class Book2 implements IBook {

  private String bookName;

  @Autowired
  public Book2(@Value("yingyu") String bookName){
    this.bookName = bookName;
  }

  public Book2(){

  }
  @Override
  public String getBookName() {
    return "yingyu";
  }
}