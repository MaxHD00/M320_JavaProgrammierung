package V3;

public class DolchSchurke implements Figur {
	private String charakterName;

	@Override
	public String getCharakterName() {
		return charakterName;
	}

	@Override
	public void setCharakterName(String charakterName) {
		this.charakterName = charakterName;
	}

	@Override
	public void laufen() {
		System.out.println(charakterName + " l�uft mit einem Dolch.");
	}

	@Override
	public void kaempfen() {
		System.out.println(charakterName + " k�mpft als Schurke mit einem Dolch.");
	}

	@Override
	public void setWaffenVerhalten(IWaffenVerhalten waffenVerhalten) {

	}

	@Override
	public void verwendeWaffe() {
		System.out.println(charakterName + " verwendet seine Waffe!");
	}
}
