package spring.learn.package2;

/**
 * @program: springlearn
 * @description:
 * @author: shydesky@gmail.com
 * @create: 2018-10-09
 **/

public class AccountServiceImpl implements AccountService {

  /**
   * 需要注入的对象
   */
  private AccountDao accountDao;

  public void setAccountDao(AccountDao accountDao) {
    this.accountDao = accountDao;
  }

  public void doSomething() {
    System.out.println("AccountServiceImpl#doSomething......");
    accountDao.addAccount();
  }
}