package qintess.academiajava.lampdas.aplicacao;

import java.util.function.Predicate;

import qintess.academiajava.lampdas.interfaces.Validacao;

public class AppValidacao {
	//boolean validar(T item);
	public static void main(String[] args) {
		// T: String
		Validacao<String> v1 = s -> s.length() > 10;
		System.out.println(v1.validar("Java"));
		
		// T: Integer
		Validacao<Integer> v2 = s -> s > 100;
		System.out.println(v2.validar(120));
		
		Predicate<String> v3 = s -> s.length() > 10;
		System.out.println(v3.test("Java"));
	}

}
