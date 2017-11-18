package saferefactor.core;

public class CompilationErrorException extends Exception {

	public CompilationErrorException(Exception e) {
		super(e);
	}

}
