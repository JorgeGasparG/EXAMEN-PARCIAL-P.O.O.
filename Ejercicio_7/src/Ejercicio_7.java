
public class Ejercicio_7 {
	public static void main(String[] args) {
		
		int x= 4;
		int w =9;
		int q;
		int i = 0;
		for (i=-1;i<20;i+=3) {
			x++;
			for(q=4;q<11;q++) {
				do {
					i=+3;
					w= sizeof(i);
					i=x+w;
					x=w+i;
				}
				while(x<15);
				}
			}
		System.out.print("x=" + x +";" +"i="+ i );
		}

		private static int sizeof(int i) {
			// TODO Auto-generated method stub
			return 4;
		}

}
