package com.java.design.patterns.structural.adaptor;

public class AdaptorTest {

	public AdaptorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
//		duck.fly();
//		duck.quack();
		
		Turkey turkey = new WildTurkey();
//		turkey.fly();
//		turkey.gobble();
		
		
		Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
		testingDuck(duck);
		
		testingDuck(turkeyAdaptor);

	}
	
	public static void testingDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}

}
