public class Fluxo {
	
	/*
	 * Codigo com exceções
	 * Aula sobre exceçoes
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();
		}catch (ArithmeticException  |MinhaException |NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do Metodo 1");
	}

	private static void metodo2()throws MinhaException {
		System.out.println("Inicio do Metodo 2");
		 throw new  MinhaException("Deu errado");
		}	
}