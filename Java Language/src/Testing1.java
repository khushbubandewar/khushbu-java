import javax.crypto.spec.PSource;

public class Testing1 implements printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing1 d = new Testing1();
		d.display();
		d.print();
		d.show();
		
		/*Testing1 p = new Testing1();
		p.print();
	
		Testing1 s = new Testing1();
		s.show();*/
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print interface");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Interface");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display interface");
		
	}

}



