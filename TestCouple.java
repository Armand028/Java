public class TestCouple{
	public static void main(String[] args){
		Couple c1, c2, c3;
		c1= new Couple(2,3);
		c2=new Couple();
		c3=new Couple(c1);
		c1.display();
		c2.display();
		c3.display();
		c3.setP(8);
		System.out.print("Apres modification, les elements de c3 sont :"+ c3.getP()+","+c3.getQ());
		System.out.println();
		System.out.print("c1 est inferieur a c3 :"+c3.compare(c1));	
	}	
}