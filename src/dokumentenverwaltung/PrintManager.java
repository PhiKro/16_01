package dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager {
	
	ArrayList<Document> printer;
	
	
	public PrintManager(ArrayList<Document> printer) {
		this.printer = printer;
	}

	public void addDocument(Document d)
	{
		printer.add(d);
	}

	public void printAll()
	{
		for (Document document : printer) {
			document.printDocument();
		}
	}
	
	public Document findDocument (String fileName)
	{
		for (Document document : printer) 
		{
			if (document.getFileName().equals(fileName))
			{
				return document;
			}
		} 
			return null;
	}
}
