package QatTest_HarshitaP;

public class SavingsAccount implements BankAccount{
	
	@Override
	public void validateUser() {
		System.out.println("validate users in the savings account");
	}

	@Override
	public void checkBankBalance() {
		System.out.println("check balance in the savings account");
		
	}
}
