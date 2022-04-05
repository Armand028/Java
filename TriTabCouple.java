public class TriTabCouple{
	/* Ce programme trie des couples*/
	// implementation de la methode bubbleSort
	public static void bubbleSort(Couple[] tab){
		// Cette methode prend en parametre un tableau de couple et retourne le tableau trie
		for(int i=0;i<tab.length-1;i++){
			for(int k=tab.length-1;k>i;k--){
				boolean p=tab[k-1].compare(tab[k]);// comparaison des couples
				if(p=true){
					Couple coup=new Couple(tab[k-1]);
					tab[k-1]=tab[k];
					tab[k]=coup;
				}
			}
		}
	}
	// Methode insertSort, retourne des couple tries, prend en paramettre un tableazu de couples
	public static void insertSort(Couple[] tab){  
          for (int i = 1; i < tab.length; i++){ 
               Couple a = tab[i];  
               int j = i-1;  
               while(j >= 0 && tab[j].compare(a)==true)  
               {
                    tab[j+1] = tab[j];  
                    j--;  
               }  
               tab[j+1] = a; 
        }  
     }	
	public static void main(String[] args){
		Couple[] tableau=new Couple[]{new Couple(2,5),new Couple(2,3),new Couple(0,5)};
		bubbleSort(tableau);
		insertSort(tableau);
		System.out.print("Le tableau trie est: {");
		System.out.print(tableau[0].toString());
		for(int i=1;i<tableau.length;i++){
		    System.out.print(","+tableau[i].toString());			
		}
		System.out.print("}");
	}
}