package com.greedy.section04.comparison.operator;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inum1 = 10;
		int inum2 = 20;
		
		System.out.println("-정수값 비교-");
		System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
		System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
		System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
		System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
		System.out.println("inum1이 inum2보다 작은 비교 : " + (inum1 < inum2));
		System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2));
		
		double dnum1 = 10.0;
		double dnum2 = 20.0;
		
		System.out.println("-실수값 비교-");
		System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
		System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
		System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
		System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
		System.out.println("dnum1이 dnum2보다 작은 비교 : " + (dnum1 < dnum2));
		System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : " + (dnum1 <= dnum2));
		
		char ch1 = 'a';
		char ch2 = 'A';
		System.out.println("-문자값 비교-");
		System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
		System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
		System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
		System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
		System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
		System.out.println("ch1이 ch2보다 작거나 같은지 비교 : " + (ch1 <= ch2));
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("-논리값 비교-");
		System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
		System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
		
		String st1 = "java";
		String st2 = "java";
		System.out.println("-문자열값 비교-");
		System.out.println("st1과 st2가 같은지 비교 : " + (st1 == st2));
		System.out.println("st1과 st2가 같지 않은지 비교 : " + (st1 != st2));
		

	}

}
