package bank_exo;

public class Main {

	public static void main(String[] args) {
		//création de données
		Account ac1 = new Account("21", 1800, false, 100);
		Account ac2 = new Account("22", 0, false, 100);
		User user1 = new User("15", "Patrick", "Jean", ac1);
		User user2 = new User("16", "Jean","Uber", ac2);
		
		/*System.out.println(user1.toString() + " ; " + ac1.toString() );
		System.out.println(user2.toString() + "; " + ac2.toString() );
		
		ac1.add(210);
		System.out.println(ac1.getAmount());
		ac1.lose(10);
		System.out.println(ac1.getAmount());
		
		ac1.lose(2100);
		System.out.println(ac1.getAmount());*/
		
		
		//banque service
		BankService bankService = new BankService();
		bankService.accounts.add(ac1);
		bankService.accounts.add(ac2);
		Account acARecup = bankService.findAccountById(user1);
		
		System.out.println(acARecup.toString());
		bankService.send(user1, user2, 200);
		ac2.add(1000);
		
		bankService.send(user1, user2, 200);

		
		//importation
		bankService.accounts.remove(ac1);
		bankService.accounts.remove(ac2);
		bankService.importData();

		System.out.println(bankService.toString());
		
		//exportation
		bankService.accounts.add(ac1);
		bankService.accounts.add(ac2);
		bankService.exportData();

	}

}
