package in.arunIT.beans;

public class RestorentServices {
	private IPayment payment;
	
	public RestorentServices() {
		// TODO Auto-generated constructor stub
		System.out.println("RestorentServices::constructor");
	}
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public void proceepayment(double amt) {
		boolean status=payment.paybill(amt);
		if(status) {
			System.out.println("payment is completed");
		}else {
			System.out.println("Payment Failed");
		}
		
	}

}
