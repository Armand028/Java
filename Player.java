/***The Player class should be able to represent the set of cards a player has in hand.
* The player class must allow to take a card from the deck and put it in the hand, 
* count the points of the cards in hand...
**/
import java.util.ArrayList;
public class Player {
 private ArrayList<Card> hand; // The cards in the plyaer's hand.
 /*Constructor*/
Player(){
hand=new ArrayList<Card>();
 } 
/*Accessor*/
public ArrayList<Card> getHand() {
	return hand;
 }/*** Remove all cards from the hand, leaving it empty. */
 public void clear() {
	getHand().clear();
 }
 /*** Add a card to the hand. It is added at the end of the current hand.
 * @param card the non-null card to be added.
 * @throws NullPointerException if the parameter card is null.
 */
 public void add(Card card) {
	 if(card!=null) {
		 getHand().add(card);
	 }
	 else {
		 throw new NullPointerException();
	 }
 }
 /** * Remove a card from the hand, if present.
 * @param card the card to be removed. If card is null or if the card is not in 
 * the hand, then nothing is done.
 */
 public void remove(Card card) {
	 if(getHand().size()!=0) {
		 for(Card i:getHand()) {
			 if(i==card && i!=null) getHand().remove(card);
		 }
	 }
 }
 /*** Remove the card in a specified position from the hand.
 * @param position the position of the card that is to be removed, where
 * positions are numbered starting from zero.
 * @throws IllegalArgumentException if the position does not exist in
 * the hand, that is if the position is less than 0 or greater than
 * or equal to the number of cards in the hand.
 */
 public void remove(int position) {
	 if(position<0 || position>=getHand().size()) {
		 throw new IllegalArgumentException();
	}
	 else {
		 getHand().remove(position);
	 }
 }
 /*** Returns the number of cards in the hand. */
 public int totalCards() {
	 return getHand().size();
	 }
 /*** Gets the card in a specified position in the hand. (Note that this card
 * is not removed from the hand!)
 * @param position the position of the card that is to be returned
 * @throws IllegalArgumentException if position does not exist in the hand
 */
 public Card getCard(int position) {
	 Card a=null;
	 if(position<0 || position>=getHand().size()) {
		 throw new IllegalArgumentException();
	}
	 else {
		 	a= getHand().get(position);
	 }
	 return a;
 }
 /** * Computes and returns the total value of this hand in the game */
 public int getHandTotal(){
	 int a=0;
	 for(int i=0;i<getHand().size();i++) {
		 Card get=getCard(i);
		 if(get!=null) {
			 int valu=get.getValue();
			 if(valu>10) {
				 valu=10;
			 }
			 a+=valu;
		 }
	 }
	 for(int i=0;i<this.hand.size();i++) {
		 Card get=getCard(i);
		 if(get!=null) {
			 int valu=get.getValue();
			 if(valu==1 && (a+10)<=21){
				 a=a+10;
			 }
		 }
	 }
	 return a;
 }
 
 /** * Sorts the cards in the hand so that cards of the same color are
 * grouped together, and within a color the cards are sorted by value.
 * Note that aces are considered to have the lowest value, 1.
 */
 public void sortByColor() {
	 ArrayList<Card> hand2=new ArrayList<Card>();
	 for(int j=0;j<4;j++) {
		 for(int i=0;i<getHand().size();i++) {
			 Card get=getCard(i);
			 int color=get.getColor();
			 if(color==j) {
				 hand2.add(get);
			 }
		 }
	 }
	 ArrayList<Card> hand3=new ArrayList<Card>();
	 for(int i=0;i<4;i++){
		 for(int j=1;j<14;j++) {
			 for(int k=0;k<getHand().size();k++) {
				 Card get=hand2.get(k);
				 int valu=get.getValue();
				 int color=get.getColor();
				 if(valu==j && color==i) {
					 hand3.add(get);
				 }
			 }
		 }
	 }
	 hand=hand3;
 }
 /*** Sorts the cards in the hand so that cards of the same value are
 * grouped together. Cards with the same value are sorted by color.
 * Note that aces are considered to have the lowest value, 1.
 */
 public void sortByValue() {
	 ArrayList<Card> hand2=new ArrayList<Card>();
	 for(int j=1;j<14;j++) {
		 for(int i=0;i<getHand().size();i++) {
			 Card get=getCard(i);
			 int valu=get.getValue();
			 if(valu==j) {
				 hand2.add(get);
			 }
		 }
	 }
	 ArrayList<Card> hand3=new ArrayList<Card>();
	 for(int i=1;i<14;i++){
		 for(int j=0;j<4;j++) {
			 for(int k=0;k<getHand().size();k++) {
				 Card get=hand2.get(k);
				 int valu=get.getValue();
				 int color=get.getColor();
				 if(valu==i && color==j) {
					 hand3.add(get);
				 }
			 }
		 }
	 } 
	 hand=hand3;
 }
 }// end class Player