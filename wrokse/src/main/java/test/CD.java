package test;

import java.lang.reflect.Field;

public class CD {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		d.setId(111);
		c.setUser_id(134);
		 d.setId(c.getUser_id());
		 //获取C类属性
		 Field[] Cfields = c.getClass().getDeclaredFields();
		 for (int j = 0; j < Cfields.length; j++) { // 遍历所有属性
             String Cname = Cfields[j].getName(); // 获取属性的名字
             System.out.println(Cname);
		 }
			
		 //获取D类属性
		 Field[] Dfields = d.getClass().getDeclaredFields();
		 for (int j = 0; j < Dfields.length; j++) { // 遍历所有属性
			 String Dname = Dfields[j].getName(); // 获取属性的名字
			 System.out.println(Dname);
		 }
		System.out.println(d.getId());
	}
}
