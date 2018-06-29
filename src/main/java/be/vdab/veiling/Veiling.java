package be.vdab.veiling;

public class Veiling {
	private int hoogste;
	
	public void doeBod(int bedrag) {
		if(bedrag > this.hoogste) {
			this.hoogste = bedrag;
		}
	}
	public int getHoogsteBod() {
		return this.hoogste;
	}
}
