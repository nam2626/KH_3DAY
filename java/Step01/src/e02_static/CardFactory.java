package e02_static;

public class CardFactory {
	private static CardFactory instance = new CardFactory();
	private int cardNumber = 1000;
	
	private CardFactory() {
		System.out.println("CardFactory 생성자");
	}
	
	public static CardFactory getInstance() {
		if(instance == null)
			instance = new CardFactory();
		return instance;
	}
	
	public Card createCard(String userName) {
		return new Card(++cardNumber, userName);
	}
}
