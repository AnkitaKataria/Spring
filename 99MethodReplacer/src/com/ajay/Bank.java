package com.ajay;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Bank{
	public void deposit() {
		System.out.println("Deposit");
	}
	
	public void withDraw() {
		System.out.println("WithDraw");
	}
	
	public void calInterest() {
		System.out.println("Interest");
	}
}
