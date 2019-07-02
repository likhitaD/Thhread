package com.jbk;

public class Job1 extends Thread{
	@Override
	public void run() {
		
		System.out.println("In Job>>"+Thread.currentThread().getName());
		//for(int i=11;i<20;i++)
			//System.out.println("In job>>"+i);
	//}

}
}