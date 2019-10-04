package com.virt.str;

import java.util.HashMap;
import java.util.List;

public class TraineeMap extends HashMap<Character, List<String>> {
	String name;
	char ch = ' ';

	public String insert(String name) {
		name=name.toLowerCase();
		ch=name.charAt(0);
	//	List<String> list
		//HashMap<Character, String> t1 = new HashMap<>();
		
//		t1.put(ch, name);
		ch++;
		return name;
	}

	public static void main(String[] args) {
		TraineeMap traineeMap=new TraineeMap();
		traineeMap.insert("supriya");
		traineeMap.insert("sumit");
		traineeMap.insert("raj");
		traineeMap.insert("sound");
		traineeMap.insert("mahesh");
		System.out.println(traineeMap);
	}

}
