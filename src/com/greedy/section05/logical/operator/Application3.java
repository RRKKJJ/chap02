package com.greedy.section05.logical.operator;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int num1 = 10;
		
		int result1 = (false && ++num1 > 0)? num1 : num1;
		
		System.out.println("&&실행 확인 : " + result1);
		
		
		int num2 = 10;
		
		int result2 = (true || ++num2 > 0)? num2 : num2;
		
		System.out.println("|| 실행 확인 : " + result2);
		
		
		

	}

}
