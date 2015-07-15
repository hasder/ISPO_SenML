package com.eislab.ipso;

import java.util.ArrayList;

public class IPSO_SenML {
//		SenML JSON Data Type
//		Measurements e Array: Sensor Measurements
//		Name n String: Name of the sensor
//		Units u String: Unit of measurement
//		Value v Floating point: Value of the entry
//		String Value sv String: String value of the entry
//		Boolean Value sv String: Boolean value of the entry
//		Value Sum s Floating Point: Sum of values over Time
//		Time t Number: Time when the value was recorded
//		Update Time ut Number: Maximum time before which sensor will update this value
		public ArrayList<IPSO_SenML_Object> e = new ArrayList<IPSO_SenML_Object>();
		public String bn;
	
}
