package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// tipo String
		String s = "Olá, Mundo!!";
		
		// Trocar um caractere de uma string
		// mesma situação do toUpperCase()
		s = s.replace("!!", "!");
		
		// junta string
		s = s.concat(", Me livrei da maldição");
		
		// O metodo toUpperCase() so altera a valor onde ele foi chamado
		// Não altera o valor default da variavel
		// Para poder alterar pdoe fazer assim
		s = s.toUpperCase();
		
		System.out.println(s);
		
		// Outra forma de fazer igual acima
		String string = "Olá, Mundo!!"
				.replace("!!", "!")
				.concat(", Me livrei da maldição")
				.toUpperCase();
		System.out.println(string);
		
		// Tipos primitivo que não tem operador .
		// Não pode ter comportamento de atributos ao tipos primitivos
		// int a = 3;
		// a.
	}
}
