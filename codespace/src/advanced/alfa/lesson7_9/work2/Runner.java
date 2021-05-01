package advanced.alfa.lesson7_9.work2;

public class Runner {
    public void run(){
        Card[] cards = new Card[52];
        int i = 0;
        for (Suit suit: Suit.values()             ) {
            for (Rank rank : Rank.values()                 ) {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }

        for (Card cc: cards) {
            System.out.println( cc.toString());
        }
    }
}
