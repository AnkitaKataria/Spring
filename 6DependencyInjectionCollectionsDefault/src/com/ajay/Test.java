package com.ajay;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List fruits;
	private Set cricketers;
	public Map cc;
	
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCc() {
		return cc;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
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
	
}
