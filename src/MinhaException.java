
public class MinhaException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public MinhaException(String msg) {
		throw new  MinhaException("Deu errado");
	}

}
