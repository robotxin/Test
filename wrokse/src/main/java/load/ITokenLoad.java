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
public class ITokenLoad {


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
          .loadClass("com.jiuyv.sptcc.token.api.ITokenApi");
      Method[] methods = mainInterface.getMethods();

      try
      {
      PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ITokenLoad.txt"));
     // pw.print("21314");
      pw.close();
      }
      catch(Exception e)
      {
      }

      for(Method m : methods){
    	  System.out.println(m);
          try
          {
          FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println(m);
          pw.close();
          }
          catch(Exception e)
          {
          }
    	  /**
    	   * RespMessage
    	   */
          if(m.toString().contains("RespMessage")){
              Class<?> applyTokenReq = loader
                      .loadClass("com.jiuyv.sptcc.token.dto.RespMessage");
              Field[] field = applyTokenReq.getDeclaredFields();
        	//  System.out.println(field.length);
              System.out.println("com.jiuyv.sptcc.token.dto.RespMessage");
              try
              {
              FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
              PrintWriter pw = new PrintWriter(fw);
              pw.println("com.jiuyv.sptcc.token.dto.RespMessage");
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
                      FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
                      PrintWriter pw = new PrintWriter(fw);
                      pw.print(name+" "+"|"+" ");
                      pw.println(type1.substring(type1.lastIndexOf(".")+1));
                      pw.close();
                      }
                      catch(Exception e)
                      {
                      }

                  }
          }
          /**
           * ReqMessage
           */
          if(m.toString().contains("ReqMessage")){
        	  Class<?> applyTokenReq = loader
        			  .loadClass("com.jiuyv.sptcc.token.dto.ReqMessage");
        	  Field[] field = applyTokenReq.getDeclaredFields();
        	  //  System.out.println(field.length);
        	  System.out.println("com.jiuyv.sptcc.token.dto.ReqMessage");
        	  try
              {
              FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
              PrintWriter pw = new PrintWriter(fw);
              pw.println("com.jiuyv.sptcc.token.dto.ReqMessage");
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
                  FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
                  PrintWriter pw = new PrintWriter(fw);
                  pw.print(name+" "+"|"+" ");
                  pw.println(type1.substring(type1.lastIndexOf(".")+1));
                  pw.close();
                  }
                  catch(Exception e)
                  {
                  }
        	  }
          }
    	  //获取参数
    	  Type[] genericParameterTypes = m.getGenericParameterTypes();
    	  ParameterizedType type = (ParameterizedType)genericParameterTypes[0];
    	  Type[] actualTypeArguments = type.getActualTypeArguments();
    	  System.out.println(type.getTypeName().substring(type.getTypeName().lastIndexOf("<")+1, type.getTypeName().lastIndexOf(">")));
    	  try
          {
          FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println(type.getTypeName().substring(type.getTypeName().lastIndexOf("<")+1, type.getTypeName().lastIndexOf(">")));
          pw.close();
          }
          catch(Exception e)
          {
          }
    	  //type.getTypeName().indexOf(">")+1, type.getTypeName().lastIndexOf("<"))
    	  /**
    	   * ReqQrSession
    	   */
          if(type.getTypeName().contains("ReqQrSession")){
              Class<?> applyTokenReq = loader
                      .loadClass("com.jiuyv.sptcc.token.dto.ReqQrSession");
              Field[] field = applyTokenReq.getDeclaredFields();
        	//  System.out.println(field.length);
                  for (int j = 0; j < field.length; j++) { // 遍历所有属性
                      String name = field[j].getName(); // 获取属性的名字
                      String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                      System.out.print(name+" "+"|"+" ");
                      System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                      try
                      {
                      FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
                      PrintWriter pw = new PrintWriter(fw);
                      pw.print(name+" "+"|"+" ");
                      pw.println(type1.substring(type1.lastIndexOf(".")+1));
                      pw.close();
                      }
                      catch(Exception e)
                      {
                      }
                  }
          }
         
          /**
           * ApplyTokenReq
           */
          if(type.getTypeName().contains("ApplyTokenReq")){
              Class<?> applyTokenReq = loader
                      .loadClass("com.jiuyv.sptcc.token.dto.ApplyTokenReq");
              Field[] field = applyTokenReq.getDeclaredFields();
        	 // System.out.println(field.length);
                  for (int j = 0; j < field.length; j++) { // 遍历所有属性
                      String name = field[j].getName(); // 获取属性的名字
                      String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                      System.out.print(name+" "+"|"+" ");
                      System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                      try
                      {
                      FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
                      PrintWriter pw = new PrintWriter(fw);
                      pw.print(name+" "+"|"+" ");
                      pw.println(type1.substring(type1.lastIndexOf(".")+1));
                      pw.close();
                      }
                      catch(Exception e)
                      {
                      }

                  }
          }


           

    	  //获取返回
    	  Type genericReturnType = m.getGenericReturnType();
    	  ParameterizedType type1 = (ParameterizedType)genericReturnType;
    	  Type[] actualTypeArguments2 = type1.getActualTypeArguments();
    	  System.out.println(type1.getTypeName().substring(type1.getTypeName().lastIndexOf("<")+1,type1.getTypeName().lastIndexOf(">")));
    	  try
          {
          FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println(type1.getTypeName().substring(type1.getTypeName().lastIndexOf("<")+1,type1.getTypeName().lastIndexOf(">")));
          pw.close();
          }
          catch(Exception e)
          {
          }
    	  /**
           * RespQrSession
           */
          if(type1.getTypeName().contains("RespQrSession")){
        	  Class<?> applyTokenReq = loader
        			  .loadClass("com.jiuyv.sptcc.token.dto.RespQrSession");
        	  Field[] field = applyTokenReq.getDeclaredFields();
        	 // System.out.println(field.length);
        	  for (int j = 0; j < field.length; j++) { // 遍历所有属性
        		  String name = field[j].getName(); // 获取属性的名字
        		  String type2 = field[j].getGenericType().toString(); // 获取属性的类型
        		  System.out.print(name+" "+"|"+" ");
        		  System.out.println(type2.substring(type2.lastIndexOf(".")+1));
                  try
                  {
                  FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
                  PrintWriter pw = new PrintWriter(fw);
                  pw.print(name+" "+"|"+" ");
        		  pw.println(type2.substring(type2.lastIndexOf(".")+1));
                  pw.close();
                  }
                  catch(Exception e)
                  {
                  }
        	  }
          }
          /**
           * ApplyTokenResp
           */
          if(type1.getTypeName().contains("ApplyTokenResp")){
              Class<?> applyTokenReq = loader
                      .loadClass("com.jiuyv.sptcc.token.dto.ApplyTokenResp");
              Field[] field = applyTokenReq.getDeclaredFields();
        	//  System.out.println(field.length);
                  for (int j = 0; j < field.length; j++) { // 遍历所有属性
                      String name = field[j].getName(); // 获取属性的名字
                      String type2 = field[j].getGenericType().toString(); // 获取属性的类型
                      System.out.print(name+" "+"|"+" ");
                      System.out.println(type2.substring(type2.lastIndexOf(".")+1));
                      try
                      {
                      FileWriter fw = new FileWriter(new File("D:\\ITokenLoad.txt"),true);
                      PrintWriter pw = new PrintWriter(fw);
                      pw.print(name+" "+"|"+" ");
                      pw.println(type2.substring(type2.lastIndexOf(".")+1));
                      pw.close();
                      }
                      catch(Exception e)
                      {
                      }
                  }
          }     

      }  
    	  
    	  
    	  

      



    } catch (Exception exp) {
      exp.printStackTrace();
    }
  }
  
}
