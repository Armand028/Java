public class Calculator{
	private double first;
	private double second;
	private String oP;
	private double resultat;
	//constructeur
	public Calculator(){
		
	}
	public double getFirst() {
           return first;
    }
    public void setFirst(double first){
	    this.first=first;
	}
	public double getSecond() {
           return second;
    }
    public void setSecond(double second){
	    this.second=second;
	}
	public String getOp() {
           return oP;
    }
    public void setOp(String oP){
	    this.oP=oP;
	}
	public void operation(String str) {
			first = second; // garde la 1er operande
			second = 0; // initialise et mise à jour pour la 2ème operande
			oP = str;
		}
		
	// pour l’évaluation quand on appuie sur la touche =
	public void compute() {
		if (oP == "+"){
		second = first + second;
		}
		else if(oP=="-"){
			second = first - second;
		}
		else if(oP=="*"){
			second = first*second;
		}
		else if(oP=="/"){
			second = first/second;
		}
		else if(oP=="pow"){
			second = Math.pow(first,second);
		}
		else if(oP=="sqrt"){
			second = Math.sqrt(first);
		}
		else if(oP=="!"){
			if(first!=0){
			second =Math.sqrt(2*Math.PI*first)*(Math.pow((first/2.718),first))*(1+(1/(12*first)));}
			else{
				second=1;
			}
		}
		else if(oP=="ln"){
			second =Math.log(first)/Math.log(2.71828);
		}
	}
	//addition
	public void add(){
	operation("+");
	}
					
	//soustraction
	public void subtract(){
	operation("-");}
					
	//multiplication
    public void multiply(){operation("*");}
					
	// division
    public void divide(){operation("/");}
					
	// factorielle d’un nombre (réel)
	public void factorial(){operation("!");}
					
	//puissance
	public void pow(){operation("pow");}
					
	// racine carrée d’un nombre
	public void rootSquare(){operation("sqrt");}
					
	// logarithme népérien
	public void nepLog(){operation("ln");}
					
	// remise à zéro quand on appuie sur la touche C
	public void clear(){
		first=0;
		second=0;
		oP="";
		}
					
	// renvoie la 2ème opérande
	public double display(){
		return second;
	}
}