package QatTest_HarshitaP;

public class CurrentAccount implements BankAccount {

	@Override
	public void checkBankBalance() {
		System.out.println("check balance in the current account");
		
	}

	@Override
	public void validateUser() {
		System.out.println("Validate user in the current account");
		
	}
	
	

}
