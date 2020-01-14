package com;

public class CustmisedExcetionEx {
public static void main(String[] args) throws Throwable {
	CustmisedExcetionEx cc = new CustmisedExcetionEx();
	cc.getArithmeticException();
	String uname = "Venkat";
	String pwd = "Venkat11";
	
	if(uname.equals(ConstantDetails.UNAME)){
		System.out.println("UserName is correct.....");
	}else {
		throw new ArithmeticException("your entered UserName is invalid ----");
		//System.out.println("your entered UserName is invalid ----");
	}
	if(pwd.equals(ConstantDetails.PWD)){
		System.out.println("pwd is correct.....");
	}else {
		throw new ArithmeticException("your entered pwd is invalid ----");
		//System.out.println("your entered pwd is invalid ----");
	}
	
}
public void getArithmeticException() throws Throwable {
	ExceptionConstent ec = new ExceptionConstent();
	try {
		System.out.println("------ArithmeticException----------");
		int i=10/0;
		System.out.println(i);
		System.out.println("------End----------");
	}catch (NullPointerException ne){
		System.out.println("NullPointerException--Catch-Block-->"+ne);
	}catch (ArithmeticException ae){
		//throw new ExceptionConstent();
		ec.getInvalidData1();
		//throw new ArithmeticException("your entered invalid Data----");
		//System.out.println("ArithmeticException--Catch-Block-->"+ae);
	}catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e);
		System.out.println("Exception--Catch-Block-->"+e);
	}
}


}
