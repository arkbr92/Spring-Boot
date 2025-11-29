package in.arunit;

public class Atm {
	
	private IPrinter printer;
	 public Atm() {
		// TODO Auto-generated constructor stub
		 System.out.println("No Param Constructor");
	}
	 
	 public Atm(IPrinter printer) {
			// TODO Auto-generated constructor stub
			 System.out.println("One Param Constructor");
		}
	 
	 public void setPrinter(IPrinter printer) {
		this.printer = printer;
		System.out.println("Set Printer Method call");
	}

	 public void withdraw() {
		 System.out.println("Receipt is printing");
		 printer.print();
		
	}

}
