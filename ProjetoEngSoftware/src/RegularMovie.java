
public class RegularMovie extends Movie{
	
	private boolean regular = true;

	public RegularMovie(String title, int priceCode) {
		super(title, priceCode);

	}

	public boolean isRegular() {
		return regular;
	}


}
