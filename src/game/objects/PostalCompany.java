package game.objects;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The PostalCompany class is creating all the branch objects according to the
 * difficulty of the game.
 */
public class PostalCompany implements Runnable, Serializable {
	private static final long serialVersionUID = -9017242664795412755L;
	private int[][] iHoursBetweenBranches;
	private Map<String, Person> mCollectionOfPeople = new HashMap<>();
	private Queue<Person> pHaifa;
	private Queue<Person> pTelAviv;
	private Queue<Person> pEilat;
	private Queue<Person> pJerusalem;
	private Queue<Person> pMetula;
	private Queue<Person> pTiberias;
	private Queue<Person> pBeerSheba;
	private int[] iBusyBranches = { 0, 0, 0, 0, 0, 0, 0 };
	private Map<String, Person> mPeople = new HashMap<>();
	private Map<Integer, Branch> mBranches = new HashMap<>();
	private volatile int iPlayableActions = 0;
	private int iDifficulty;
	private double dPackageDelay;
	private final Locker objLockPause = new Locker();
	private volatile boolean bIsGamePaused = false;
	private volatile boolean bDidTheGameEnd = false;

	// Constructor methods
	public PostalCompany(int iDifficulty) {
		Branch braHai = new Branch("Haifa");
		Branch braTel = new Branch("Tel-Aviv");
		Branch braEil = new Branch("Eilat");
		Branch braJer = new Branch("Jerusalem");
		Branch braMet = new Branch("Metula");
		Branch braTib = new Branch("Tiberias");
		Branch braBee = new Branch("Beer-Sheba");

		this.pHaifa = new ArrayBlockingQueue<Person>(20);
		this.pTelAviv = new ArrayBlockingQueue<Person>(20);
		this.pEilat = new ArrayBlockingQueue<Person>(20);

		HashMap<String, Person> mHaifa;
		HashMap<String, Person> mTelAviv;
		HashMap<String, Person> mEilat;
		HashMap<String, Person> mJerusalem;
		HashMap<String, Person> mMetula;
		List<String> lRandomNames = new LinkedList<>();

		switch (iDifficulty) {
		case 0: // Easy
			this.iHoursBetweenBranches = new int[][] { { 0, 1, 5 }, { 1, 0, 4 }, { 5, 4, 0 } };
			mHaifa = new HashMap<String, Person>() {
				{
					put("Batman", new Person("Batman", 0));
					put("Superman", new Person("Superman", 0));
					put("Wonderwoman", new Person("Wonderwoman", 0));
					put("Flash", new Person("Flash", 0));
					put("Martian Manhunter", new Person("Martian Manhunter", 0));
					put("Cyborg", new Person("Cyborg", 0));
					put("Aquaman", new Person("Aquaman", 0));
					put("Green Lantern", new Person("Green Lantern", 0));
					put("Green Arrow", new Person("Green Arrow", 0));
					put("NightWing", new Person("NightWing", 0));
					put("Beast Boy", new Person("Beast Boy", 0));
					put("Raven", new Person("Raven", 0));
					put("Starfire", new Person("Starfire", 0));
					put("Shazam", new Person("Shazam", 0));
					put("Powergirl", new Person("Powergirl", 0));
					put("Huntress", new Person("Huntress", 0));
					put("Hawkgirl", new Person("Hawkgirl", 0));
					put("Black Canary", new Person("Black Canary", 0));
					put("Oracle", new Person("Oracle", 0));
					put("Zatanna", new Person("Zatanna", 0));
				}
			};
			mTelAviv = new HashMap<String, Person>() {
				{
					put("Shaked", new Person("Shaked", 1));
					put("Shiran", new Person("Shiran", 1));
					put("Dana", new Person("Dana", 1));
					put("Keren", new Person("Keren", 1));
					put("Yaffa", new Person("Yaffa", 1));
					put("Nissan", new Person("Nissan", 1));
					put("Harel", new Person("Harel", 1));
					put("Yotam", new Person("Yotam", 1));
					put("Liron", new Person("Liron", 1));
					put("Ori", new Person("Ori", 1));
					put("Noa", new Person("Noa", 1));
					put("Abiathar", new Person("Abiathar", 1));
					put("Amit", new Person("Amit", 1));
					put("Oren", new Person("Oren", 1));
					put("Gal", new Person("Gal", 1));
					put("Shimi", new Person("Shimi", 1));
					put("Maya", new Person("Maya", 1));
					put("Alon", new Person("Alon", 1));
					put("Ben", new Person("Ben", 1));
					put("Tal", new Person("Tal", 1));
				}
			};
			mEilat = new HashMap<String, Person>() {
				{
					put("Dovahkiin", new Person("Dovahkiin", 2));
					put("Altair Ibn-La'Ahad", new Person("Altair Ibn-La'Ahad", 2));
					put("Ezio Auditore da Firenze", new Person("Ezio Auditore da Firenze", 2));
					put("Tyrael", new Person("Tyrael", 2));
					put("Edward James Kenway", new Person("Edward James Kenway", 2));
					put("Shay Patrick Cormac", new Person("Shay Patrick Cormac", 2));
					put("Arno Victor Dorian", new Person("Arno Victor Dorian", 2));
					put("Jacob Frye", new Person("Jacob Frye", 2));
					put("Evie Frye", new Person("Evie Frye", 2));
					put("Kratos", new Person("Kratos", 2));
					put("Zenyatta", new Person("Zenyatta", 2));
					put("Tenno", new Person("Tenno", 2));
					put("Dark Magician", new Person("Dark Magician", 2));
					put("Mario", new Person("Mario", 2));
					put("Trevor Philips", new Person("Trevor Philips", 2));
					put("Garrosh Hellscream", new Person("Garrosh Hellscream", 2));
					put("Sam Fisher", new Person("Sam Fisher", 2));
					put("Elizabeth", new Person("Elizabeth", 2));
					put("Zer0", new Person("Zer0", 2));
					put("Ratchet", new Person("Ratchet", 2));
				}
			};
			
			this.mCollectionOfPeople.putAll(mHaifa);
			this.mCollectionOfPeople.putAll(mTelAviv);
			this.mCollectionOfPeople.putAll(mEilat);
			
			for (String strKey : mHaifa.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pHaifa.offer(mHaifa.get(strName));
			lRandomNames.clear();

			for (String strKey : mTelAviv.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pTelAviv.offer(mTelAviv.get(strName));
			lRandomNames.clear();

			for (String strKey : mEilat.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pEilat.offer(mEilat.get(strName));
			
			this.dPackageDelay = 2;
			this.mBranches.put(braHai.getID(), braHai);
			this.mBranches.put(braTel.getID(), braTel);
			this.mBranches.put(braEil.getID(), braEil);
			break;
		case 1: // Normal
			this.iHoursBetweenBranches = new int[][] { { 0, 1, 5, 3, 1 }, { 1, 0, 4, 1, 2 }, { 5, 4, 0, 4, 6 },
					{ 3, 1, 4, 0, 3 }, { 1, 2, 6, 3, 0 } };
			this.pJerusalem = new ArrayBlockingQueue<Person>(20);
			this.pMetula = new ArrayBlockingQueue<Person>(20);
			
			mHaifa = new HashMap<String, Person>() {
				{
					put("Batman", new Person("Batman", 0));
					put("Superman", new Person("Superman", 0));
					put("Wonderwoman", new Person("Wonderwoman", 0));
					put("Flash", new Person("Flash", 0));
					put("Martian Manhunter", new Person("Martian Manhunter", 0));
					put("Cyborg", new Person("Cyborg", 0));
					put("Aquaman", new Person("Aquaman", 0));
					put("Green Lantern", new Person("Green Lantern", 0));
					put("Green Arrow", new Person("Green Arrow", 0));
					put("NightWing", new Person("NightWing", 0));
					put("Beast Boy", new Person("Beast Boy", 0));
					put("Raven", new Person("Raven", 0));
					put("Starfire", new Person("Starfire", 0));
					put("Shazam", new Person("Shazam", 0));
					put("Powergirl", new Person("Powergirl", 0, 1));
					put("Huntress", new Person("Huntress", 0, 2));
					put("Hawkgirl", new Person("Hawkgirl", 0, 3));
					put("Black Canary", new Person("Black Canary", 0, 4));
					put("Oracle", new Person("Oracle", 0, 1));
					put("Zatanna", new Person("Zatanna", 0, 2));
				}
			};
			mTelAviv = new HashMap<String, Person>() {
				{
					put("Shaked", new Person("Shaked", 1));
					put("Shiran", new Person("Shiran", 1));
					put("Dana", new Person("Dana", 1));
					put("Keren", new Person("Keren", 1));
					put("Yaffa", new Person("Yaffa", 1));
					put("Nissan", new Person("Nissan", 1));
					put("Harel", new Person("Harel", 1));
					put("Yotam", new Person("Yotam", 1));
					put("Liron", new Person("Liron", 1));
					put("Ori", new Person("Ori", 1));
					put("Noa", new Person("Noa", 1));
					put("Abiathar", new Person("Abiathar", 1));
					put("Amit", new Person("Amit", 1));
					put("Oren", new Person("Oren", 1));
					put("Gal", new Person("Gal", 1, 0));
					put("Shimi", new Person("Shimi", 1, 2));
					put("Maya", new Person("Maya", 1, 3));
					put("Alon", new Person("Alon", 1, 4));
					put("Ben", new Person("Ben", 1, 2));
					put("Tal", new Person("Tal", 1, 3));
				}
			};
			mEilat = new HashMap<String, Person>() {
				{
					put("Dovahkiin", new Person("Dovahkiin", 2));
					put("Altair Ibn-La'Ahad", new Person("Altair Ibn-La'Ahad", 2));
					put("Ezio Auditore da Firenze", new Person("Ezio Auditore da Firenze", 2));
					put("Tyrael", new Person("Tyrael", 2));
					put("Edward James Kenway", new Person("Edward James Kenway", 2));
					put("Shay Patrick Cormac", new Person("Shay Patrick Cormac", 2));
					put("Arno Victor Dorian", new Person("Arno Victor Dorian", 2));
					put("Jacob Frye", new Person("Jacob Frye", 2));
					put("Evie Frye", new Person("Evie Frye", 2));
					put("Kratos", new Person("Kratos", 2));
					put("Zenyatta", new Person("Zenyatta", 2));
					put("Tenno", new Person("Tenno", 2));
					put("Dark Magician", new Person("Dark Magician", 2));
					put("Mario", new Person("Mario", 2));
					put("Trevor Philips", new Person("Trevor Philips", 2, 0));
					put("Garrosh Hellscream", new Person("Garrosh Hellscream", 2, 1));
					put("Sam Fisher", new Person("Sam Fisher", 2, 3));
					put("Elizabeth", new Person("Elizabeth", 2, 4));
					put("Zer0", new Person("Zer0", 2, 0));
					put("Ratchet", new Person("Ratchet", 2, 1));
				}
			};
			mJerusalem = new HashMap<String, Person>() {
				{
					put("Handsome Jack", new Person("Handsome Jack", 3));
					put("Haytham Kenway", new Person("Haytham Kenway", 3));
					put("Madara", new Person("Madara", 3));
					put("The Joker", new Person("The Joker", 3));
					put("Scar", new Person("Scar", 3));
					put("Thanos", new Person("Thanos", 3));
					put("Arthas Menethil", new Person("Arthas Menethil", 3));
					put("Ra's al Ghul", new Person("Ra's al Ghul", 3));
					put("Sylvanas Windrunner", new Person("Sylvanas Windrunner", 3));
					put("Alduin", new Person("Alduin", 3));
					put("Diablo", new Person("Diablo", 3));
					put("Vaas Montenegro", new Person("Vaas Montenegro", 3));
					put("GLaDOS", new Person("GLaDOS", 3));
					put("Darth Vader", new Person("Darth Vader", 3));
					put("Ares", new Person("Ares", 3, 0));
					put("Al Mualim", new Person("Al Mualim", 3, 1));
					put("Kerrigan", new Person("Kerrigan", 3, 2));
					put("General Zod", new Person("General Zod", 3, 4));
					put("Hans Landa", new Person("Hans Landa", 3, 2));
					put("Magneto", new Person("Magneto", 3, 4));
				}
			};
			mMetula = new HashMap<String, Person>() {
				{
					put("Robert Downey Jr.", new Person("Robert Downey Jr.", 4));
					put("Jennifer Lawrence", new Person("Jennifer Lawrence", 4));
					put("Johnny Depp", new Person("Johnny Depp", 4));
					put("Leonardo Dicaprio", new Person("Leonardo Dicaprio", 4));
					put("Ryan Reynolds", new Person("Ryan Reynolds", 4));
					put("Scarlett Johansson", new Person("Scarlett Johansson", 4));
					put("Brad Pitt", new Person("Brad Pitt", 4));
					put("Terry Crews", new Person("Terry Crews", 4));
					put("Will Smith", new Person("Will Smith", 4));
					put("Matthew Mcconaughey", new Person("Matthew Mcconaughey", 4));
					put("Tom Hardy", new Person("Tom Hardy", 4));
					put("Dwayne Johnson", new Person("Dwayne Johnson", 4));
					put("Nicolas Cage", new Person("Nicolas Cage", 4));
					put("Emma Stone", new Person("Emma Stone", 4));
					put("Christian Bale", new Person("Christian Bale", 4, 0));
					put("Michael Caine", new Person("Michael Caine", 4, 1));
					put("Gary Oldman", new Person("Gary Oldman", 4, 2));
					put("Morgan Freeman", new Person("Morgan Freeman", 4, 3));
					put("Chris Pratt", new Person("Chris Pratt", 4, 2));
					put("Samuel L. Jackson", new Person("Samuel L. Jackson", 4, 1));
				}
			};
			
			this.mCollectionOfPeople.putAll(mHaifa);
			this.mCollectionOfPeople.putAll(mTelAviv);
			this.mCollectionOfPeople.putAll(mEilat);
			this.mCollectionOfPeople.putAll(mJerusalem);
			this.mCollectionOfPeople.putAll(mMetula);
			
			for (String strKey : mHaifa.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pHaifa.offer(mHaifa.get(strName));
			lRandomNames.clear();

			for (String strKey : mTelAviv.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pTelAviv.offer(mTelAviv.get(strName));
			lRandomNames.clear();

			for (String strKey : mEilat.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pEilat.offer(mEilat.get(strName));
			
			lRandomNames.clear();
			for (String strKey : mJerusalem.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pJerusalem.offer(mJerusalem.get(strName));
			lRandomNames.clear();

			for (String strKey : mMetula.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pMetula.offer(mMetula.get(strName));

			this.dPackageDelay = 1;
			this.mBranches.put(braHai.getID(), braHai);
			this.mBranches.put(braTel.getID(), braTel);
			this.mBranches.put(braEil.getID(), braEil);
			this.mBranches.put(braJer.getID(), braJer);
			this.mBranches.put(braMet.getID(), braMet);
			break;
		case 2: // Hard
			this.iHoursBetweenBranches = new int[][] { { 0, 1, 5, 3, 1, 1, 2 }, { 1, 0, 4, 1, 2, 2, 1 },
					{ 5, 4, 0, 4, 6, 5, 3 }, { 3, 1, 4, 0, 3, 2, 1 }, { 1, 2, 6, 3, 0, 1, 3 }, { 1, 2, 5, 2, 1, 0, 2 },
					{ 2, 1, 3, 1, 3, 2, 0 } };
			this.pJerusalem = new ArrayBlockingQueue<Person>(20);
			this.pMetula = new ArrayBlockingQueue<Person>(20);
			this.pTiberias = new ArrayBlockingQueue<Person>(20);
			this.pBeerSheba = new ArrayBlockingQueue<Person>(20);
			
			mHaifa = new HashMap<String, Person>() {
				{
					put("Batman", new Person("Batman", 0));
					put("Superman", new Person("Superman", 0));
					put("Wonderwoman", new Person("Wonderwoman", 0));
					put("Flash", new Person("Flash", 0));
					put("Martian Manhunter", new Person("Martian Manhunter", 0));
					put("Cyborg", new Person("Cyborg", 0));
					put("Aquaman", new Person("Aquaman", 0));
					put("Green Lantern", new Person("Green Lantern", 0));
					put("Green Arrow", new Person("Green Arrow", 0));
					put("NightWing", new Person("NightWing", 0));
					put("Beast Boy", new Person("Beast Boy", 0));
					put("Raven", new Person("Raven", 0));
					put("Starfire", new Person("Starfire", 0));
					put("Shazam", new Person("Shazam", 0));
					put("Powergirl", new Person("Powergirl", 0, 1));
					put("Huntress", new Person("Huntress", 0, 2));
					put("Hawkgirl", new Person("Hawkgirl", 0, 3));
					put("Black Canary", new Person("Black Canary", 0, 4));
					put("Oracle", new Person("Oracle", 0, 5));
					put("Zatanna", new Person("Zatanna", 0, 6));
				}
			};
			mTelAviv = new HashMap<String, Person>() {
				{
					put("Shaked", new Person("Shaked", 1));
					put("Shiran", new Person("Shiran", 1));
					put("Dana", new Person("Dana", 1));
					put("Keren", new Person("Keren", 1));
					put("Yaffa", new Person("Yaffa", 1));
					put("Nissan", new Person("Nissan", 1));
					put("Harel", new Person("Harel", 1));
					put("Yotam", new Person("Yotam", 1));
					put("Liron", new Person("Liron", 1));
					put("Ori", new Person("Ori", 1));
					put("Noa", new Person("Noa", 1));
					put("Abiathar", new Person("Abiathar", 1));
					put("Amit", new Person("Amit", 1));
					put("Oren", new Person("Oren", 1));
					put("Gal", new Person("Gal", 1, 0));
					put("Shimi", new Person("Shimi", 1, 2));
					put("Maya", new Person("Maya", 1, 3));
					put("Alon", new Person("Alon", 1, 4));
					put("Ben", new Person("Ben", 1, 5));
					put("Tal", new Person("Tal", 1, 6));
				}
			};
			mEilat = new HashMap<String, Person>() {
				{
					put("Dovahkiin", new Person("Dovahkiin", 2));
					put("Altair Ibn-La'Ahad", new Person("Altair Ibn-La'Ahad", 2));
					put("Ezio Auditore da Firenze", new Person("Ezio Auditore da Firenze", 2));
					put("Tyrael", new Person("Tyrael", 2));
					put("Edward James Kenway", new Person("Edward James Kenway", 2));
					put("Shay Patrick Cormac", new Person("Shay Patrick Cormac", 2));
					put("Arno Victor Dorian", new Person("Arno Victor Dorian", 2));
					put("Jacob Frye", new Person("Jacob Frye", 2));
					put("Evie Frye", new Person("Evie Frye", 2));
					put("Kratos", new Person("Kratos", 2));
					put("Zenyatta", new Person("Zenyatta", 2));
					put("Tenno", new Person("Tenno", 2));
					put("Dark Magician", new Person("Dark Magician", 2));
					put("Mario", new Person("Mario", 2));
					put("Trevor Philips", new Person("Trevor Philips", 2, 0));
					put("Garrosh Hellscream", new Person("Garrosh Hellscream", 2, 1));
					put("Sam Fisher", new Person("Sam Fisher", 2, 3));
					put("Elizabeth", new Person("Elizabeth", 2, 4));
					put("Zer0", new Person("Zer0", 2, 5));
					put("Ratchet", new Person("Ratchet", 2, 6));
				}
			};
			mJerusalem = new HashMap<String, Person>() {
				{
					put("Handsome Jack", new Person("Handsome Jack", 3));
					put("Haytham Kenway", new Person("Haytham Kenway", 3));
					put("Madara", new Person("Madara", 3));
					put("The Joker", new Person("The Joker", 3));
					put("Scar", new Person("Scar", 3));
					put("Thanos", new Person("Thanos", 3));
					put("Arthas Menethil", new Person("Arthas Menethil", 3));
					put("Ra's al Ghul", new Person("Ra's al Ghul", 3));
					put("Sylvanas Windrunner", new Person("Sylvanas Windrunner", 3));
					put("Alduin", new Person("Alduin", 3));
					put("Diablo", new Person("Diablo", 3));
					put("Vaas Montenegro", new Person("Vaas Montenegro", 3));
					put("GLaDOS", new Person("GLaDOS", 3));
					put("Darth Vader", new Person("Darth Vader", 3));
					put("Ares", new Person("Ares", 3, 0));
					put("Al Mualim", new Person("Al Mualim", 3, 1));
					put("Kerrigan", new Person("Kerrigan", 3, 2));
					put("General Zod", new Person("General Zod", 3, 4));
					put("Hans Landa", new Person("Hans Landa", 3, 5));
					put("Magneto", new Person("Magneto", 3, 6));
				}
			};
			mMetula = new HashMap<String, Person>() {
				{
					put("Robert Downey Jr.", new Person("Robert Downey Jr.", 4));
					put("Jennifer Lawrence", new Person("Jennifer Lawrence", 4));
					put("Johnny Depp", new Person("Johnny Depp", 4));
					put("Leonardo Dicaprio", new Person("Leonardo Dicaprio", 4));
					put("Ryan Reynolds", new Person("Ryan Reynolds", 4));
					put("Scarlett Johansson", new Person("Scarlett Johansson", 4));
					put("Brad Pitt", new Person("Brad Pitt", 4));
					put("Terry Crews", new Person("Terry Crews", 4));
					put("Will Smith", new Person("Will Smith", 4));
					put("Matthew Mcconaughey", new Person("Matthew Mcconaughey", 4));
					put("Tom Hardy", new Person("Tom Hardy", 4));
					put("Dwayne Johnson", new Person("Dwayne Johnson", 4));
					put("Nicolas Cage", new Person("Nicolas Cage", 4));
					put("Emma Stone", new Person("Emma Stone", 4));
					put("Christian Bale", new Person("Christian Bale", 4, 0));
					put("Michael Caine", new Person("Michael Caine", 4, 1));
					put("Gary Oldman", new Person("Gary Oldman", 4, 2));
					put("Morgan Freeman", new Person("Morgan Freeman", 4, 3));
					put("Chris Pratt", new Person("Chris Pratt", 4, 5));
					put("Samuel L. Jackson", new Person("Samuel L. Jackson", 4, 6));
				}
			};
			HashMap<String, Person> mTiberias = new HashMap<String, Person>() {
				{
					put("Sia", new Person("Sia", 5));
					put("John Lennon", new Person("John Lennon", 5));
					put("Chester Bennington", new Person("Chester Bennington", 5));
					put("David Guetta", new Person("David Guetta", 5));
					put("Freddie Mercury", new Person("Freddie Mercury", 5));
					put("Eminem", new Person("Eminem", 5));
					put("Wolfgang Amadeus Mozart", new Person("Wolfgang Amadeus Mozart", 5));
					put("Adam Levine", new Person("Adam Levine", 5));
					put("Elton John", new Person("Elton John", 5));
					put("Will I Am", new Person("Will I Am", 5));
					put("Hans Zimmer", new Person("Hans Zimmer", 5));
					put("Serj Tankian", new Person("Serj Tankian", 5));
					put("Chris Martin", new Person("Chris Martin", 5));
					put("Michael Jackson", new Person("Michael Jackson", 5));
					put("Justin Timberlake", new Person("Justin Timberlake", 5, 0));
					put("Ludwig van Beethoven", new Person("Ludwig van Beethoven", 5, 1));
					put("Christina Aguilera", new Person("Christina Aguilera", 5, 2));
					put("Joan Jett", new Person("Joan Jett", 5, 3));
					put("Elvis Presley", new Person("Elvis Presley", 5, 4));
					put("Bob Dylan", new Person("Bob Dylan", 5, 6));
				}
			};
			HashMap<String, Person> mBeerSheba = new HashMap<String, Person>() {
				{
					put("Homer Simpson", new Person("Homer Simpson", 6));
					put("Peter Griffin", new Person("Peter Griffin", 6));
					put("Tyrion Lannister", new Person("Tyrion Lannister", 6));
					put("Walter White", new Person("Walter White", 6));
					put("Gregory House", new Person("Gregory House", 6));
					put("Mr. Bean", new Person("Mr. Bean", 6));
					put("Jerry Seinfeld", new Person("Jerry Seinfeld", 6));
					put("Joey Tribbiani Jr.", new Person("Joey Tribbiani Jr.", 6));
					put("Eric Cartman", new Person("Eric Cartman", 6));
					put("Dexter Morgan", new Person("Dexter Morgan", 6));
					put("Scooby-Doo", new Person("Scooby-Doo", 6));
					put("Ron Swanson", new Person("Ron Swanson", 6));
					put("Sheldon Cooper", new Person("Sheldon Cooper", 6));
					put("Barney Stinson", new Person("Barney Stinson", 6));
					put("Dr. Jack Shephard", new Person("Dr. Jack Shephard", 6, 0));
					put("SpongeBob SquarePants", new Person("SpongeBob SquarePants", 6, 1));
					put("Perry Cox", new Person("Perry Cox", 6, 2));
					put("Saul Goodman", new Person("Saul Goodman", 6, 3));
					put("Patrick Jane", new Person("Patrick Jane", 6, 4));
					put("Michael Scofield", new Person("Michael Scofield", 6, 5));
				}
			};
			
			this.mCollectionOfPeople.putAll(mHaifa);
			this.mCollectionOfPeople.putAll(mTelAviv);
			this.mCollectionOfPeople.putAll(mEilat);
			this.mCollectionOfPeople.putAll(mJerusalem);
			this.mCollectionOfPeople.putAll(mMetula);
			this.mCollectionOfPeople.putAll(mTiberias);
			this.mCollectionOfPeople.putAll(mBeerSheba);
			
			for (String strKey : mHaifa.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pHaifa.offer(mHaifa.get(strName));
			lRandomNames.clear();

			for (String strKey : mTelAviv.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pTelAviv.offer(mTelAviv.get(strName));
			lRandomNames.clear();

			for (String strKey : mEilat.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pEilat.offer(mEilat.get(strName));
			
			lRandomNames.clear();
			for (String strKey : mJerusalem.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pJerusalem.offer(mJerusalem.get(strName));
			lRandomNames.clear();

			for (String strKey : mMetula.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pMetula.offer(mMetula.get(strName));
			lRandomNames.clear();

			for (String strKey : mTiberias.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pTiberias.offer(mTiberias.get(strName));
			lRandomNames.clear();

			for (String strKey : mBeerSheba.keySet())
				lRandomNames.add(strKey);
			Collections.shuffle(lRandomNames);
			for (String strName : lRandomNames)
				this.pBeerSheba.offer(mBeerSheba.get(strName));

			this.dPackageDelay = 0.5;
			this.mBranches.put(braHai.getID(), braHai);
			this.mBranches.put(braTel.getID(), braTel);
			this.mBranches.put(braEil.getID(), braEil);
			this.mBranches.put(braJer.getID(), braJer);
			this.mBranches.put(braMet.getID(), braMet);
			this.mBranches.put(braTib.getID(), braTib);
			this.mBranches.put(braBee.getID(), braBee);
			break;
		default:
			System.err.println("Erorr: PostalCompany.PostalCompany(int iDifficulty): iDifficulty is not between 0-2");
			break;
		}
		this.iDifficulty = iDifficulty;
	}
	
	// Get methods
	public int[][] getHoursBetweenBranches() {
		return iHoursBetweenBranches;
	}

//	public Map<Integer, Branch> getBranches() {
//		return this.mBranches;
//	}

	public int getDifficulty() {
		return iDifficulty;
	}

	public double getPackageDelay() {
		return dPackageDelay;
	}

	// new get/set methods
	public Person getPeople(String strName) {
		return this.mPeople.get(strName);
	}
	
	public void setPeople(String strName, Person pNew) {
		this.mPeople.put(strName, pNew);
	}
	
	public Branch getBranch(int iIndex) {
		return this.mBranches.get(iIndex);
	}
	
	public void setBranch(int iIndex, Branch braNew) {
		this.mBranches.put(iIndex, braNew);
	}
	
	public int getPlayableActions() {
		return iPlayableActions;
	}
	
	public void updatePlayableActions() {
		int iBranch = 0, iActions = 0;
		switch (this.iDifficulty) {
		case 0:
			iBranch = 3;
			break;
		case 1:
			iBranch = 5;
			break;
		case 2:
			iBranch = 7;
			break;
		}
		for (int iCount = 0; iCount < iBranch; iCount++) {
			iActions+= this.mBranches.get(iCount).getBranchReceive().size();
			if (!this.mBranches.get(iCount).getPersonSend().isEmpty())
				iActions++;
			//this.mBranches.get(iCount).getPersonReceive()
			iActions+= this.mBranches.get(iCount).getPickUp().size();
			iActions+= this.mBranches.get(iCount).getWaitingToSend().size();
		}
		this.iPlayableActions = iActions;
	}

	public boolean didTheGameEnd() {
		return bDidTheGameEnd;
	}

	public void setTheGameEnd(boolean bDidTheGameEnd) {
		this.bDidTheGameEnd = bDidTheGameEnd;
	}
	
	public Person pollFromHaifa() {
		return pHaifa.poll();
	}

	public void offerToHaifa(Person pHaifa) {
		this.pHaifa.offer(pHaifa);
	}

	public Person pollFromTelAviv() {
		return pTelAviv.poll();
	}

	public void offerToTelAviv(Person pTelAviv) {
		this.pTelAviv.offer(pTelAviv);
	}

	public Person pollFromEilat() {
		return pEilat.poll();
	}

	public void offerToEilat(Person pEilat) {
		this.pEilat.offer(pEilat);
	}

	public Person pollFromJerusalem() {
		return pJerusalem.poll();
	}

	public void offerToJerusalem(Person pJerusalem) {
		this.pJerusalem.offer(pJerusalem);
	}

	public Person pollFromMetula() {
		return pMetula.poll();
	}

	public void offerToMetula(Queue<Person> pMetula) {
		this.pMetula = pMetula;
	}

	public Person pollFromTiberias() {
		return pTiberias.poll();
	}

	public void offerToTiberias(Person pTiberias) {
		this.pTiberias.offer(pTiberias);
	}

	public Person pollFromBeerSheba() {
		return pBeerSheba.poll();
	}

	public void offerToBeerSheba(Person pBeerSheba) {
		this.pBeerSheba.offer(pBeerSheba);
	}

	public int getBusyBranches(int iIndex) {
		return this.iBusyBranches[iIndex];
	}

	// toString methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("PostalCompany {\n\t\t");
		for (Integer iKey : this.mBranches.keySet()) {
			strbTemp.append(this.mBranches.get(iKey).toString());
			strbTemp.append("\n\t\t");
		}
		strbTemp.append("}");
		return strbTemp.toString();
	}
	
	public String toStringFull() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("PostalCompany {\n\t\t");
		for (Integer iKey : this.mBranches.keySet()) {
			strbTemp.append(this.mBranches.get(iKey).toStringFull());
			strbTemp.append("\n\t\t");
		}
		strbTemp.append("}");
		return strbTemp.toString();
	}

	// Thread methods
	@Override
	public void run() { ////////////////////////DELETED
		/*
		 * input: null.
		 * action: Keep running as long as bDidTheGameEnd is false (game didn't end yet).
		 * Checking to see if iPlayableActions is equals to 5 or below, if so will wait 1~7 seconds then creating new person,
		 * package and add him to qPersonSend in one of the branches.
		 * The branch will be chosen by which one has the lowest people sending in it according to iBusyBranches.
		 * Else, will wait 1 second and then check again if there is a need to add another person.
		 * The new Person object will be taken from the specific branch's queue (qHaifa for example).
		 * While being used the person will be added also to mPeople.
		 * (after finished being used, the person will get back to the branch's queue and removed from mPeople)
		 * return: null.
		 */
		int iMaxBranches = 0;
		switch (this.iDifficulty) {
		case 0:
			iMaxBranches = 3;
			break;
		case 1:
			iMaxBranches = 5;
			break;
		case 2:
			iMaxBranches = 7;
			break;
		}
		while (!(this.bDidTheGameEnd)) {
			if (this.iPlayableActions <= 5) {
				for (int iCount = ThreadLocalRandom.current().nextInt(1, 8); iCount > 0; iCount--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					checkForPaused();
				}
				int iChoosenBranch = 0;
				int iMaxBusy = 0;
				for (int iCount = 0; iCount<7; iCount++) {
					if (this.iBusyBranches[iCount] > iMaxBusy) {
						iMaxBusy = this.iBusyBranches[iCount];
						iChoosenBranch = iCount;
					}
				}
				int iRandomIndexTo = ThreadLocalRandom.current().nextInt(0, iMaxBranches);
				while (iChoosenBranch == iRandomIndexTo) {
					iRandomIndexTo = ThreadLocalRandom.current().nextInt(0, iMaxBranches);
				}
				Person pSender;
				Person pReceiver;
				switch (iChoosenBranch) {
				case 0:
					pSender = this.pHaifa.poll();
					break;
				case 1:
					pSender = this.pTelAviv.poll();
					break;
				case 2:
					pSender = this.pEilat.poll();
					break;
				default:
					pSender = new Person("Error", 0);
					break;
				}
				switch (iRandomIndexTo) {
				case 0:
					pReceiver = this.pHaifa.poll();
					break;
				case 1:
					pReceiver = this.pTelAviv.poll();
					break;
				case 2:
					pReceiver = this.pEilat.poll();
					break;
				default:
					pReceiver = new Person("Error", 0);
					break;
				}
				Package paNew = new Package(ThreadLocalRandom.current().nextInt(0, 3), pSender.getName(), pReceiver.getName(), iChoosenBranch);
				paNew.setBestTime(bestPathTime(iChoosenBranch, iRandomIndexTo));
				//paNew.setTimeLeft(paNew.getBestTime() + this.getPackageDelay());
				pSender.setPackage(paNew);
				this.mPeople.put(pSender.getName(), pSender);
				this.mPeople.put(pReceiver.getName(), pReceiver);
				Branch braTemp = this.mBranches.get(iChoosenBranch);
				boolean bDidPersonEnteredQueue = braTemp.addPersonToWantToSend(pSender);
				while(!(bDidPersonEnteredQueue)) { // The loop will happen only if all the branches are busy above 5 people.
					try {
						Thread.sleep(1000);
						checkForPaused();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					bDidPersonEnteredQueue = braTemp.addPersonToWantToSend(pSender);
				}
				this.mBranches.put(iChoosenBranch, braTemp);
			} else {
				try {
					Thread.sleep(1000);
					checkForPaused();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void checkForPaused() {
		synchronized (objLockPause) {
			while (this.bIsGamePaused) {
				try {
					objLockPause.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void pauseThread() {
		this.bIsGamePaused = true;
	}

	public void resumeThread() {
		synchronized (objLockPause) {
			this.bIsGamePaused = false;
			this.objLockPause.notifyAll();
		}
	}

	public void stopThread() {
		this.bDidTheGameEnd = true;
	}

	// Specific methods
	// THE NEW ORDER
	public boolean takePackageFromPerson(int iIndex) {
		/*
		 * input: ID of the selected branch action: remove head person from qPersonSend
		 * put his package on lWaitingToSend return: false if the queue is empty, true
		 * if the package was taken.
		 */
		Branch braTemp = this.mBranches.get(iIndex);
		boolean bPackageMoved = braTemp.takePackageFromPersonInQueuePersonSendPutInListWaitingToSend();
		this.mBranches.put(iIndex, braTemp);
		return bPackageMoved;
	}

	public int howHoursBetweenBranches(int iIndexFrom, int iIndexTo) {
		/*
		 * input: ID of the branch from, ID of the branch to. action: use the
		 * iHoursBetweenBranches array to find the amount of hours. return: return the
		 * amount of hours between the 2 branches.
		 */
		return this.iHoursBetweenBranches[iIndexFrom][iIndexTo];
	}

	public int movePackageFromWaitSendToSending(int iIndexFrom, int iIndex, int[] iTimeOfArriving) {
		/*
		 * input: ID of the branch from, Index of the package at lWaitingToSend, The time of arriving.
		 * action: Update the package with the new iTime. move the package from lWaitingToSend to lBranchSend.
		 * return: ID of the package in lBranchSend.
		 */
		Branch braFrom = this.mBranches.get(iIndexFrom);
		int iIDSending = braFrom.movePackageFromWaitingToSendToSending(iIndex, iTimeOfArriving);
		this.mBranches.put(iIndexFrom, braFrom);
		return iIDSending;
	}

	public void updatePackageTimeLeftDELETED(int iIndexFrom, int iGroup ,int iIndex, int iSubtractHours) { ////////////////////////////DELETED
		/*
		 * input: ID of the branch from, Group ID: will be sending or pickup ,Index of the package in lBranchSend or lPickUp, The amount
		 * of hours need to be subtract from dTimeLeft. action: Update the selected
		 * package from lBranchSend and subtract the amount of hours from dTimeLeft.
		 * return: null.
		 */
		Branch braFrom = this.mBranches.get(iIndexFrom);
		//braFrom.updatePackageTimeLeft(iIndex, iGroup, iSubtractHours);
		this.mBranches.put(iIndexFrom, braFrom);
	}

	public int movePackageBetweenBranches(int iIndexFrom, int iIndexTo, int iIndexSending) {
		/*
		 * input: Index of the branch from, Index of the branch to, Index of the package
		 * in lBranchSend in the branch from. action: Move the package from lBranchSend
		 * (in the from branch) to lBranchReceive (in the to branch). return: Index of
		 * the package in lBranchReceive at the Branch it was sent to.
		 */
		Branch braFrom = this.mBranches.get(iIndexFrom);
		Branch braTo = this.mBranches.get(iIndexTo);
		List<Package> lTempSend = braFrom.getBranchSend();
		List<Package> lTempRec = braTo.getBranchReceive();
		Package paTemp = lTempSend.remove(iIndexSending);
		lTempRec.add(paTemp);
		braFrom.setBranchSend(lTempSend);
		braTo.setBranchReceive(lTempRec);
		this.mBranches.put(iIndexFrom, braFrom);
		this.mBranches.put(iIndexTo, braTo);
		return (lTempRec.size() - 1);
	}

	public void updatePackageLocation(int iIndexBranch, int iIndexReceiving) {
		/*
		 * input: Index of the branch, Index of the package in lBranchReceive in the
		 * branch. action: Update the package location to be the same as the branch it
		 * in (package that has been just received). return: null.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		braCurrent.updatePackageLocation(iIndexReceiving);
		this.mBranches.put(iIndexBranch, braCurrent);
	}

	public void movePackageFromReceivedToWaitingToSend(int iIndexBranch, int iIndex) {
		/*
		 * input: Index of the branch, Index of the package in lBranchReceive. action:
		 * Move the package from lBranchReceive to lWaitingToSend. return: null.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		braCurrent.movePackageFromReceivedToWaitingToSend(iIndex);
		this.mBranches.put(iIndexBranch, braCurrent);
	}

	public int movePackageFromReceivedToPickUp(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the selected branch, Index of the package in lBranchReceive.
		 * action: Check if the package in lBranchReceive is belong to the branch. If
		 * so, remove the package from lBranchReceive and put it in lPickUp.
		 * return: ID of the package in lPickUp, if it wasn't belong in this branch will return -1.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		if (this.mCollectionOfPeople.get(braCurrent.getBranchReceive().get(iIndex).getReceive())
				.getReceiveLocation() == iIndexBranch) {
			int iPackageID = braCurrent.movePackageFromReceivedToPickUp(iIndex);
			this.mBranches.put(iIndexBranch, braCurrent);
			return iPackageID;
		} else
			return -1;
	}

	public void updatePackageRewardSize(int iIndexBranch, int iIndex, int iRewardSize) {
		/*
		 * input: ID of the branch, Index of the package in lPickUp. action: Calculate
		 * the reward size according to the package delivery time (dTimeLeft) and update
		 * the package iRewardSize. return: null.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		braCurrent.updatePackageRewardSize(iIndex, this.dPackageDelay, iRewardSize);
		this.mBranches.put(iIndexBranch, braCurrent);
	}

	public void updatePackageTime(int iIndexBranch, int iIndex, int[] iTime) {
		/*
		 * input: ID of the branch, Index of the package in lPickUp, The time needed to
		 * be updated into the package's iTime. action: Update the iTime of package from
		 * lPickUp. return: null.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		braCurrent.updatePackageTime(iIndex, iTime);
		this.mBranches.put(iIndexBranch, braCurrent);
	}

	public Person callPersonToTakeHisPackage(int iIndexBranch, int iIndex, int[] iTime) {
		/*
		 * input: ID of the branch, Index of the package in lPickUp, The time the person
		 * entered the branch. action: Find the person which the package belongs to.
		 * Update the iTime of the person. Add the person to qPersonReceive in this
		 * branch. return: Return the person that has been moved to the qPersonReceive.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		//Person pTemp = this.mCollectionOfPeople.get(braCurrent.getPickUp().get(iIndex).getReceive());
		Person pTemp = this.mPeople.get(braCurrent.getPickUp().get(iIndex).getReceive());
		pTemp.setTime(iTime);
		braCurrent.addPersonToWantToReceive(pTemp);
		this.mBranches.put(iIndexBranch, braCurrent);
		return pTemp;
	}

	public int getRewardSize(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the branch, Index of the package in lPickUp. action: Get the
		 * iRewardSize of the package in lPickUp. return: The iRewardSize of the
		 * package.
		 */
		return this.mBranches.get(iIndexBranch).getPickUp().get(iIndex).getRewardSize();
	}

	public int[] getEnterTimeToBranch(int iIndexBranch) {
		/*
		 * input: ID of the branch. action: Get the iTime of the head person in
		 * qPersonReceive. return: The iTime of the person.
		 */
		Queue<Person> qTemp = this.mBranches.get(iIndexBranch).getPersonReceive();
		if (qTemp.isEmpty())
			return new int[] {-1,-1,-1};
		else
			return qTemp.peek().getTime();
	}

	public int movePackageFromPickUpToPersonReceive(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the selected branch, Index of the selected package from lPickUp.
		 * action: Check if the package in lPickUp is belonging to the head person in
		 * qPersonReceive, if so give the person the package and remove him from queue.
		 * Remove the person from mPeople and put him back in his branch's queue.
		 * return: 0 if the package we given, 2
		 * if the package is not belonging to the head person, 1 if the queue is empty.
		 */
		Branch braCurrent = this.mBranches.get(iIndexBranch);
		String strIsThisTheRightPerson = braCurrent.movePackageFromPickUpToPersonReceive(iIndex);
		if (strIsThisTheRightPerson.equals("nullEmpty")) {
			return 1;
		} else if (strIsThisTheRightPerson.equals("nullWrongPerson")) {
			return 2;
		} else {
			Person pTemp = this.mPeople.remove(strIsThisTheRightPerson);
			//Person pTemp = this.mCollectionOfPeople.get(strIsThisTheRightPerson);
			switch (pTemp.getSendLocation()) {
			case 0:
				this.pHaifa.offer(pTemp);
				break;
			case 1:
				this.pTelAviv.offer(pTemp);
				break;
			case 2:
				this.pEilat.offer(pTemp);
				break;
			case 3:
				this.pJerusalem.offer(pTemp);
				break;
			case 4:
				this.pMetula.offer(pTemp);
				break;
			case 5:
				this.pTiberias.offer(pTemp);
				break;
			case 6:
				this.pBeerSheba.offer(pTemp);
				break;
			}
			this.mBranches.put(iIndexBranch, braCurrent);
			return 0;
		}
	}
	
	public void incrementActions() {
		/*
		 * input: null.
		 * action: Incrementing the iPlayableActions by 1.
		 * return: null.
		 */
		this.iPlayableActions++;
	}
	
	public void decreaseActions() {
		/*
		 * input: null.
		 * action: Decrease the iPlayableActions by 1.
		 * return: null.
		 */
		this.iPlayableActions--;
	}
	
	public void incrementBusyBranches(int iIndex) {
		/*
		 * input: ID of the branch.
		 * action: Increment the iBusyBranches at the specific branch index.
		 * return: null.
		 */
		this.iBusyBranches[iIndex] = this.iBusyBranches[iIndex]+1;
	}
	
	public void decreaseBusyBranches(int iIndex) {
		/*
		 * input: ID of the branch.
		 * action: Decrease the iBusyBranches at the specific branch index.
		 * return: null.
		 */
		this.iBusyBranches[iIndex]--;
	}

	// THE OLD ORDER
	// Path time methods
	public double bestPathTime(int iIdFrom, int iIdTo) {
		int[] iHaveIBeenHere; /*
								 * Each Index represent the ID of a branch. The value of each index means:
								 * 0-Unvisited place; 1-Visited place; 2-Destination;
								 */
		switch (this.iDifficulty) {
		case 0:
			iHaveIBeenHere = new int[] { 0, 0, 0 };
			break;
		case 1:
			iHaveIBeenHere = new int[] { 0, 0, 0, 0, 0 };
			break;
		case 2:
			iHaveIBeenHere = new int[] { 0, 0, 0, 0, 0, 0, 0 };
			break;
		default:
			System.err.println(
					"Erorr: PostalCompany.bestPathTime(int iIdFrom, int iIdTo): iDifficulty is not between 0-2");
			iHaveIBeenHere = new int[] {};
			break;
		}
		iHaveIBeenHere[iIdFrom] = 1;
		iHaveIBeenHere[iIdTo] = 2;
		return scanPathsArray(iIdFrom, iIdTo, iHaveIBeenHere, this.dPackageDelay);
	}

	private double scanPathsArray(int iIdFrom, int iIdTo, int[] iHaveIBeenHere, double dTimePassed) {
		double dBestTimeYet = 0;
		double dTemp = 0;
		double dTemp2 = dTimePassed;
		for (int iCol = 0; iCol < this.iHoursBetweenBranches[iIdFrom].length; iCol++) {
			if (iHaveIBeenHere[iCol] == 0) {
				dTemp2 += this.iHoursBetweenBranches[iIdFrom][iCol];
				iHaveIBeenHere[iCol] = 1;
				double dPathFound = scanPathsArray(iCol, iIdTo, iHaveIBeenHere, dTemp2);
				if (dBestTimeYet == 0 || dPathFound < dBestTimeYet)
					dBestTimeYet = dPathFound;
			} else if (iHaveIBeenHere[iCol] == 2) {
				dTemp = dTimePassed + this.iHoursBetweenBranches[iIdFrom][iCol];
				if (dBestTimeYet == 0 || dTemp < dBestTimeYet)
					dBestTimeYet = dTemp;
			}
		}
		return dBestTimeYet;
	}

}
