package in.arunIT.beans;

public class CreditCardPayments implements IPayment{
	
	public CreditCardPayments() {
		// TODO Auto-generated constructor stub
		System.out.println("CreditCardPayments:: Constructor");
	}

	public boolean paybill(double amt) {
		// TODO Auto-generated method stub
		System.out.println("CreditCard Payment is processing.....");
		return false;
	}
	

}
