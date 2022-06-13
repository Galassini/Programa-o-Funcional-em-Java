package qintess.academiajava.lambdas.aplicacao;

import qintess.academiajava.lambdas.interfaces.Operacao;

public class AppOperacao {
	//int executar(String s);
	public static void main(String[] args) {
		Operacao op1 = x -> x.length();
		System.out.println(op1.executar("Qintess"));
	}
}
