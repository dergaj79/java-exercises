package com.att.java.solution.interfaces;

import com.att.java.exercise.interfaces.Door;
import com.att.java.exercise.interfaces.Key;

public class KeyLockingDoor implements Door {
	private static final Key KEY = new Key("secret");
			
	private boolean isOpened = false;
	private boolean islocked = true;
	
	@Override
	public boolean isOpen() {
		return isOpened;
	}

	@Override
	public boolean open() {
		//Manage to open only if door is unlocked
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

	@Override
	public boolean lock(Key key) {
		if (isOpened) {
			System.out.println("Must close door first!");
			return false;
		}
		
		if (isValid(key)) {
			islocked = true;
			return true;
		} 
		else {
			System.out.println("Must provide a valid key!");
			return false;
		}
	}

	@Override
	public boolean unlock(Key key) {
		if (isOpened || !islocked) {
			return true;			
		}
		
		if (isValid(key)) {
			islocked = false;
			return true;
		} 
		else {
			System.out.println("Must provide a valid key!");
			return false;
		}
	}

	@Override
	public boolean isLocked() {
		return islocked;
	}

	
	private boolean isValid(Key key) {
		return key.getKey().equals(KEY.getKey());
	}

	@Override
	public boolean isClose() {
		// TODO Auto-generated method stub
		return false;
	}
}
