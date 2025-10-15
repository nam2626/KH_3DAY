package e02_static;

public class CardFactory {
	private static int cardNumber = 1000;
	
	public Card createCard(String userName) {
		return new Card(++cardNumber, userName);
	}
}
