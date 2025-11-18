package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		String filename = "test.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;
		
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			System.err.println("Lỗi: Không thể đọc file '" + filename + "'. Đảm bảo file tồn tại.");
			return; 
		}
		startTime = System.currentTimeMillis();
		StringBuilder outputString = new StringBuilder();
		for (byte b : inputBytes) {
			outputString.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
