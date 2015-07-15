package com.eislab.ipso;

import com.google.gson.Gson;

public class IPSO_SenML_Example {

	public static void main(String[] args) {
		
		
		makeIpsoSenMLJsonObject();
		parseIpsoSenMLJsonObject();
		
		
	}
	
	static void makeIpsoSenMLJsonObject()
	{
		IPSO_SenML object = new IPSO_SenML();
		Gson gson = new Gson();
		IPSO_SenML_Object oject = new IPSO_SenML_Object();
		oject.setN("test");
		oject.setSv("x,y");
		
		object.e.add(oject);
		object.bn="syntheticRsource";
		String tempTest = gson.toJson(object);

		System.out.println("object: " + tempTest);
	}
	
	static void parseIpsoSenMLJsonObject()
	{
		IPSO_SenML object = new IPSO_SenML();
		String tempTest = "{\"e\":[{ \"n\": \"syn_aaaa\", \"u\": \"m\", \"sv\": \"x,y\", \"t\": 123456 }],\"bn\": \"urn:dev:mac:syn_5555\"}";
		Gson gson = new Gson();
		object = gson.fromJson(tempTest, IPSO_SenML.class);
		for (IPSO_SenML_Object oject : object.e) {
			System.out.println("Name: " + oject.getN());
		}
	}
}
