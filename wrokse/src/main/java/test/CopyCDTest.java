package test;

public class CopyCDTest{
	//private CDCDTest cdcdtest;
	public static void main(String[] args) {
		CDCDTest cdcdTest = new CDCDTest();
		C c = new C();
		D d = new D();
	//	B b = new B();
//		System.out.println(cdcdTest.ListC(c));
//		System.out.println(cdcdTest.ListD(d));
//		cdcdTest.copy(c);
	//	cdcdTest.copyse(c);
		System.out.println(cdcdTest.copya(c, d));
	}
}
