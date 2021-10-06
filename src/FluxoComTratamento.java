public class FluxoComTratamento {
	
	/*
	 * Codigo com exceções
	 * Aula sobre exceçoes
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();
		}catch (ArithmeticException  | NullPointerException e) {
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

	private static void metodo2() {
		System.out.println("Inicio do Metodo 2");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
				//int a = i/0;	
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo 2");
	}	
}