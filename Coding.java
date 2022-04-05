public class Coding{
	public static byte[][] code(byte[] data){
		// methode code, cette methode prend en parametre un tableau 1D de type byte et retourne un tableau 2D de typt byte
		byte[][] data1=new byte[3][data.length];
		for(int j=0;j<3;j++){
		for (int i=0;i<data.length;i++){
		data1[j][i]=data[i];
	}
		}
		return data1;
	}
	public static byte[] decode(byte[][] data){
// methode code, cette methode prend en parametre un tableau 2D de type byte et retourne un tableau 1D de type byte
	byte [] data2=new byte[data[0].length];
	int k=0;
	for(int i=0;i<data[0].length;i++){
		for(int j=0;j<1;j++){
			if(data[j][i]==data[j+1][i] && data[j+1][i]==data[j+2][i]){
				data2[k]=data[j][i];
				k++;
			}
			else if(data[j][i]!=data[j+1][i] && data[j+1][i]!=data[j+2][i]){
				data2[k]=data[0][i];
				k++;
			}
			else if(data[j][i]==data[j+1][i] && data[j][i]!=data[j+2][i]){
				data2[k]=data[j][i];
				k++;
			}
			else if(data[j][i]!=data[j+1][i] && data[j+1][i]==data[j+2][i]){
				data2[k]=data[j+1][i];
				k++;
			}
			else{
				data2[k]=data[j][i];
				k++;
			}
		}
	}
	return data2;
}
	public static void main(String[] args){
		byte[] data={1,2,3,4,5,6};
		System.out.println("Le tableau code si pas d'erreur de transmission :");
		byte [][] tab;
		tab=code(data);
	    for(int i=0;i<3;i++){
			for(int j=0;j<(data.length);j++){
				System.out.print(tab[i][j]+" ");
			}
			System.out.println("");
		}
		tab[0][0]=50;
		tab[1][2]=11;
		tab[2][3]=32;
		
		System.out.println("Le tableau code recu est");
		for(int i=0;i<3;i++){
			for(int j=0;j<(data.length);j++){
				System.out.print(tab[i][j]+" ");
			}
			System.out.println("");
		}
		 byte[] tab2;
		 tab2=decode(tab);
		 // compter le nombre d'erreur
		 int k=0;
		 for(int rangee=0;rangee<3;rangee++){
		 for(int g=0;g<tab2.length;g++){
			 if(tab[rangee][g]!=data[g]){
				 k++;
			 }
		 }
		 }
		 //afficher le tableau corrige
		 System.out.println("Le tableau corrige est:"+"(contient "+k+" ereurs de transmission)");
		for(int f=0;f<tab2.length;f++){
			System.out.print(tab2[f]+" ");
     }
    }
}