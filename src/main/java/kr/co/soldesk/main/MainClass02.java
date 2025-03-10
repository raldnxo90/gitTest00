package kr.co.soldesk.main;

import kr.co.soldesk.bean.Hello;
import kr.co.soldesk.bean.HelloWorldEn02;
import kr.co.soldesk.bean.HelloWorldKr02;

public class MainClass02 {

	public static void main(String[] args) {
		
		Hello hello = new HelloWorldKr02();
		callMethod(hello);
	}
	
	public static void callMethod(Hello hello) {
		hello.sayHello();
	}
}
