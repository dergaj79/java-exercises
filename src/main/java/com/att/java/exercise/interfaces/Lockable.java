package com.att.java.exercise.interfaces;

public interface Lockable {
	boolean lock(Key k);
	boolean unlock(Key k);
	boolean isLocked();

}
