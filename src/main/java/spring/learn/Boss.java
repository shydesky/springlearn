package spring.learn;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-09
 **/

public class Boss {

  private Car car;
  private Office office;

  public Office getOffice() {
    return office;
  }

  public void setOffice(Office office) {
    this.office = office;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  @Override
  public String toString() {
    return "car:" + car + "\n" + "office:" + office;
  }
}