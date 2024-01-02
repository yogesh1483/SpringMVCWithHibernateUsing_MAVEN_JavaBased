package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface HomeService {

	public void saveData(Student s);

	public int loginCheck(String un, String ps);
	public List displayAllData();
	public Student editData(Student s);
	public void updateData(Student s);
	//public Student deleteData(Student uid);
	public int deleteData1(int uid);

	
	

}
