package java_base;

public class Rectangle extends Square {

	private int largeur;
		
	public Rectangle(int longueur, int largeur) {
		super(longueur);
		this.largeur = largeur;
	}

	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	@Override
	public void display() {
		String s = "";
		for(int i = 0 ; i < super.getCoter() ; i++) {
			s += "\n";
			for(int j = 0 ; j < this.largeur ; j++) {
				s += "#";
			}
		}
		System.out.println(s);
	}
	
	@Override
	public void calculSurface() {
		System.out.println(this.largeur * super.getCoter());
	}
	
}
