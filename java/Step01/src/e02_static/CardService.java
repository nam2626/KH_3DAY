package e02_static;

public class CardService {
	private CardFactory factory;

	public CardService() {
		factory = CardFactory.getInstance();
		System.out.println("service "+ factory);
	}
	
	public Card createCard(String name) {
		return factory.createCard(name);
	}
	
	
}
