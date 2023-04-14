package bank_exo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class BankService implements ExportData<Account> {

	List<Account> accounts = new ArrayList<>();
	
	@Override
	public void importData() {
		String filename = "src/bank_exo/data.txt";
		List<String> datas = new ArrayList<String>();
		try {
			datas = Files.readAllLines(new File(filename).toPath());
			
			for(String data : datas) {
				String[] data_separated = data.split(";");
				data.replaceAll("\"", "");
				double amount = Double.parseDouble(data_separated[1]);
				boolean blocked = Boolean.parseBoolean(data_separated[2]);
				double decouvert = Double.parseDouble(data_separated[3]);
				
				/*for(int i = 0 ; i < data_separated.length ; i++) {
					System.out.println(data_separated[i]);
				}*/
				
				Account account = new Account(data_separated[0], 
						amount,
						blocked,
						decouvert);
				accounts.add(account);
			}
			System.out.println("Toutes les données ont été importés avec succès !");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void exportData() {
		String filename = "src/bank_exo/data.txt";
		BufferedWriter writer;
		try {
			//réécrit toutes les données dans le fichier
			writer = new BufferedWriter(new FileWriter(filename));
			for(Account account : accounts) {
				writer.write(account.getId() + ";" + account.getAmount() + ";" + account.isBlocked() + ";" + account.getDecouvert() + "\n");
				writer.write("");
			}
		    writer.close();
		    
		    System.out.println("Toutes les données ont été exportés avec succès !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addDataOnFile(Account account) {
		String filename = "src/bank_exo/data.txt";
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(filename, true));
		    writer.append(account.getId() + ";" + account.getAmount() + ";" + account.isBlocked() + ";" + account.getDecouvert());
		    writer.append("");
		    
		    writer.close();
		    System.out.println("La donnée a été ajoutée dans le fichier avec succès !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(User user1, User user2, double amount) {
		if(user2.getAccount().lose(amount) != true) {
			System.out.println("*** Transaction annulée ! ***");
		}
		else {
			System.out.println("*** Transaction acceptée ! ***");
			user1.getAccount().add(amount);
			user2.getAccount().lose(amount);
		}
	}
	
	public Account findAccountById(User user) {
		for(int i = 0 ; i<accounts.size() ; i++) {
			String id_account = accounts.get(i).getId();
			if(id_account == user.getAccount().getId()) {
				return accounts.get(i);
			}
			else {
				System.out.println("Le compte que vous rechercher est inexistant.");
			}
		}
		return null;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	@Override
	public String toString() {
		return "BankService [accounts=" + accounts + "]";
	}
	
}
