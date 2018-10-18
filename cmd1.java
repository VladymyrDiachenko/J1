package new1;

public class cmd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("args  "+args.length);
		for ( int i= 0; i<args.length;i++)
		{ System.out.println(args[i]);}
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		System.out.println(c);

				
	}

}
