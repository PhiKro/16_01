package dokumentenverwaltung;

public class TextDocument extends Document // erbt Eigenschaften von der Klasse Document 
{ 
	private String contend;
	
	public TextDocument(String fileName, String contend)  
		{
			super(fileName); //gibt den fileName an den Konstrucktor aus der Klasse Document weiter. 
			this.contend = contend;
		}

@Override
	public void printDocument()  // Klasseninterne Methode Print ersetzt die Methode printDocument() aus Document. 
		{
			System.out.println("Textdokument" + fileName +"\n"+ contend);
		}

}
