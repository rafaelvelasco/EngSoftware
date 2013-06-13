
public class ChildrensMovie extends Movie {
	private boolean childrens = true;

	public ChildrensMovie(String title, int priceCode) {
		super(title, priceCode);
	}

	public boolean isChildrens() {
		return childrens;
	}	
		
}
