package com.Adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	static Properties p;

	
	public ConfigurationReader() throws IOException {
		
		File f = new File("/Users/jokaaru/eclipse-workspace/CucumberProject/src/test/java/com/Adactin/properties/Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fis);
	}
	
	public String getBname() {
		String bname = p.getProperty("browser");
		return bname;
		
	}
	
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUname() {
		String Uname = p.getProperty("uname");
		return Uname;
	}
	
	public String getPwd() {
		String Pwd = p.getProperty("pwd");
		return Pwd;
	}
	
	
	
	
	
	
	
}
