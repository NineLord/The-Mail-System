package game.objects;

import java.io.Serializable;

public class GameSave implements Serializable{
	private static final long serialVersionUID = -8019004070312234596L;
	private PostalCompany pcMain;
	private Clock cMain;
	private BankAccount baMain;
	private String strPlayer;
	
	public GameSave(PostalCompany pcMain, Clock cMain, BankAccount baMain, String strPlayer) {
		this.pcMain = pcMain;
		this.pcMain.setTheGameEnd(false);
		this.cMain = cMain;
		this.baMain = baMain;
		this.strPlayer = strPlayer;
	}

	// Get methods
	public PostalCompany getPostal() {
		return pcMain;
	}

	public Clock getClock() {
		return cMain;
	}
	
	public BankAccount getBank() {
		return baMain;
	}
	
	public String getPlayer() {
		return strPlayer;
	}
	
	// Set methods
	public void setClock(Clock cMain) {
		this.cMain = cMain;
	}
	
	public void setPostal(PostalCompany pcMain) {
		this.pcMain = pcMain;
	}
	
	public void setBank(BankAccount baMain) {
		this.baMain = baMain;
	}
	
	public void setName(String strPlayer) {
		this.strPlayer = strPlayer;
	}
}
