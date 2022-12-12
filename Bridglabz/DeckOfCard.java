package Com.Bridglabz;

public class DeckOfCard {
	  public static void main(String[] args) {
	        String[] Suits = {
	                "Clubs", "Diamonds", "Spades", "Hearts"
	        };

	        String[] Ranks = {
	                "2", "3", "4", "5", "6", "7", "8", "9", "10","Ace",
	                "Jack", "Queen", "King"
	        };

	       
	        int n = Suits.length * Ranks.length;
	        String[] deck = new String[n];
	        for (int i = 0; i < Ranks.length; i++) {
	            for (int j = 0; j < Suits.length; j++) {
	                deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            int r = i + (int) (Math.random() * (n-i));
	            String temp = deck[r];
	            deck[r] = deck[i];
	            deck[i] = temp;
	        }
	       
	        for (int i = 0; i < n; i++) {
	            System.out.println(deck[i]);
	        }
	    }
}
