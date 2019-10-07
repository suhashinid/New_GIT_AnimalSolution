/**
 * 
 */
package com.main.java.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;
/**
 * @author Sahasra_Suhas
 *
 */
public class PropertiesUtil {
	
	  public static void main(String[] args) {
	    
		  Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
		  String path1 = getProperty("Duck");
	       System.out.println(path+"Current relative path is: " + path1);
	  }
	
	 /**
     * Gets all properties names in properties file
     */
	  public static String getProperty(String propName)
	    {
	       String value = "";
	       String CONFIG_FILE= "C:\\workspace\\AnimalFinalSolution\\src\\com\\main\\resources\\voice.properties";
	       try
	       {
	          // open the file to get the Properties
	          Properties props = new Properties();
	          
	          FileInputStream propFile = new FileInputStream(CONFIG_FILE);
	          props.load(propFile);

	          value = props.getProperty(propName);
	          propFile.close();
	       }
	       catch (Exception e)
	       {
	          /*@*/
	          System.out.println("Got exception reading CONFIG_FILE"+e + CONFIG_FILE);
	          /**/

	          value = "";
	       }

	       return value;
	    }
   
}
