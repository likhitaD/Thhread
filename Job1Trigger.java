package com.jbk;

public class Job1Trigger {
public static void main(String[] args) {
	
//	for(int i=0;i<10;i++){
//	System.out.println("In main>>"+i);
//	}
	System.out.println("in main>>"+Thread.currentThread().getName());
	
	Job1 jb= new Job1();
	jb.setName("abc...");
	jb.start();
	
	Job1 jb1= new Job1();
	jb1.setName("pqr...");
	jb1.start();
//	for(int i=20;i<30;i++){
	System.out.println("In main>>"+i);
//		}
	
}
}
