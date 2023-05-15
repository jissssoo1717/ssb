package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
//@Setter
@Getter
public class HelloLombok {
	
	/*
	 * 속성에 final을 적용하고 lombok의 @RequiredArgsConstructor 어노테이션을 적용하면
	 * 해당 속성을 필요로 하는 생성자가 lombok에 의해 자동 생성됨 ==> DI(의존성 주입)
	 * !!!!!!!! final이 없는 속성은 생성자에 포함 XXXXX !!!!!!!!!
	 */
	private final String hello;
	private final int lombok;
	
	/*  아래와 같이 직접 생성자를 작성한 것과 동일한 기능
	public HelloLombok(String hello, int lombok) {
		this.hello = hello;
		this.lombok = lombok;
	}
	*/
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로", 5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}
