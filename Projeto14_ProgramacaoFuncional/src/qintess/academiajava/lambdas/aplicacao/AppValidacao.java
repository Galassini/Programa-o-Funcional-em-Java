package qintess.academiajava.lambdas.aplicacao;

import java.util.function.Predicate;

import qintess.academiajava.lambdas.interfaces.Validacao;

public class AppValidacao {
	//boolean validar(T item);
	public static void main(String[] args) {
		Validacao<String> v1 = s -> s.length() > 10;
		System.out.println(v1.validar("Java"));
		
		// T: Integer
		Validacao<Integer> v2 = s -> s > 100;
		System.out.println(v2.validar(120));
		
		Predicate<String> v3 = s -> s.length() > 10;
		System.out.println(v3.test("Java"));
		
	}
}
