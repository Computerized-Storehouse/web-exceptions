package telran.storehouse.exceptions;

@SuppressWarnings("serial")
public class OrderNotFoundException extends NotFoundException {
	public  OrderNotFoundException() {
		super("Order not found");
	}

}
