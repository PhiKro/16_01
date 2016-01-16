package dokumentenverwaltung;

public class ImageDocument extends Document{
	private int sizeX;
	private int sizeY;
	private String colour;
	
	public ImageDocument(String fileName, int sizeX, int sizeY, String colour) 
	{
		super(fileName); //gibt den fileName an den Konstrucktor aus der Klasse Document weiter. 
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.colour = colour;
	}

@Override
	public void printDocument() // Klasseninterne Methode Print ersetzt die Methode printDocument() aus Document.
	{
		System.out.println("Bilddokument" + fileName + "\n" + " Dieses Bild kann nicht wiedergegeben werden");
	}
	

}
