
public class Nizovi2D {

	public static int[][] napraviNiz(int size){
		int[][] niz = new int[size][size];
		for(int i = 0; i < niz.length; i++){
			for(int j = 0; j < niz.length; j++){
			System.out.println("Unesi broj:");
			niz[i][j] = TextIO.getlnInt();
			}
		}
		return niz;
	}
	
	public static void ispisNiza(int[][] niz){
		
		for(int i = 0; i < niz.length; i++){
			for(int j = 0; j < niz.length; j++){
				if( i == -1 && j == -1)
					throw new IllegalArgumentException("Moj error");
			if( j == niz.length - 1){
			System.out.println(niz[i][j]);
			} else {
				System.out.print(niz[i][j] + ", ");
			}
			}
		}
	}

	
	public static double prosjekReda(int[] red){
		int sum = 0;
		
		for(int i = 0; i < red.length; i++){
			sum += red[i];
		}
		double average = (double)sum / red.length;
		return average;
	}
	
	public static double prosjekKolone(int[][] matrica, int kolona){
		int sum = 0;
		for(int i = 0; i < matrica.length; i++){
			sum += matrica[i][kolona];
		}
		double average = (double) sum / matrica.length;
		return average;
	}
	
	public static int[] trazi(int[][] niz, int broj){
		int[] index = {-1, -1};
		
		for(int i = 0; i < niz.length; i++){
			for(int j = 0; j < niz.length; j++){
			if(niz[i][j] == broj){
				index[0] = i;
				index[1] = j;
				break;
			}
			}
		}
		
		return index;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Unesi velicinu niza");
		int size = TextIO.getlnInt();
		
		int[][] niz = napraviNiz(size);
		ispisNiza(niz);
		System.out.println("Koji broj trazim?");
		int broj = TextIO.getlnInt();
		int[] index = trazi(niz, broj);
		
		if(index[0] == -1){
			System.out.println("Broj nije u nizu");
		} else {
			System.out.printf("Broj je na indexu: %d, %d \n", index[0], index[1]);
		}
		
		System.out.println("Average: ");
		for(int i = 0; i < niz.length; i++){
			System.out.printf("Prosjek reda: %2d je %.3f \n", i, prosjekReda(niz[i]) );
		}
		
		for(int i = 0; i < niz[0].length; i++){
			System.out.printf("Prosjek kolone: %2d je %.3f \n", i, prosjekKolone(niz, i) );
		}
		
	}


}
