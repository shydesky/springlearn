package spring.learn.package3;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-15
 **/

@Component
public class CompactDisc{


  public void playTrack(final Block block){
    System.out.println("block:" + block.getNum());
  }

  //@Override
  public void playTrack() {
    System.out.println("interface func!");
  }

  //@Override
  public void playTrack2() {
    System.out.println("interface func2!");
  }
}