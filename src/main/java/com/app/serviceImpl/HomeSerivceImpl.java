package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HomeDao;
import com.app.model.Student;
import com.app.service.HomeService;

@Service
public class HomeSerivceImpl implements HomeService {

	@Autowired
	HomeDao hd;
	
	public void saveData(Student s) {
		
		hd.saveData(s);
		
	}

     public int loginCheck(String uname, String password) {
    	 
    	int i= hd.loginCheck(uname, password);
		
		return i;
	}

	public List displayAllData() {
		
		return hd.displayAllData();
	}

	public Student editData(Student s) {
		return hd.editData(s);
	}

	public void updateData(Student s) {
		hd.updateData(s);
	}

	/*
	 * public Student deleteData(Student s) { hd.deleteData(s); return s;
	 * 
	 * }
	 */

	public int deleteData1(int uid) {
		hd.deleteData1(uid);
		return 1;
	}


}
