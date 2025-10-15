package e02_static;

public class CardMain {

	public static void main(String[] args) {
		//싱글톤 패턴 적용됨
		CardFactory factory = CardFactory.getInstance();
		System.out.println(factory);
		factory = CardFactory.getInstance();
		System.out.println(factory);
		factory = CardFactory.getInstance();
		System.out.println(factory);
		factory = CardFactory.getInstance();
		System.out.println(factory);
		factory = CardFactory.getInstance();
		System.out.println(factory);
		factory = CardFactory.getInstance();
		System.out.println(factory);
		Card card1 = factory.createCard("홍길동");
		System.out.println(card1);
		Card card2 = factory.createCard("김철수");
		System.out.println(card2);
		
		CardService service = new CardService();
		Card card3 = service.createCard("박영수");
		System.out.println(card3);
		
		
	}

}
