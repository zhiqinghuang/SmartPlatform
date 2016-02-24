package com.netmap.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestCase {

	@org.junit.Test
	public void test() {
		appendToFiles("D:/workspace/SmartPlatform/SmartPlatform/src/main/java");
	}

	public static void appendToFiles(String sourcePathName) {
		try {
			File file = new File(sourcePathName);
			String[] fileList = file.list();
			int length = fileList.length;
			for (int i = 0; i < length; i++) {
				String lstrChildFile = fileList[i];
				File tempSourceFile = new File(sourcePathName, lstrChildFile);
				if (tempSourceFile.isDirectory()) {
					appendToFiles(sourcePathName + File.separator + lstrChildFile);
				} else if (tempSourceFile.isFile()) {
					if(tempSourceFile.getName().endsWith(".java")){
						appendToFile(sourcePathName + File.separator + lstrChildFile, "\r\n//need to confirm");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void appendToFile(String file, String conent) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
			out.write(conent);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}