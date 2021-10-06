public class TesteConexao {

	public static void main(String[] args) {
	
		
		try(Conexao conexao = new Conexao()){
				conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
}
}