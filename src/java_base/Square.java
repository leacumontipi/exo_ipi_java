package java_base;

public class Square {

	private int coter;
	
	public Square(int coter) {
		this.coter = coter;
	}

	public int getCoter() {
		return coter;
	}

	public void setCoter(int coter) {
		this.coter = coter;
	}

	public void display() {
		String s = "";
		for(int i = 0 ; i < this.coter ; i++) {
			s += "\n";
			for(int j = 0 ; j < this.coter ; j++) {
				s += "#";
			}
		}
		
		System.out.println(s);
	}
	
	public void calculSurface() {
		System.out.println(this.coter * this.coter);
	}


}
