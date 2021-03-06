package com.att.java.exercise.interfaces;

public class NonLockingDoor implements Door {
	
	private boolean open = false;
	private boolean isClosed = false;
	
	@Override
	public boolean isOpen() {
		return this.open;
	}
	
	@Override
	public boolean isClose() {		
		return isClosed;
	}
	
	@Override
	public boolean open() {
		this.open = true;
		return true;
	}

	@Override
	public boolean close() {
		this.open = false;
		return true;
	}

	@Override
	public boolean lock(Key k) {
		return true;
	}

	@Override
	public boolean unlock(Key k) {
		return true;
	}

	@Override
	public boolean isLocked() {
		return false;
	}


}
