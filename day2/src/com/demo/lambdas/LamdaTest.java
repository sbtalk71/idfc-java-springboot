package com.demo.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaTest {
public static void main(String[] args) {
	
	Consumer<String> consumer=(s)->System.out.println(s);
	
	consumer.accept("Lion");
	
	Function<String, String> f=(s)->s+" Hello";
	System.out.println(f.apply("John"));
	
	Predicate<String> p=(s)->s.equals("tiger");
	
	System.out.println(p.test("tiger"));
}
}
