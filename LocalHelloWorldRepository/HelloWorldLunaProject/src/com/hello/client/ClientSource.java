package com.hello.client;

import com.hello.server.ServerSource;

public class ClientSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The total sum of the numbers is : " + ServerSource.addNumbers(4, 5));
		System.out.println("The total product of the numbers is : " + ServerSource.multiplyNumbers(4, 5));
	}

}
