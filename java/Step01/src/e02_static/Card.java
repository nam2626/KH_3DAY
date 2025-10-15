package e02_static;

public class Card {
	private int cardNumber;
	private String userName;
	public Card(int cardNumber, String userName) {
		super();
		this.cardNumber = cardNumber;
		this.userName = userName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", userName=" + userName + "]";
	}
	
	
}
