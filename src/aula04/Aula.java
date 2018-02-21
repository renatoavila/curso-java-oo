package aula04;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Aula {

	int x = 1;	
	String y = "Ola";
	String z = "Mundo!";
	
	void soma(int a, int b) {
		int soma = a + b;
		System.out.println("A soma e: " + soma);
	}
	
	int subtracao(int a, int b) {
		return a - b;
	}
	
	public static void main(String...args) {
		
		Aula a = new Aula();
		int x2 = a.x + 2;
		
		System.out.println("Valor de x: " + a.x);
		System.out.println("Valor de x2: " + x2); 
		
		System.out.println(a.y + " " + a.z);
		
		a.soma(2, 5);
		
		int sub = a.subtracao(10, 7);
		System.out.println("Resultado: " + sub);
		
		for (int i = 0; i < 5; i++) {
			a.soma(x2, i);
		}
	}
}
