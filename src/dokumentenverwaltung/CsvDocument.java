package dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document{

	ArrayList<String> lines;

	public CsvDocument(String fileName, ArrayList<String> lines) 
	{
		super(fileName); //gibt den fileName an den Konstrucktor aus der Klasse Document weiter. 
		this.lines = lines;
	}
	
	@Override
	public void printDocument() 
	{
		System.out.println("CsvDocument:" +fileName);
		for (String string : lines) 
		{
			System.out.println(string); //ausgabe aller Arralist Inhalte Line für Line 
		}
	}

	// Alternative ausgabe Möglichkeit to String
//	@Override 
//	public String toString() {
//		return "CsvDocument [lines=" + lines +  "]";
//	}
	
	
	
	public void addLine(String line) //Hinzufügnen neuer Lines in die Arraylist. 
	{
		lines.add(line);
	}
	
}
