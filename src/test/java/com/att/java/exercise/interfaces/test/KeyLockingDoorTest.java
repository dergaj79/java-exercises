package com.att.java.exercise.interfaces.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.att.java.exercise.interfaces.Key;
import com.att.java.exercise.interfaces.KeyLockingDoor;
//import com.att.java.solution.interfaces.KeyLockingDoor;

public class KeyLockingDoorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOpen() {
		KeyLockingDoor door = new KeyLockingDoor();
		assertFalse(door.isOpen());
		assertTrue(door.isLocked());
		
		//Door cannot be opened if locked
		door.open();
		assertFalse(door.isOpen());
		
		//Unlock door
		door.unlock(new Key("secret"));
		assertFalse(door.isLocked());
		
		assertFalse(door.isOpen());
		door.open();
		assertTrue(door.isOpen());
		
	}

	@Test
	public void testClose() {
		KeyLockingDoor door = new KeyLockingDoor();
		door.unlock(new Key("secret"));
		door.open();
		assertTrue(door.isOpen());	
		assertFalse(door.isLocked());	
		
		//Close the door
		door.close();
		assertFalse(door.isOpen());
	}
	
//
	@Test
	public void testLock() {
		KeyLockingDoor door =  new KeyLockingDoor();
		assertFalse(door.isLocked());
		assertTrue(door.isOpen());
		
		door.isLocked();
		assertFalse(door.isLocked());
		
//		fail("Not yet implemented");
	}
//
//	@Test
//	public void testUnlock() {
//		fail("Not yet implemented");
//	}

}
