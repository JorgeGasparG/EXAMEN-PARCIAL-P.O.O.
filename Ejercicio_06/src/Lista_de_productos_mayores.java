import java.util.Scanner;

public class Lista_de_productos_mayores {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("cantidad de datos de la lista");
	    int n = teclado.nextInt();
		int [] A= new int[n];
		int [] A1= new int[n-3];
		int [] B = new int[n-3];
		System.out.println("ingrese datos de la lista");
		for(int s=0;s<n;s++) {
			A[s]=teclado.nextInt();
		}
		for(int i = 0;i<n-3;i++) {
			int y=1;
			B[i]=i;
			for(int j=0;j<4;j++) {
				y=y*A[i+j];
				A1[i]=y;
				
			}
		}
		for(int k=0;k<B.length;k++) {
			
			for(int l=k+1;l<B.length;l++){
				if(A1[k]>A1[l]) {
					int r=A1[k];
					A1[k]=A1[l];
					A1[l]=r;
					
					int p=B[k];
					B[k]=B[l];
					B[l]=p;
					
				}
				
			}
		
	
	   }
		for(int m=0;m<4;m++) {
			System.out.println(A[B[n-4]+m]);
		}
	}

}
