package com;

import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();

		System.out.println(prop.getProperty("os.name"));
		System.out.println(prop.getProperty("os.arch"));

	}

}
