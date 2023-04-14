package bank_exo;

public interface ExportData<T> {
	
	void importData();
	
	void exportData();
	
	void addDataOnFile(T t);

}
