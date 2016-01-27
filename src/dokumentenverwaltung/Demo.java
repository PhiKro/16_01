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
		
		Document csvDoc2 = new CsvDocument("Doc2", csvContent);  // Upcasting Verwenden der Basisklasse für ein Objekt der Erbenden Klasse 
		csvDoc2.printDocument();//Polymorphie
		
		CsvDocument csvDoc3 = (CsvDocument)csvDoc2; // Downcasting Übertragen eines Objekts mit korrekten eigenschaften auf ein Objekt einer darunterliegenden Klasse. 
													// Der in Klammer gesetzte Datentyp überschreibt den besteheneden Datentyp des Objekts.
		csvDoc3.addLine("Test, nach dem Downcast");
		csvDoc3.printDocument();
		
		ArrayList<Document> printMe = new ArrayList<>();
		printMe.add(csvDoc3);
		System.out.println("------------------");
		System.out.println("------------------");
		
		PrintManager printMa = new PrintManager(printMe);
		printMa.printAll();
		System.out.println("------------------");
		System.out.println("------------------");
		printMa.addDocument(csvDoc2);
		printMa.addDocument(Bild);
		printMa.addDocument(Text);
		printMa.printAll();
	}
}
