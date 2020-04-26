package spring.learn.package3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-29
 **/

@Aspect
public class CompactDiscAspectI {
  @Pointcut("execution(** spring.learn.package3.CompactDisc.playTrack(..)) && args(block)")
  public void trackPlayed(Block block) {

  }


  @Before("trackPlayed(block)")
  public void beforeTrackPlayed(Block block){
    System.out.println("pointcut before block!");
  }

  @After("trackPlayed(block)")
  public void afterTrackPlayed(Block block){
    System.out.println("pointcut after block!");
  }

  @Pointcut("execution(** spring.learn.package3.CompactDisc.*(..))")
  public void trackPlayed2() {

  }

  @Before("trackPlayed2()")
  public void beforeTrackPlayed2(){
    System.out.println("pointcut before block2!");
  }


}