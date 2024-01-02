package com.app.dao;

import java.util.List;

import com.app.model.Student;

public interface HomeDao {

	public void saveData(Student s);	
	public int loginCheck(String uname,String password);
	public List displayAllData();
	public Student editData(Student s);
	public void updateData(Student s);
	//public void deleteData(Student s);
	public void deleteData1(int uid);
	

}
