package com.java;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDob {

	public static void main(String[] args) {

		Date empDob1=new Date(12,6,1996);
		Date empDob2=new Date(8,6,1985);
		Date empDob3=new Date(12,6,1979);
	
		Map<Date,String >  EmpDobMap = new HashMap<>();
		EmpDobMap.putIfAbsent(empDob1,"jack");	
		EmpDobMap.putIfAbsent(empDob2,"jane");	
		EmpDobMap.putIfAbsent(empDob3,"sarah");	
	
		System.out.println(EmpDobMap);

	}

}