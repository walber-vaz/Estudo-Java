package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações de funcionarios
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumuladados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.03;
		
		// Tipos booleano
		boolean estaDeFerias = false; // true
		
		// Tipos caratere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println("O funcionario tem " + anosDeEmpresa * 365 + " dias de empresa");
		
		// Números de viagem
		System.out.println("O funcionario fez "+ numeroDeVoos / 2 + " viajes pela empresa");
		
		// Pontos acumulados
		System.out.println("O funcionario fez "+ pontosAcumuladados / vendasAcumuladas + " milhas por viajem");
		
		// Valor do salario
		System.out.println("O ID " + id + ": ganha -> R$" + salario);
		
		// O status do funcionario
		System.out.println("O funcionario esta: " + status + ". Esta de ferias? " + estaDeFerias);
	}
}
