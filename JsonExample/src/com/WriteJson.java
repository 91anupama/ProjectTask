package com;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {
	public static void main(String[] args) throws IOException {
		JSONObject obj=new JSONObject();
		obj.put("name", "abc");
		obj.put("age", 25);
		JSONArray list=new JSONArray();
		list.add("address 1");
		list.add("address 2");
		list.add("address 3");
		obj.put("addresses", list);
		try(FileWriter file=new FileWriter("test.json")){
			file.write(obj.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	
		
	}
}
