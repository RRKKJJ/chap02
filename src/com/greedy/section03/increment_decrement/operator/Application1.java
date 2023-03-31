package com.greedy.section03.increment_decrement.operator;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20;
		System.out.println("num : " + num);

		num++;
		System.out.println("num : " + num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		int firstNum = 20;
		int resultNum = ++firstNum * 3;
		
		int secondNum = 20;
		int resultNum2 = secondNum++ * 3;
		
		System.out.println("resultNum : " + resultNum);
		System.out.println("firstNum : " + firstNum);
		System.out.println("resultNum2 : " + resultNum2);
		System.out.println("secondNum : " + secondNum);
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1++); // 10
		System.out.println("num1 : " + num1 + " / num2 : " + num2 + " / num3 : " + num3);
		System.out.println((++num1) + (num2++)); //12 + 20 = 32
		System.out.println("num1 : " + num1 + " / num2 : " + num2 + " / num3 : " + num3);
		System.out.println((num1++) + (--num2) + (--num3)); // 12 + 20 + 29 = 61 
		System.out.println("num1 : " + num1 + " / num2 : " + num2 + " / num3 : " + num3);	
		
	}

}
