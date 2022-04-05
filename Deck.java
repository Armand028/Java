public class Deck {
	 private Card[] deck; // an array of 52 cards. 
	 private int number; //the number of cards that have been dealt from the deck
	 /*** Constructs a regular 52-card poker deck. Initially, the cards are in a sorted order. */
	 public Deck() {
		 number=0;
		 deck=new Card[52];
		 int k=0;
		 for(int i=1;i<14;i++) {
			 for(int j=0;j<4;j++) {
				 this.deck[k]=new Card(i,j);
				 k++;
			 }
		 }	 
	}
	 /*** Put all the used cards back into the deck (if any), and shuffle the deck into a random order. */
	 public void shuffle() {
		 if(numberLeft()!=52){
				new Deck();
			}
		 for (int i=0; i<this.deck.length; i++) {
			 int randomIndex = (int)(52 * Math.random());
			 Card temp = deck[i];
			 deck[i] = deck[randomIndex];
			 deck[randomIndex] = temp;
			 }
	}
	 /*** Returns the number of cards left in the deck. */
	 public int numberLeft(){
		int numb=52-number;
		return numb; 
	 }
	 /*** Removes the next card from the deck and return it. It is illegal to call this method if there are no
	 * more cards in the deck. You can check the number of cards remaining by calling the numberLeft() 
	 * function.
	 * @return the card which is removed from the deck.
	 * @throws IllegalStateException if there are no cards left in the deck
	 */
	 private int l=0;
	 public Card take() {
		 if(numberLeft()!=0) {
			 Card car=this.deck[l];
			 this.deck[l]=null;
			 l++;
			 number++;
			 return car;
		 }
		 else {
			 throw new IllegalStateException();
		 }
	 }
} // end class Deck
