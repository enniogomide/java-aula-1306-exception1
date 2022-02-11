package models.exception;

// Exceptio -> requer o tratamento de erro 
// RunTimeException -> quando ocorrer o erro tem que ter o tratamento, se não tiver o programa aborta sem controle

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
