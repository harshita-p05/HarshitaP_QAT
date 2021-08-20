package QatTest_HarshitaP;

public class InterfaceImplementationMain {

	public static void main(String[] args) {
		
		SavingsAccount sa =  new SavingsAccount();
		
		CurrentAccount ac = new CurrentAccount();
		
		sa.checkBankBalance();
		sa.validateUser();
		
		ac.checkBankBalance();
		ac.validateUser();

	}

}
