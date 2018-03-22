package com.att.java.exercise.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsStoreAsMap implements StudentsStore {
	private Map<String, Student> store = new HashMap<>();

	@Override
	public boolean addStudent(Student s) {
		if (store.containsKey(s.getId())) {
			return false;
		} 
		else {
			store.put(s.getId(), s);
			return true;
		}
	}

	@Override
	public Student getStudent(String id) {
		return store.get(id);

	}

	@Override
	public Student deleteStudent(String id) {
		if (store.get(id) != null) {
			store.remove(id);
		}
		System.out.println(" the Student is not exist in Map");
		return null;
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countStudents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
