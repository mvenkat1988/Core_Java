package com;

import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

class ArthmaticEx{
	public void getArithmeticException() {
		try {
			System.out.println("------ArithmeticException----------");
			int i=10/0;
			System.out.println(i);
			System.out.println("------End----------");
		}catch (NullPointerException ne){
			System.out.println("NullPointerException--Catch-Block-->"+ne);
		}catch (ArithmeticException ae){
			System.out.println("ArithmeticException--Catch-Block-->"+ae);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("Exception--Catch-Block-->"+e);
		}
	}
	

	public void getNullPointerException() {
		System.out.println("------NullPointerException----------");
		String s = "abc";
		// if(s!=null){
		/*if (s == null) {
			System.out.println("this is if-block---->");
		} else {*/
		if(s!=null){
			System.out.println("-----Start----");
			try {
				if (s.equals("krishna") || s.equals("Yaswanth") || s.equals("Venkat")) {
					System.out.println("hi.....");
				} else {
					System.out.println("hi how are you---->");
				}
				System.out.println(s);
				System.out.println("------End----------");
			}  catch (ArrayIndexOutOfBoundsException aibe) {
				System.out.println("ArrayIndexOutOfBoundsException--Catch-Block-->" + aibe);
			}
			catch (NullPointerException ne) {
				System.out.println("NullPointerException--Catch-Block-->" + ne);
			} catch (ArithmeticException ae) {
				System.out.println("ArithmeticException--Catch-Block-->" + ae);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e);
				System.out.println("Exception--Catch-Block-->" + e);
			}

		}
	}


	public void getArrayIndexOutOfBoundsException() {
		System.out.println("------getArrayIndexOutOfBoundsException----------");
			try {
				int a[]=new int[5];//declaration and instantiation.
				a[0]=10;//initialization.
				a[1]=20;
				a[2]=70;
				a[3]=80;
				a[4]=90;
				a[5]=100;
				
			} catch (NumberFormatException nfe) {
				System.out.println("NumberFormatException--Catch-Block-->" + nfe);
			}  catch (ArrayIndexOutOfBoundsException aibe) {
				System.out.println("ArrayIndexOutOfBoundsException--Catch-Block-->" + aibe);
			}
			catch (NullPointerException ne) {
				System.out.println("NullPointerException--Catch-Block-->" + ne);
			} catch (ArithmeticException ae) {
				System.out.println("ArithmeticException--Catch-Block-->" + ae);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e);
				System.out.println("Exception--Catch-Block-->" + e);
			}

		}
	
	public void getNumberFormatException() {
		try {
			System.out.println("------NumberFormatException----------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter i Value--->");
			//int i = sc.nextInt();
			String i = sc.next();
			System.out.println("Eneter j Value--->");
			int j = sc.nextInt();
			int sum = Integer.parseInt(i)+j;
			System.out.println(sum);
			System.out.println("------End----------");
		}catch (InputMismatchException ime){
			System.out.println("InputMismatchException--Catch-Block-->"+ime);
		} catch (NumberFormatException nfe){
			System.out.println("NumberFormatException--Catch-Block-->"+nfe);
		} catch (NullPointerException ne){
			System.out.println("NullPointerException--Catch-Block-->"+ne);
		}catch (ArithmeticException ae){
			System.out.println("ArithmeticException--Catch-Block-->"+ae);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("Exception--Catch-Block-->"+e);
		}finally {
			System.out.println("am Staying in USA....");
		}
	}
	
	public void getInputMismatchException() {
		try {
			System.out.println("------getInputMismatchException----------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Eneter i Value--->");
			int i = sc.nextInt();
			//String i = sc.next();
			System.out.println("Eneter j Value--->");
			int j = sc.nextInt();
			int sum = i+j;
			System.out.println(sum);
			System.out.println("------End----------");
		}catch (InputMismatchException ime){
			System.out.println("InputMismatchException--Catch-Block-->"+ime);
		} catch (NumberFormatException nfe){
			System.out.println("NumberFormatException--Catch-Block-->"+nfe);
		} catch (NullPointerException ne){
			System.out.println("NullPointerException--Catch-Block-->"+ne);
		}catch (ArithmeticException ae){
			System.out.println("ArithmeticException--Catch-Block-->"+ae);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("Exception--Catch-Block-->"+e);
		}
	}
	



	}

	

public class UnchckedExceptionEx {
public static void main(String[] args) {
	ArthmaticEx aa = new ArthmaticEx();
	//aa.getArithmeticException();
	//aa.getNullPointerException();
	//aa.getArrayIndexOutOfBoundsException();
	//aa.getInputMismatchException();
	aa.getNumberFormatException();
}
}
