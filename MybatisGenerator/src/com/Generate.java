package com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generate {

	public static void main(String[] args) throws Exception {
		List<String> warns = new ArrayList<String>();
		String path = System.getProperty("user.dir");
		System.out.println("Generate.main()"+path);
		File configFile = new File(path+"/mySqlConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warns);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback dfShellCallback = new DefaultShellCallback(true);
		MyBatisGenerator myGenerator = new MyBatisGenerator(config, dfShellCallback, warns);
		myGenerator.generate(null);
		System.out.println(warns);
	}

}
