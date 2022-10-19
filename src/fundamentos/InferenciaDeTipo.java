package fundamentos;

public class InferenciaDeTipo {
	public static void main(String[] args) {
		// Inferência de tipo e não passar o tipo da variavel
		// Variavel em Java as Variavel são Imultavel
		// var so pode ser usada com a variavel ja inicializada
		double a = 4.5;
		System.out.println(a);
		
		// Inferência de tipo
		var b = 4.5;
		System.out.println(b);
		
		var c = "Print";
		System.out.println(c);
	}
}
