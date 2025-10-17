package jdbc;

public class Test implements AutoCloseable{
	public void test() {
		System.out.println("Hello");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Test - close()");
	}
}
