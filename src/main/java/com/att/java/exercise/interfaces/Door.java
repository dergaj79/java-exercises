package com.att.java.exercise.interfaces;

public interface Door {
	boolean isOpen();
	boolean isClose();
	boolean open();
	boolean close();
	boolean lock(Key k);
	boolean unlock(Key k);
	boolean isLocked();
}
