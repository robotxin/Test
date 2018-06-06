package test;

public class AB {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.setI(435);
		a.setName("张三");
		a.setAaa("abcdef");
		b.setName1(a.getName());
		b.setA(a);
		
		
		System.out.println(b.getName1());
		System.out.println(b.getA().getI()+">>>"+b.getA().getName()+">>>>"+b.getA().getAaa().toUpperCase());
	}
}
