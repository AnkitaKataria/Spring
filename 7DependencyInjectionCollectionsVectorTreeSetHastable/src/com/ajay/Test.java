package com.ajay;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	//To use non default collection, we must change schema in xml file.
	private Vector fruits;
	private TreeSet cricketers;
	public Hashtable cc;
	
	public void printData() {
		for(Object fruit:fruits) {
			System.out.println((String)fruit);
		}
		
		for(Object cricketer:cricketers) {
			System.out.println(cricketer);
		}
		
		Set keyset=cc.keySet();
		for(Object key:keyset) {
			System.out.println("Key="+key+"..value="+cc.get(key));
		}
	}

	public Vector getFruits() {
		return fruits;
	}



	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}



	public TreeSet getCricketers() {
		return cricketers;
	}



	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}



	public Hashtable getCc() {
		return cc;
	}



	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	
}
