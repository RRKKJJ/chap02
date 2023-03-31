package com.greedy.section05.logical.operator;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 55;
		System.out.println("1 <= num1 <= 100 : " + (num1 >= 1 && num1 <= 100));
		
		int num2 = 155;
		System.out.println("1 <= num2 <= 100 : " + (num2 >= 1 && num2 <= 100));
		
		char ch1 = 'G'; 
		System.out.println("ch1이 영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
		
		char ch2 = 'g'; 
		System.out.println("ch2가 영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));
		
		char ch3 = 'y';
		System.out.println("ch3가 y인지 확인 " + (ch3 == 'y' || ch3 == 'Y'));
		
		char ch4 = 'Y';
		System.out.println("ch4가 y인지 확인 " + (ch4 == 'y' || ch4 == 'Y'));
		
		char ch5 = 'x';
		System.out.println("ch5가 y인지 확인 " + (ch5 == 'y' || ch5 == 'Y'));
		
		char ch6 = 'f';
		System.out.println("ch6가 영문자인지 확인 " + ((ch6 >= 'a' && ch6 <= 'z') || (ch6 >= 'A' && ch6 <= 'Z')));
		System.out.println("ch6가 영문자인지 확인 " + ((ch6 >= 97 && ch6 <= 122) || (ch6 >= 65 && ch6 <= 90)));
		
		
	}

}
