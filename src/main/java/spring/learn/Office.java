package spring.learn;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-09
 **/

public class Office {

  private String officeNo = "001";

  public String getOfficeNo() {
    return officeNo;
  }

  public void setOfficeNo(String officeNo) {
    this.officeNo = officeNo;
  }

  @Override
  public String toString() {
    return "officeNo:" + officeNo;
  }
}