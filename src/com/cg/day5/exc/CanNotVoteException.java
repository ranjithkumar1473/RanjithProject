package com.cg.day5.exc;

public class CanNotVoteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	CanNotVoteException() {
		super();
	}

	CanNotVoteException(String message) {
		super(message);
	}
}