package vocabularyDatabase;

import java.util.*;

public class VocabularyDatabase {
	
	ArrayList<DatabaseElements> arrlistDatabase;
	
	public VocabularyDatabase() {
		arrlistDatabase = new ArrayList<DatabaseElements>();
		loadDatabase();
	} // Constructor

	protected boolean loadDatabase() {
		boolean bReturn = false;
		String	strRoot;
		
		strRoot = new String("north");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("n", strRoot));
		
		strRoot = new String("south");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("s", strRoot));
		
		strRoot = new String("west");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("w", strRoot));
		
		strRoot = new String("east");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("e", strRoot));
		
		strRoot = new String("go");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("move", strRoot));
		arrlistDatabase.add(new DatabaseElements("skip", strRoot));
		arrlistDatabase.add(new DatabaseElements("run", strRoot));
		arrlistDatabase.add(new DatabaseElements("jump", strRoot));
		arrlistDatabase.add(new DatabaseElements("leap", strRoot));
		arrlistDatabase.add(new DatabaseElements("slide", strRoot));
		arrlistDatabase.add(new DatabaseElements("crawl", strRoot));
		arrlistDatabase.add(new DatabaseElements("move", strRoot));
		
		strRoot = new String("take");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("get", strRoot));
		arrlistDatabase.add(new DatabaseElements("pickup", strRoot));
		arrlistDatabase.add(new DatabaseElements("acquire", strRoot));
		arrlistDatabase.add(new DatabaseElements("steal", strRoot));
		arrlistDatabase.add(new DatabaseElements("grab", strRoot));
		arrlistDatabase.add(new DatabaseElements("lift", strRoot));
		
		strRoot = new String("talk");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("speak", strRoot));
		arrlistDatabase.add(new DatabaseElements("shout", strRoot));
		arrlistDatabase.add(new DatabaseElements("yell", strRoot));
		
		strRoot = new String("tv");
		arrlistDatabase.add(new DatabaseElements(strRoot, strRoot));
		arrlistDatabase.add(new DatabaseElements("television", strRoot));
		arrlistDatabase.add(new DatabaseElements("monitor", strRoot));
		
		return bReturn;
	} // loadDatabase
	
	public String getRootWord(String strString) {
		
		Iterator<DatabaseElements> iterator = arrlistDatabase.iterator();
		
		while (iterator.hasNext()) {
			DatabaseElements deCurrent = iterator.next();
			if ( deCurrent.strAlias.equals(strString) )
				return deCurrent.strRoot;
		}
		
		return "";

	} // getRootWord
} // vocabularyDatabase class
