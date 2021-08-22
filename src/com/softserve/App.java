package com.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
        //
		System.out.print("num = ");
		String text = br.readLine();
		int num = Integer.parseInt(text);
		//
		num = num + 1;
		System.out.println("update num = " + num);
		br.close();

	}
}
