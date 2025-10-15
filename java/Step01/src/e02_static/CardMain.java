package e02_static;

public class CardMain {

	public static void main(String[] args) {
		CardFactory factory = new CardFactory();
		Card card1 = factory.createCard("홍길동");
		System.out.println(card1);
		Card card2 = factory.createCard("김철수");
		System.out.println(card2);
	}

}
