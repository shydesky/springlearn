package spring.learn.package3;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-15
 **/

public class Block {
  private int num;
  private String hash;
  public Block(int num, String hash){
    this.num = num;
    this.hash = hash;
  }

  public int getNum(){
    return num;
  }
}