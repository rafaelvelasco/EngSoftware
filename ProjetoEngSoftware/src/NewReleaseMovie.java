
public class NewReleaseMovie extends Movie{
	private boolean newRelease = true;

	public NewReleaseMovie(String title, int priceCode) {
		super(title, priceCode);
	}

	public boolean isNewRelease() {
		return newRelease;
	}
		
}
