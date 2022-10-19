package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(2));
		
		// String e um objeto Imutavel
		// Ex: Você numca vai modificar valor original iniciado com String
		String s = "Bom dia!";
		s = s.toUpperCase();
		// Aqui esta sendo substituindo o valor
		s = "Bom dia";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		// Verificando se String inicia com alguma coisa
		System.out.println(s.startsWith("Bom"));
		// Verificando se começa com uma palavra em minuscula
		System.out.println(s.toLowerCase().startsWith("bom"));
		// Verificando se termina com conjunto de caracteres.
		System.out.println(s.endsWith("dia"));
		// Verifica a igualdade entre as strings
		System.out.println(s.equals("boa tarde"));
		// Verifica a igualdade entre as strings ignorando letras maiuscula
		System.out.println(s.equalsIgnoreCase("boa tarde"));	
		
		/*
		 * .charAt() -> Verifica um caratere na posição da string (lembrando e as posiçoes começam 0) 
		 * .toLowerCase() -> Deixa string em minuscula
		 * .toUppercase() -> Deixa string em maiuscula
		 * .startsWith() -> Verifica se na string começa com determinado conjunto de caracteres.
		 * .concat() -> Concatena uma string com outra semelhante ao +
		 * .endsWith() -> Verificando se string termina com um conjunto de caracteres
		 * .equals() -> Verifica a igualdade entres strings
		 * .equalsIgnoreCase() -> Verifica a igualdade entres strings ignorando caracteres Maiusculos e Minusculos
		 * */
		
		// Podemos usar mesmo metodos para variaveis usando var
		var nome = "Walber";
		var sobrenome = "Vaz";
		var salario = 2500.67;
		/// System.out.println(nome.toUpperCase());
		
		// String formatada ao inves de usar +
		System.out.printf("Nome: %s\nSobrenome: %s\nSalario: R$%.2f\n", 
				nome, sobrenome, salario);
		// mesma coisa que usar System.out.printf
		String frase = String.format("Nome: %s\nSobrenome: %s\nSalario: R$%.2f", 
				nome, sobrenome, salario);
		System.out.println(frase);
	}

}
