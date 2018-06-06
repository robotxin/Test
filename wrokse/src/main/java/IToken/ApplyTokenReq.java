package IToken;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;



public class ApplyTokenReq {
	public static void main(String[] args) {
		 try {
		      // 包路径定义
		      URL urls = new URL("file:/E:/B2B.jar");
		      //GetPI.class
		      URLClassLoader urlLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
		      Class<URLClassLoader> sysclass = URLClassLoader.class;
		      Method method = sysclass.getDeclaredMethod("addURL", new Class[]{URL.class});
		      method.setAccessible(true);
		      method.invoke(urlLoader, urls);
		 
		      // 输入类名
		      ClassLoader loader = ClassLoader.getSystemClassLoader();

		 Class<?> applyTokenReq = loader
                 .loadClass("com.jiuyv.sptcc.token.dto.ApplyTokenReq");
         Field[] field = applyTokenReq.getDeclaredFields();
         try
         {
         PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ApplyTokenReqPr.txt"));
         pw.close();
         }
         catch(Exception e)
         {
         }    
             for (int j = 0; j < field.length; j++) { // 遍历所有属性
                 String name = field[j].getName(); // 获取属性的名字
                 String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                 System.out.print(name+" "+"|"+" ");
                 System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                 try
                 {
                 FileWriter fw = new FileWriter(new File("D:\\ApplyTokenReqPr.txt"),true);
                 PrintWriter pw = new PrintWriter(fw);
                 pw.print(name+" "+"|"+" ");
                 pw.println(type1.substring(type1.lastIndexOf(".")+1));
                 pw.close();
                 }
                 catch(Exception e)
                 {
                 }

             }
		  } catch (Exception exp) {
		      exp.printStackTrace();
		    }
	}
}
