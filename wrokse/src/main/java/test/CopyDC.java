package test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public interface CopyDC {
	/**
	 * 
	 * @Title: ListC 
	 * @Description: 获取C类的属性并放入集合中
	 * @param c
	 * @return
	 * @return: List
	 */
	public static List<String> ListC (C c){
		 List<String> arrayListC = new ArrayList<String>();
		//获取C类属性
		 Field[] Cfields = c.getClass().getDeclaredFields();
		 for (int j = 0; j < Cfields.length; j++) { // 遍历所有属性
	            String Cname = Cfields[j].getName(); // 获取属性的名字
	            arrayListC.add(Cname);
	         
			 }
		return arrayListC;
	}
	/**
	 * 
	 * @Title: ListD 
	 * @Description: 获取类D的属性放入集合中
	 * @param d
	 * @return
	 * @return: List
	 */
	public static List<String> ListD(D d){
		//获取D类属性
		 Field[] Dfields = d.getClass().getDeclaredFields();
		 List<String> arrayListD = new ArrayList<String>();
		 for (int j = 0; j < Dfields.length; j++) { // 遍历所有属性
	            String Dname = Dfields[j].getName(); // 获取属性的名字
	            arrayListD.add(Dname);
			 }
		 return arrayListD;
	}
	/**
	 * 
	 * @Title: copy 
	 * @Description: 默认匹配策略
	 * @param c
	 * @return
	 * @return: D
	 */
	public static D copy(C c) {
		D d = new D();
		List<String> listC = CopyDC.ListC(c);
		List<String> listD = CopyDC.ListD(d);
		 for(String c1 :listC){
		 for(String d1 :listD){
			 if(c1.contains(d1)){
	            System.out.println("d.set"+d1.substring(0,1).toUpperCase().concat(d1.substring(1))+
           		"(c.get"+
           		c1.substring(0,1).toUpperCase().concat(c1.substring(1))+"())");
			 }
		 }
	}
		 return d;
	}
	/**
	 * 
	 * @Title: copyse 
	 * @Description: 自定义匹配
	 * @param c
	 * @return
	 * @return: D
	 */
	public static D copyse(C c) {
		D d = new D();
		List<String> listC = CopyDC.ListC(c);
		List<String> listD = CopyDC.ListD(d);
		return d;
	}
//	public static D copy(C c) {
//		D d = new D();
//		 //获取C类属性
//		 Field[] Cfields = c.getClass().getDeclaredFields();
//		//获取D类属性
//		 Field[] Dfields = d.getClass().getDeclaredFields();
//		 List<String> arrayListC = new ArrayList<String>();
//		 List<String> arrayListD = new ArrayList<String>();
//		 for (int j = 0; j < Cfields.length; j++) { // 遍历所有属性
//            String Cname = Cfields[j].getName(); // 获取属性的名字
//            arrayListC.add(Cname);
//         
//		 }
//		 for (int j = 0; j < Dfields.length; j++) { // 遍历所有属性
//	            String Dname = Dfields[j].getName(); // 获取属性的名字
//	            arrayListD.add(Dname);
//			 }
//		 for(String c1 :arrayListC){
//			 for(String d1 :arrayListD){
//				 if(c1.contains(d1)){
//		            System.out.println("d.set"+d1.substring(0,1).toUpperCase().concat(d1.substring(1))+
//	            		"(c.get"+
//	            		c1.substring(0,1).toUpperCase().concat(c1.substring(1))+"())");
//				 }
//			 }
//		 }
//		 
//		return d;
//	}
}
