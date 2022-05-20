package org.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataTable {
	
	public static void main(String[] args) {
		
		//id without header
		List<String> li = new ArrayList<>();
		li.add("bala");
		li.add("bala@gmail.com");
		li.add("bala123");
		
		String string = li.get(2);
		System.out.println(string);
		
		//1d with header
		
		Map<String, String> mp = new LinkedHashMap<String, String>();
		mp.put("name", "bala");
		mp.put("email", "bala@gmail.com");
		mp.put("pass", "bala123");
		
		String string2 = mp.get("pass");
		System.out.println(string2);
		
		//2D without header
		List<List<String>> l = new ArrayList<>();
		
		List<String> l1 = new ArrayList<>();
		l1.add("murugan");
		l1.add("murugan123@gmail.com");
		l1.add("murugan123");
		
		List<String> l2 = new ArrayList<>();
		l2.add("ash");
		l2.add("ash123@gmail.com");
		l2.add("ash123");
		
		l.add(l1);
		l.add(l2);
		
		List<String> list = l.get(0);
		String string3 = list.get(0);
		System.out.println(string3);
		
		//2D with header
		
		List<Map<String, String>> b = new ArrayList<>();
		
		Map<String, String> m = new LinkedHashMap<>();
		m.put("name", "mani");
		m.put("mail", "mani@gmail.com");
		m.put("pass", "mani123");
		
		Map<String, String> m1 = new LinkedHashMap<>();
		m1.put("name", "soma");
		m1.put("mail", "soma@gmail.com");
		m1.put("pass", "soma123");
		
		b.add(m);
		b.add(m1);
		
		Map<String, String> map = b.get(1);
		String string4 = map.get("mail");
		System.out.println(string4);
		
		
		
		
		
		
		
	}

}
