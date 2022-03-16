package Establishment.Login.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.opencsv.CSVReader;

public class CsvReader {
	//Read URL 
	public String ReadURL() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/URL.csv"));
		String[] nextLine;
		nextLine = reader.readNext();
		String URL = nextLine[0];
		reader.close();
		return URL;
	}
	
	//read the username and password correct with CSV file - number
	public List<String[]> LoginFileCorrectWhitNumber() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/LoginFileCorrect_WithNumber.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	
	//Factor List
	public List<String[]> FactorList() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login/SaleFactorsList.csv"),',','\'');
		List<String[]> newAccount = reader.readAll();
		reader.close();
		return newAccount;
	}
	
}
