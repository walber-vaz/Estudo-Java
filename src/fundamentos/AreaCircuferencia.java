package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
		// Definido uma variavel
		// tipo nome = atribuição a variavel
		double raio = 3.4;
		// Constantes em Java e so atribuir 'final' ante do tipo da variavel
		final double PI = 3.14159;
		
		double area = PI * raio * raio; 
		
		System.out.println("Área = " + area + "m2.");
	}
}
