package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// Formula para converter celsius para Farenhart
		// (Fº - 32) x 5 / 9 = ºC
		
		final double SUB = 32;
		final double DIV = 5.0 / 9.0;
		
		double temperturaF = 86;
		double conversaoFtoC = (temperturaF - SUB) * DIV;
		
		System.out.println("O valor em Fº " + temperturaF + " convertido para Cº " + conversaoFtoC);
	}
}
