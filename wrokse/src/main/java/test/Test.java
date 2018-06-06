package test;

/**
 * @describe
 * @auther chen_yang
 * @create 2018-06-05-10:36
 */
public class Test {
	

  public B copy(A a) {
    B b = new B()
        .setB1(a.a1)
        .setB2(a.a2)
        .setB3(a.a3);
    return b;
  }
  

  public class A {

    public String a1;
    public Long a2;
    public int a3;
  }

  public class B {

    public String b1;
    public Long b2;
    public int b3;

    public String getB1() {
      return b1;
    }

    public B setB1(String b1) {
      this.b1 = b1;
      return this;
    }

    public Long getB2() {
      return b2;
    }

    public B setB2(Long b2) {
      this.b2 = b2;
      return this;
    }

    public int getB3() {
      return b3;
    }

    public B setB3(int b3) {
      this.b3 = b3;
      return this;
    }
  }
}
