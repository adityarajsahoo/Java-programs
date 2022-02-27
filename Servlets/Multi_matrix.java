

public class Multi_matrix {
	public static void main(String args[]) {
		        int a[][] = {{1,2},{4,8}};
		        int b[][] = {{2,3},{7,9}};
		        int c[][] = new int[2][2];
		        int d[][] = new int[2][2];
		        System.out.println("\nMatrix A:");
		        for(int i=0;i<2;i++) {
		        	for(int j=0;j<2;j++) {
		        		System.out.print(a[i][j]+" ");
		        		
		        	}
		        	System.out.println();
		        }
		        System.out.println("\nMatrix B:");
		        for(int i=0;i<2;i++) {
		        	for(int j=0;j<2;j++) {
		        		System.out.print(b[i][j]+" ");
		        		
		        	}
		        	System.out.println();
		        }
		        System.out.println("\n-----MATRIX ADDITION-----");
		        System.out.println("\nMatrix C: Matrix A + Matrix B");
		        for(int i=0;i<2;i++) {
		        	for(int j=0;j<2;j++) {
		        		c[i][j] = a[i][j] + b[i][j];
		        		System.out.print(c[i][j]+" ");
		        		
		        	}
		        	System.out.println();
		        }
		        System.out.println("\n-----MATRIX MULTIPLICATION-----");
		        System.out.println("\nMatrix D: Matrix A * Matrix B");
		        for(int i=0;i<2;i++) {
		        	for(int j=0;j<2;j++) {
		        		d[i][j] = a[i][j] * b[i][j];
		        		System.out.print(d[i][j]+" ");
		        		
		        	}
		        	System.out.println();
		        }
		 }

	
}
