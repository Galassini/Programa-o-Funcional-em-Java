package qintess.academiajava.lampdas.interfaces;

@FunctionalInterface
public interface Validacao<T> {
	boolean validar(T item);

}
