package IToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import IBusiness.GeneratorTest;

public class ReadApplyTokenResp {
	private static final Logger LOGGER = LoggerFactory.getLogger(GeneratorTest.class);
	public static void main(String[] args) {
		 try
	      {
	      PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\ApplyTokenResp.txt"));
	      pw.close();
	      }
	      catch(Exception e)
	      {
	      }
		 String fileName = "D:/ApplyTokenRespPr.txt";  
		 readNameType(fileName);
		 readFileByLines(fileName);
		System.out.println("}");
		 try
         {
         FileWriter fw = new FileWriter(new File("D:\\ApplyTokenResp.txt"),true);
         PrintWriter pw = new PrintWriter(fw);
         pw.println("}");
         pw.close();
         }
         catch(Exception e)
         {
         }
		

	}
	//读取属性
    public static void readNameType(String fileName) {  

        File file = new File(fileName);  

        BufferedReader reader = null;  
        //	打印包名 类名
        try {  
       	 String classname = "ApplyTokenResp";
         try
         {
         FileWriter fw = new FileWriter(new File("D:\\ApplyTokenResp.txt"),true);
         PrintWriter pw = new PrintWriter(fw);
         pw.println(
			        "package com.jiuyv.sptcc.token.dto;\n" +
			            "public class " + classname + "{");
         pw.close();
         }
         catch(Exception e)
         {
         }
   		 System.out.println(
   			        "package com.jiuyv.sptcc.token.dto;\n" +
   			            "public class " + classname + "{");
           // System.out.println("以行为单位读取文件内容，一次读一整行：");  

            reader = new BufferedReader(new FileReader(file));  

            String tempString = null;  

            int line = 1;  
         
            // 一次读入一行，直到读入null为文件结束  

            while ((tempString = reader.readLine()) != null) {  

                // 显示行号  
             
           	 if(tempString.indexOf("|")!=-1&!tempString.contains("serialVersionUID")
){
           		 //字符串处理得到属性
           		 String aaa = tempString.toString().substring(0,tempString.indexOf("|")-1);
            	 String type = tempString.toString().substring(tempString.indexOf("|")+2);
            	   try
                   {
                   FileWriter fw = new FileWriter(new File("D:\\ApplyTokenResp.txt"),true);
                   PrintWriter pw = new PrintWriter(fw);
                   pw.println("private " +type+" "+aaa+";");
                   pw.close();
                   }
                   catch(Exception e)
                   {
                   }
            	 System.out.println("private " +type+" "+aaa+";");
            	 line++;
//           		 if(tempString.contains("ResQueryUserChannel")&tempString.contains("com")){
//           			
//           		 }
           		
           		// System.out.println("public " +type +" get"+aaa.substring(0,1).toUpperCase().concat(aaa.substring(1).toLowerCase())+"()"+"\n"+"{"+"\nreturn this."+aaa+"\n}");
           		 //System.out.println("public " +type +" set"+aaa.substring(0,1).toUpperCase().concat(aaa.substring(1).toLowerCase())+"("+type+" "+aaa+")"+"\n"+"{"+"\nreturn this."+aaa+"\n}");
           	 }
           	 
                  

            }  

            reader.close();  

        } catch (IOException e) {  

            e.printStackTrace();  

        } finally {  

            if (reader != null) {  

                try {  

                    reader.close();  

                } catch (IOException e1) {  

                }  

            }  

        }  

    }  
	
	      // 以行为单位读取文件，常用于读面向行的格式化文件 

	       

	     public static void readFileByLines(String fileName) {  

	         File file = new File(fileName);  

	         BufferedReader reader = null;  

	         try {  
//	        	 String classname = "ResQueryUserChannel";
//	    		 System.out.println(
//	    			        "package com.jiuv.sptcc.business.dto.ResQueryUserChannel;\n" +
//	    			            "public static class " + classname + " implements Serializable  {\n");
	            // System.out.println("以行为单位读取文件内容，一次读一整行：");  

	             reader = new BufferedReader(new FileReader(file));  

	             String tempString = null;  

	             int line = 1;  
	          
	             // 一次读入一行，直到读入null为文件结束  

	             while ((tempString = reader.readLine()) != null) {  

	              
	            	 if(tempString.indexOf("|")!=-1&!tempString.contains("serialVersionUID")
){
	            		 
	            		 String aaa = tempString.toString().substring(0,tempString.indexOf("|")-1);
		            	 String type = tempString.toString().substring(tempString.indexOf("|")+2);
		            	 
		            	   try
		                   {
		                   FileWriter fw = new FileWriter(new File("D:\\ApplyTokenResp.txt"),true);
		                   PrintWriter pw = new PrintWriter(fw);
		                   //字符串处理得到set get方法
		                   pw.println("public " +type +" get"+aaa.substring(0,1).toUpperCase().concat(aaa.substring(1))+"()"+"\n"+"{"+"\nreturn this."+aaa+";"+"\n}");
		            		 pw.println("public void"  +" set"+aaa.substring(0,1).toUpperCase().concat(aaa.substring(1))+"("+type+" "+aaa+")"+"\n"+"{"+"\n this."+aaa+" = "+aaa+";"+"\n}");
		                   pw.close();
		                   }
		                   catch(Exception e)
		                   {
		                   }
	            		 System.out.println("public " +type +" get"+aaa.substring(0,1).toUpperCase().concat(aaa.substring(1))+"()"+"\n"+"{"+"\nreturn this."+aaa+";"+"\n}");
	            		 System.out.println("public void"  +" set"+aaa.substring(0,1).toUpperCase().concat(aaa.substring(1))+"("+type+" "+aaa+")"+"\n"+"{"+"\n this."+aaa+" = "+aaa+";"+"\n}");
	            	 }
	            	 
	                 line++;  

	             }  

	             reader.close();  

	         } catch (IOException e) {  

	             e.printStackTrace();  

	         } finally {  

	             if (reader != null) {  

	                 try {  

	                     reader.close();  

	                 } catch (IOException e1) {  

	                 }  

	             }  

	         }  

	     }  
}
