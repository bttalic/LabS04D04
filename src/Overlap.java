
public class Overlap {

	public static int indexOf(String[] niz, String word){
		int index = -1;
		
		for(int i = 0; i < niz.length; i++){
			if( niz[i].equals(word) ){
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {

		if( args.length == 2){
		String prva = args[0];
		String druga = args[1];
		
		String[] prvaNiz = prva.split(" ");
		String[] drugaNiz = druga.split(" ");
		/*nacin prvi*/
		for(int i = 0; i < prvaNiz.length; i++){
			if( indexOf(drugaNiz, prvaNiz[i]) != -1 )
				System.out.println(prvaNiz[i]);
		}
		/*nacin drugi*/
		for(int i = 0; i < prvaNiz.length; i++){
			if( druga.indexOf(prvaNiz[i]) != -1 ){
				System.out.println(prvaNiz[i]);
			}
		}
		
		/*treci nacin*/
		for(int i = 0; i < prvaNiz.length; i++){
			if( druga.contains(prvaNiz[i]) == true ){
				System.out.println(prvaNiz[i]);
			}
		}
		
		} else {
			System.out.println("Nedovoljno argumenata");
		}

	}

}
