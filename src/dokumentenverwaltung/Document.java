package dokumentenverwaltung;

public class Document 
{
	protected String fileName; // Variable fileName kann innerhalb der Vererbung verwendet werden, au�erhalb ist es nicht aufrufbar.
 
	public Document(String fileName) {
		this.fileName = fileName;
	}
	public void printDocument() // Basis Ausdruck Methode
	{
		System.out.println(fileName);
	}

}
