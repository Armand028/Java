public class Card { 
		 private final int color; // Card's color
		 private final int value; //Card's value (1 - 13, with 1 representing ACE).
		 /*** Codes for the colors and non-numeric cards. Cards 2 through 10 have their numerical values 
		 for their codes. **/
		 public final static int CLUBS = 0; 
		 public final static int DIAMONDS = 1;
		 public final static int HEARTS = 2;
		 public final static int SPADES = 3; 
		 
		 public final static int ACE = 1;
		 public final static int JACK = 11; 
		 public final static int QUEEN = 12; 
		 public final static int KING = 13;
		 /*** Constructor, that creates a card with a specified color and value.
		 * @throws IllegalArgumentException if the parameter values are not in the ranges */
		 public Card(int value, int color) {
					this.color =color;
					this.value = value;
					//Card card=new Card(1,1);
					int [] tab1= {1,2,3,4,5,6,7,8,9,10,11,12,13};
					int[] tab2= {0,1,2,3};
					if(check(tab1,this.value)==false) {
						throw new IllegalArgumentException();
					}
					else if(check(tab2,this.color)==false) {
						throw new IllegalArgumentException();
					}
			}
				private boolean check(int[] tab, int val){
				//pour verifier si un élément est dans un tableau
			        boolean b = false;
			        for(int i : tab){
			            if(i == val){
			                b = true;
			                break;
			            }
			        }
			        return b;	
			}
				 /*** Returns the color of this card.*/
				 public int getColor() {
					 return this.color;
				 }
					 /*** Returns the value of this card.
					 * @return the value, which is one of the numbers 1 through 13, inclusive for a regular card.*/
					 public int getValue() {
						 return this.value;
					 }
						 /*** Returns a String representation of the card's color.
						 * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs" */
						 public String ColorToString() {
							 String a = null;
							 if(this.getColor()==3) a="Spades";
							 else if(this.getColor()==2) a="Hearts";
							 else  if(this.getColor()==1) a="Diamonds";
							 else if(this.getColor()==0) a="Clubs";
							 return a;
						 }
		 /*** Returns a String representation of the card's value.
		 * @return for a regular card, one of the strings "Ace", "2", ..., "10", "Jack", "Queen", or 
		 "King". */
		 public String ValueToString() {
			String b=null;
			for(int i=2;i<11;i++) {
				if(this.getValue()==i)
					b=Integer.toString(i);
			}
			if(this.getValue()==1) b="ACE";
				else if(this.getValue()==11) b="JACK";
					else if(this.getValue()==12) b="Queen";
						 else if(this.getValue()==13) b="King";
			return b;
		 }
		 
		/*** Returns a string representation of this card, including both
		 * its color and its value. Sample return values is: "Ace of Diamonds", */
		 public String toString() {
			 return this.ValueToString()+" of "+this.ColorToString();
		 }
} // end class Card
