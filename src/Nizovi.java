
public class Nizovi {

	
	public static int[] napraviNiz(int size){
		int[] niz = new int[size];
		for(int i = 0; i < niz.length; i++){
			System.out.println("Unesi broj:");
			niz[i] = TextIO.getlnInt();
		}
		return niz;
	}
	
	public static void ispisNiza(int[] niz){
		for(int i = 0; i < niz.length; i++){
			if( i == niz.length - 1){
			System.out.println(niz[i]);
			} else {
				System.out.print(niz[i] + ", ");
			}
		}
	}
	
	public static int trazi(int[] niz, int broj){
		int index = -1;
		
		for(int i = 0; i < niz.length; i++){
			if(niz[i] == broj){
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Unesi velicinu niza");
		int size = TextIO.getlnInt();
		
		int[] niz = napraviNiz(size);
		ispisNiza(niz);
		System.out.println("Koji broj trazim?");
		int broj = TextIO.getlnInt();
		int index = trazi(niz, broj);
		
		if(index == -1){
			System.out.println("Broj nije u nizu");
		} else {
			System.out.println("Broj je na indexu: " + index);
		}
		
	}

}
