package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	public static void main(String[] args) throws Exception {
		JSONParser parser=new JSONParser();
		try(Reader reader=new FileReader("test.json")){
			JSONObject jobj=(JSONObject)parser.parse(reader);
			System.out.println(jobj);
			String name=(String)jobj.get("name");
			System.out.println(name);
			long age=(long)jobj.get("age");
			System.out.println(age);
			
			JSONArray addrs=(JSONArray)jobj.get("addresses");
			
			Iterator<String> itr=addrs.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

}
