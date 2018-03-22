package com.att.java.exercise.interfaces;

public class AnotherCloseableDoor implements Closeable {
	
	private boolean isOpened = false;
	private boolean isClosed = false;
	private boolean islocked = true;
	
	
	@Override
	public boolean isOpen() {
		return isOpened;
	}
	
	public boolean isClose() {		
		return isClosed;
	}

	@Override
	public boolean open() {
		if (!islocked) {
			isOpened = true;
		}
		return isOpened;
	}

	@Override
	public boolean close() {
		isOpened = false;
		return true;
	}

}
