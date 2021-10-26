package com.cg.day5.exc;

public class ThrowDemo {

	static void checkEligibilty(int age) {

		if (age < 18) {
			throw new CanNotVoteException("Can not vote.");
		} else {
			System.out.println("Vote for India.");
		}
	}

	public static void main(String args[]) {

		System.out.println("Election...");

		try {
			ThrowDemo.checkEligibilty(15);
		} catch (CanNotVoteException cnve) {
			System.out.println(cnve.getMessage());
		}
		System.out.println("end");
	}

}