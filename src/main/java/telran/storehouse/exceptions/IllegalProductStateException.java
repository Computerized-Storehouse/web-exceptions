package telran.storehouse.exceptions;

@SuppressWarnings("serial")
public class IllegalProductStateException extends IllegalStateException {
	public IllegalProductStateException() {
		super("Product not found");
	}
}
