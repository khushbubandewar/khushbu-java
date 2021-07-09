
abstract class AB {
	abstract void ex();
}

class BA extends AB{
	void ex() {
		System.out.println("Example Of Abstraction");
	}
	
	public static void main(String[]args) {
		AB object = new BA();
		object.ex();
	}
}
