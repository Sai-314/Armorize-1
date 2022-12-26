package AnonymousInnerClass;

public class WithAnonymous {

	public static void main(String[] args) {

		// Instead of creating multiple classes here we created multiple objects
		// By using that objects we are overriding the methods
		Service s1 = new Service() {

			@Override
			public void greeting() {
				System.out.println("Hello Friends...");

			}
		};
		s1.greeting();
		Service s2 = new Service() {

			@Override
			public void greeting() {
				System.out.println("I'm Saiiii");
				System.out.println("Please create another service object and print your name");
			}
		};
		s2.greeting();

	}

}
