package com.cg.day7.coll;

import java.util.ArrayList;

import com.cg.day6.App;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(arr[4]);

		ArrayList myList = new ArrayList();

		App obj = new App();

		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(new App());
		myList.add(obj);

		System.out.println(myList);

		System.out.println(myList.get(2));

	}
}