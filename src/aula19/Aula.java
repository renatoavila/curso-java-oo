package aula19;

public class Aula {

	public static void main(String[] args) {
	
		System.out.println("Multiplicacao = " + new Aula().getCalculo(9, 5));
	}
	
	int getCalculo(int x, int y) {
		
		System.out.println("valor de x = " + x);
		
		System.out.println("valor de y = " + y);
		
		final int z = 10;
		
		class Calculo {
			
			private int a;
			private int b;
			
			Calculo() {
			}
			
			Calculo(int a, int b) {
				this.a = a;
				this.b = b;
			}
			
			int soma() {
				return x + y;
			}
			
			int multiplicar() {
				return a * b * z;
			}
		}
		
		System.out.println("Soma = " +  new Calculo().soma());
		
		return new Calculo(10, 2).multiplicar();
	}
}
