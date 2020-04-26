package spring.learn.package4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-29
 **/

@Component
public class Book implements IBook {
  private String bookName;

  @Autowired
  public Book(@Value("shuxue") String bookName){
    this.bookName = bookName;
  }

  public String getBookName(){
    return  this.bookName;
  }
}