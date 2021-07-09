class Test
{
	public static void main(String[]args){
		System.out.println("First value " +args[0]);
		System.out.println("secound value " +args[1]);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a>b){
			System.out.println("a is larger");
		}else{
			System.out.println("b is larger");
		}
   }
}