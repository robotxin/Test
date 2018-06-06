package test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CDCDTest implements CDCD{

	@Override
	public List<String> ListC(C c) {
		 List<String> arrayListC = new ArrayList<String>();
		//获取C类属性
		 Field[] Cfields = c.getClass().getDeclaredFields();
		 for (int j = 0; j < Cfields.length; j++) { // 遍历所有属性
	            String Cname = Cfields[j].getName(); // 获取属性的名字
	            arrayListC.add(Cname);
	         
			 }
		return arrayListC;
	}

	@Override
	public List<String> ListD(D d) {
		//获取D类属性
		 Field[] Dfields = d.getClass().getDeclaredFields();
		 List<String> arrayListD = new ArrayList<String>();
		 for (int j = 0; j < Dfields.length; j++) { // 遍历所有属性
	            String Dname = Dfields[j].getName(); // 获取属性的名字
	            arrayListD.add(Dname);
			 }
		 return arrayListD;
	}

	@Override
	public D copy(C c) {
		D d = new D();
		CDCDTest cdcdTest = new CDCDTest();
		List<String> listC = cdcdTest.ListC(c);
		List<String> listD = cdcdTest.ListD(d);
		 for(String c1 :listC){
		 for(String d1 :listD){
			 if(c1.contains(d1)){
				 System.out.println(d.getClass().getName().substring(d.getClass().getName().lastIndexOf(".")+1).toLowerCase()+
						 ".set"+d1.substring(0,1).toUpperCase().concat(d1.substring(1))+
			           		"("+c.getClass().getName().substring(c.getClass().getName().lastIndexOf(".")+1).toLowerCase()+".get"+
			           		c1.substring(0,1).toUpperCase().concat(c1.substring(1))+"())");
			 }
		 }
	}
		 return d;
	}

	@Override
	public D copyse(C c) {
		D d = new D();
		CDCDTest cdcdTest = new CDCDTest();
		List<String> listC = cdcdTest.ListC(c);
		List<String> listD = cdcdTest.ListD(d);
		 for(String c1 :listC){
		 for(String d1 :listD){
			 //在下面输入你的匹配策略  c1中的属性如何和d1中的属性进行匹配
			 if(true){
				 System.out.println(d.getClass().getName().substring(d.getClass().getName().lastIndexOf(".")+1).toLowerCase()+
						 ".set"+d1.substring(0,1).toUpperCase().concat(d1.substring(1))+
			           		"("+c.getClass().getName().substring(c.getClass().getName().lastIndexOf(".")+1).toLowerCase()+".get"+
			           		c1.substring(0,1).toUpperCase().concat(c1.substring(1))+"())");
			 }
		 }
	}
		return d;
	}

	@Override
	public <T> List<String> ListT(T t) {
		 List<String> arrayListT = new ArrayList<String>();
			//获取C类属性
			 Field[] Tfields = t.getClass().getDeclaredFields();
			 for (int j = 0; j < Tfields.length; j++) { // 遍历所有属性
		            String Tname = Tfields[j].getName(); // 获取属性的名字
		            arrayListT.add(Tname);
		         
				 }
			return arrayListT;
	}

	@Override
	public <T, K> K copya(T t,K k) {
		CDCDTest cdcdTest = new CDCDTest();
		List<String> listT = cdcdTest.ListT(t);
		List<String> listK = cdcdTest.ListK(k);
		 for(String t1 :listT){
		 for(String k1 :listK){
			 if(t1.contains(k1)){
				 System.out.println(k.getClass().getName().substring(k.getClass().getName().lastIndexOf(".")+1).toLowerCase()+
						 ".set"+k1.substring(0,1).toUpperCase().concat(k1.substring(1))+
			           		"("+t.getClass().getName().substring(t.getClass().getName().lastIndexOf(".")+1).toLowerCase()+".get"+
			           		t1.substring(0,1).toUpperCase().concat(t1.substring(1))+"())");
			 }
		 }
	}
		 return k;
	}

	@Override
	public <K> List<String> ListK(K k) {
		 List<String> arrayListK = new ArrayList<String>();
			//获取C类属性
			 Field[] Kfields = k.getClass().getDeclaredFields();
			 for (int j = 0; j < Kfields.length; j++) { // 遍历所有属性
		            String Kname = Kfields[j].getName(); // 获取属性的名字
		            arrayListK.add(Kname);
		         
				 }
			return arrayListK;
	}

	@Override
	public <T, K> K copyase(T t, K k) {
		CDCDTest cdcdTest = new CDCDTest();
		List<String> listT = cdcdTest.ListT(t);
		List<String> listK = cdcdTest.ListK(k);
		 for(String t1 :listT){
		 for(String k1 :listK){
			 //在下面输入你的匹配策略  c1中的属性如何和d1中的属性进行匹配
			 if(true){
				 System.out.println(k.getClass().getName().substring(k.getClass().getName().lastIndexOf(".")+1).toLowerCase()+
						 ".set"+k1.substring(0,1).toUpperCase().concat(k1.substring(1))+
			           		"("+t.getClass().getName().substring(t.getClass().getName().lastIndexOf(".")+1).toLowerCase()+".get"+
			           		t1.substring(0,1).toUpperCase().concat(t1.substring(1))+"())");
			 }
		 }
	}
		 return k;
	}

}
