package test;

public class CopyTest implements CopyDC{
public static void main(String[] args) {
	C c = new C();
	D d = CopyDC.copy(c);
	System.out.println(d);
	System.out.println(CopyDC.ListC(c));
}
}
