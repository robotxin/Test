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
public class IBusinessLoad {


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
 
      // 输入类名
      ClassLoader loader = ClassLoader.getSystemClassLoader();
      Class<?> mainInterface = loader
          .loadClass("com.jiuv.sptcc.business.api.IBusinessApi");
      Method[] methods = mainInterface.getMethods();

      try
      {
      PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\IBusinessLoad.txt"));
      pw.close();
      }
      catch(Exception e)
      {
      }

      for(Method m : methods){
    	  //输出接口名
//    	  System.out.println(m);
//          try
//          {
//          FileWriter fw = new FileWriter(new File("D:\\IBusinessLoad.txt"),true);
//          PrintWriter pw = new PrintWriter(fw);
//          pw.println(m);
//          pw.close();
//          }
//          catch(Exception e)
//          {
//          }
     	 // 获取返回
    	  Type genericReturnType = m.getGenericReturnType();
    	  System.out.println(genericReturnType.getTypeName());
          try
          {
          FileWriter fw = new FileWriter(new File("D:\\IBusinessLoad.txt"),true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println(genericReturnType.getTypeName());
          pw.close();
          }
          catch(Exception e)
          {
          }
    	  /**
   	   * ResRegister
   	   */
         
         if(genericReturnType.getTypeName().contains("ResRegister")){
        	 try
             {
             PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ResRegisterPr.txt"));
             pw.close();
             }
             catch(Exception e)
             {
             }
        	
             Class<?> applyTokenReq = loader
                     .loadClass("com.jiuv.sptcc.business.dto.ResRegister");
             Field[] field = applyTokenReq.getDeclaredFields();
  	                
                 for (int j = 0; j < field.length; j++) { // 遍历所有属性
                     String name = field[j].getName(); // 获取属性的名字
                     String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                     System.out.print(name+" "+"|"+" ");
                     System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                     try
                     {
                     FileWriter fw = new FileWriter(new File("D:\\ResRegisterPr.txt"),true);
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
  	   * ResQueryUserChannel
  	   */
        if(genericReturnType.getTypeName().contains("ResQueryUserChannel")){
        	 try
             {
             PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ResQueryUserChannelPr.txt"));
             pw.close();
             }
             catch(Exception e)
             {
             }
        	
            Class<?> applyTokenReq = loader
                    .loadClass("com.jiuv.sptcc.business.dto.ResQueryUserChannel");
            Field[] field = applyTokenReq.getDeclaredFields();
 	                
                for (int j = 0; j < field.length; j++) { // 遍历所有属性
                    String name = field[j].getName(); // 获取属性的名字
                    String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                    System.out.print(name+" "+"|"+" ");
                    System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                    try
                    {
                    FileWriter fw = new FileWriter(new File("D:\\ResQueryUserChannelPr.txt"),true);
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
    	  Type type = genericParameterTypes[0];
    	  System.out.println(type.getTypeName());
          try
          {
          FileWriter fw = new FileWriter(new File("D:\\IBusinessLoad.txt"),true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println(type.getTypeName());
          pw.close();
          }
          catch(Exception e)
          {
          }
    	  /**
   	   * ReqRegister
   	   */
         if(type.getTypeName().contains("ReqRegister")){
        	 try
             {
             PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ReqRegisterPr.txt"));
             pw.close();
             }
             catch(Exception e)
             {
             }
             Class<?> applyTokenReq = loader
                     .loadClass("com.jiuv.sptcc.business.dto.ReqRegister");
             Field[] field = applyTokenReq.getDeclaredFields();
    	                
                 for (int j = 0; j < field.length; j++) { // 遍历所有属性
                     String name = field[j].getName(); // 获取属性的名字
                     String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                     System.out.print(name+" "+"|"+" ");
                     System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                     try
                     {
                     FileWriter fw = new FileWriter(new File("D:\\ReqRegisterPr.txt"),true);
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
  	   * ReqRecharge
  	   */
        if(type.getTypeName().contains("ReqRecharge")){
        	 try
             {
             PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ReqRechargePr.txt"));
             pw.close();
             }
             catch(Exception e)
             {
             }
            Class<?> applyTokenReq = loader
                    .loadClass("com.jiuv.sptcc.business.dto.ReqRecharge");
            Field[] field = applyTokenReq.getDeclaredFields();
   	                
                for (int j = 0; j < field.length; j++) { // 遍历所有属性
                    String name = field[j].getName(); // 获取属性的名字
                    String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                    System.out.print(name+" "+"|"+" ");
                    System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                    try
                    {
                    FileWriter fw = new FileWriter(new File("D:\\ReqRechargePr.txt"),true);
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
    	   * ReqQueryUserChannel
    	   */
          if(type.getTypeName().contains("ReqQueryUserChannel")){
        	  try
              {
              PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ReqQueryUserChannelPr.txt"));
              pw.close();
              }
              catch(Exception e)
              {
              }
              Class<?> applyTokenReq = loader
                      .loadClass("com.jiuv.sptcc.business.dto.ReqQueryUserChannel");
              Field[] field = applyTokenReq.getDeclaredFields();
     	                
                  for (int j = 0; j < field.length; j++) { // 遍历所有属性
                      String name = field[j].getName(); // 获取属性的名字
                      String type1 = field[j].getGenericType().toString(); // 获取属性的类型
                      System.out.print(name+" "+"|"+" ");
                      System.out.println(type1.substring(type1.lastIndexOf(".")+1));
                      try
                      {
                      FileWriter fw = new FileWriter(new File("D:\\ReqQueryUserChannelPr.txt"),true);
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

        
      }  
    } catch (Exception exp) {
      exp.printStackTrace();
    }
  }
  
}
