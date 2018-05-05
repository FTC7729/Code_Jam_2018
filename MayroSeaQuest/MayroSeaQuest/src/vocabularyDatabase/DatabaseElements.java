package vocabularyDatabase;

public class DatabaseElements {
	String	strAlias;
	String	strRoot;
	
	public DatabaseElements() {
		strAlias = "";
		strRoot = "";
	} // Constructor
	
	public DatabaseElements(String strNewAlias,
							String strNewRoot) {
		strAlias = strNewAlias;
		strRoot = strNewRoot;
	} // Constructor with paramters to load
} // DatabaseElements class
