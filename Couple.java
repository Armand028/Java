public class Couple{
	private int p,q;
	//constructeurs
	public Couple(int p,int q){
		this.p=p;
		this.q=q;
	}
	
	public Couple(){
	   }
	public Couple(Couple couple){
		p=couple.getP();
		q=couple.getQ();
		
	}
	// definition des getters et setters
	public void setP(int p){
		this.p=p;
	}
	public int getP(){
		return p;
	}
	public void setQ(int q){
		this.q=q;
	}
	public int getQ(){
		return q;
	}
	//la methode display pour afficher les éléments du couple
	public void display(){
		System.out.println("("+getP()+","+getQ()+")");
	}
	//methode toString
	public String toString(){
	 return "("+getP()+","+getQ()+")";
	 }
	//cette methode commpare deux couples
	public boolean compare(Couple coup1){
		if((coup1.getP() <this.p) || ((coup1.getP() == this.p && coup1.getQ() < this.q))){
			return true;
		}
		else{
			return false;
			}	
    }
}