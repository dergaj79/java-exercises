package com.att.java.exercise.interfaces;

public class Tester {
    public static void main (String[] args) {
        KeyLockingDoor  keyLockingDoor = new KeyLockingDoor ();
        Key key1 = new Key ("1234");



        System.out.println ("open : " + keyLockingDoor.open ());
        System.out.println ("close :" + keyLockingDoor.close ());

        System.out.println ("lock :" + keyLockingDoor.lock (key1));
        System.out.println ("unlock :" + keyLockingDoor.unlock (key1));


        System.out.println ("isOpen : " + keyLockingDoor.isOpen ());
        System.out.println ("islocked : " + keyLockingDoor.isLocked ());




    }
}
