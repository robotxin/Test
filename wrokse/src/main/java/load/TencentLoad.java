package load
;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

import com.jiuyv.sptcc.token.dto.ApplyTokenResp;
import com.jiuyv.sptcc.token.dto.RespMessage;

/**
 * @describe
 * @auther chen_yang
 * @create 2018-05-28-14:29
 */
public class TencentLoad {


  public static void main(String[] args) {
    // ClassLoader
	 
    Class c1;

    ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    
    


    // 动态加载jar
    try {
      // 包路径定义
      URL urls = new URL("file:/E:/B2B.jar");
      //GetPI.class
      URLClassLoader urlLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
      Class<URLClassLoader> sysclass = URLClassLoader.class;
      Method method = sysclass.getDeclaredMethod("addURL", new Class[]{URL.class});
      method.setAccessible(true);
      method.invoke(urlLoader, urls);
      /*
       * 实例化一个对象 ，这个类(yerasel.GetPI)可以是串行化传来的多个类的一个，运行时才知道需要哪个类
       * 或者从xml 配置文件中获得字符串
       * 例如
       * String className = readfromXMlConfig;//从xml 配置文件中获得字符串
       * class c = Class.forName(className);
       * factory = (ExampleInterface)c.newInstance();
       * 上面代码已经不存在类名称，它的优点是，无论Example类怎么变化，上述代码不变，
       * 甚至可以更换Example的兄弟类Example2 , Example3 , Example4……，只要他们继承ExampleInterface就可以。
       */
      // 输入类名
      ClassLoader loader = ClassLoader.getSystemClassLoader();
      Class<?> mainInterface = loader
          .loadClass("com.jiuyv.sptcc.b2bgateway.business.api.TencentApi");
      Method[] methods = mainInterface.getMethods();
      Class[] classes = mainInterface.getClasses();
      try
      {
      PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\TencentLoad.txt"));
      pw.close();
      }
      catch(Exception e)
      {
      }
      Arrays.asList(classes).forEach(a -> {
          try {
            Class<?> subInterface = loader.loadClass(a.getName());//拿到嵌套接口类
            Method[] interfaceFunctions = subInterface.getMethods();//拿到嵌套接口类所有方法
           // System.out.println(interfaceFunctions);
            for(Method w : interfaceFunctions){
          	  //System.out.println(w.toString().substring(w.toString().lastIndexOf("(")+1, w.toString().lastIndexOf(")")));
              System.out.println(w);
              try
              {
              FileWriter fw = new FileWriter(new File("D:\\TencentLoad.txt"),true);
              PrintWriter pw = new PrintWriter(fw);
              pw.println(w);
              pw.close();
              }
              catch(Exception e)
              {
              }

            }
            Arrays.asList(interfaceFunctions)
            .forEach(m -> {
          	  Type[] genericParameterTypes = m.getGenericParameterTypes();
        	  Type type = genericParameterTypes[0];
        	  System.out.println(type.getTypeName());
        	  try
              {
              FileWriter fw = new FileWriter(new File("D:\\TencentLoad.txt"),true);
              PrintWriter pw = new PrintWriter(fw);
              pw.println(type.getTypeName());
              pw.close();
              }
              catch(Exception e)
              {
              }
           	  /**
           	   * JsonDataDTO
           	   */
                 if(type.getTypeName().contains("JsonDataDTO")){
                     Class<?> applyTokenReq;
					try {
						applyTokenReq = loader
						         .loadClass("com.jiuyv.sptcc.b2bgateway.business.dto.JsonDataDTO");
			               Field[] field = applyTokenReq.getDeclaredFields();
         	                
	                         for (int j = 0; j < field.length; j++) { // 遍历所有属性
	                             String name = field[j].getName(); // 获取属性的名字
	                             String type1 = field[j].getGenericType().toString(); // 获取属性的类型
	                             System.out.print(name+" "+"|"+" ");
	                             System.out.println(type1.substring(type1.lastIndexOf(".")+1));
	                             try
	                             {
	                             FileWriter fw = new FileWriter(new File("D:\\TencentLoad.txt"),true);
	                             PrintWriter pw = new PrintWriter(fw);
	                             pw.print(name+" "+"|"+" ");
	                             pw.println(type1.substring(type1.lastIndexOf(".")+1));
	                             pw.close();
	                             }
	                             catch(Exception e)
	                             {
	                             }

	                         }
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
      
                 }
             // Class[] params = m.getParameterTypes();
              //System.out.println(params.toString());
              
             // Arrays.asList(params).forEach(p -> System.out.println(p.getName()));
             // for(List p : params){}

//              Class<?> returnType = m.getReturnType();
//              System.out.println(returnType );
        	  Type genericReturnType = m.getGenericReturnType();
        	  System.out.println(genericReturnType.getTypeName());
        	  try
              {
              FileWriter fw = new FileWriter(new File("D:\\TencentLoad.txt"),true);
              PrintWriter pw = new PrintWriter(fw);
              pw.println(genericReturnType.getTypeName());
              pw.close();
              }
              catch(Exception e)
              {
              }
           	  /**
           	   * JsonDataDTO
           	   */
                 if(genericReturnType.getTypeName().contains("JsonDataDTO")){
                     Class<?> applyTokenReq;
					try {
						applyTokenReq = loader
						         .loadClass("com.jiuyv.sptcc.b2bgateway.business.dto.JsonDataDTO");
					      Field[] field = applyTokenReq.getDeclaredFields();
        	                
	                         for (int j = 0; j < field.length; j++) { // 遍历所有属性
	                             String name = field[j].getName(); // 获取属性的名字
	                             String type1 = field[j].getGenericType().toString(); // 获取属性的类型
	                             System.out.print(name+" "+"|"+" ");
	                             System.out.println(type1.substring(type1.lastIndexOf(".")+1));
	                             try
	                             {
	                             FileWriter fw = new FileWriter(new File("D:\\TencentLoad.txt"),true);
	                             PrintWriter pw = new PrintWriter(fw);
	                             pw.print(name+" "+"|"+" ");
	                             pw.println(type1.substring(type1.lastIndexOf(".")+1));
	                             pw.close();
	                             }
	                             catch(Exception e)
	                             {
	                             }

	                         }
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
               
                 }
             }
              
            );
//            .forEach(method1 -> System.out.println(method1.getName()));

      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
        );
//      for(Method m : methods){
//    	  System.out.println(m);
//
//        
//      }  
    } catch (Exception exp) {
      exp.printStackTrace();
    }
  }
  
}
