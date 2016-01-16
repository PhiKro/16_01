package dokumentenverwaltung;

import java.util.ArrayList;

public class Demo {

	public static void main (String Args[])
	{
		Document Test = new Document("Test1");
		Test.printDocument();
		
		TextDocument Text = new TextDocument("Text1", "Das ist ein Test");
		Text.printDocument();
		
		ImageDocument Bild = new ImageDocument("Bild1", 5, 6, "blau");
		Bild.printDocument();
		
		ArrayList csvContent = new ArrayList<>();
		csvContent.add("Das, Ist, ein, Test");
		
		CsvDocument csv1 = new CsvDocument("CSV File", csvContent);
		csv1.printDocument();
		csv1.addLine("Das auch");
		csv1.printDocument();
		
		Document csvDoc2 = new CsvDocument("Doc2", csvContent); //Polymorphie 
		csvDoc2.printDocument();
		
	}
}
