package new1;

public class HW43_pramoug_plus {

	
public static void  main (String[] args ) {
		
		int n=5;  // n можно вводить с клавиатуры любое
		String[][] arr1= new String[n][n];
		for (int i=0;i<n;i++)		{
			for (int j=0;j<n;j++) {
		
			arr1[i][j]=" ";
			if ((i==0)||(j==0 )||(i==(n-1))||(j==(n-1)) ) {arr1[i][j]="+";}
		
			System.out.print(arr1[i][j]+"  ");
			
		}
			System.out.println();
			}
		
		
		
		
	}
}
