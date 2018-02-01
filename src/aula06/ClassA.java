package aula06;

import aula05.ClassB;

public class ClassA {

	private String privado;
	
	protected String protegido;
	
	public String publico;
	
	String pacote;
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.pacote = "pacote a";
		a.protegido = "protegido a";
		a.publico = "publico a";
		a.privado = "privado a";
		
		ClassB b = new ClassB();
		b.publico = "publico b";		
		
	}
}
