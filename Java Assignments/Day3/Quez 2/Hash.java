package com.java;


import java.util.LinkedHashSet;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
	Set<String> values = new LinkedHashSet<>();
	values.add("Hai");
	values.add("Iam");
	values.add("Rajneesh");
	
	for(String i : values)
	{
		System.out.println(i);
	}

	}

}

