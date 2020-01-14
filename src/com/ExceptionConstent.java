package com;

public class ExceptionConstent  extends Throwable{
	ExceptionConstent() {
		getInvalidData();
	}

	private void getInvalidData() {
		System.out.println(ConstantDetails.ENTERED_INVALID);
		
	}

	public void getInvalidData1()throws Throwable {
		System.out.println(ConstantDetails.ENTERED_INVALID);
		//return "your entered invalid Data----"; 
	}

}
