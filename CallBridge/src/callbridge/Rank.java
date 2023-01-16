
package callbridge;


public enum Rank {
    ACE(14),KING(13),QUEEN(12),
    JACK(11),TEN(10),NINE(9),
    EIGHT(8),SEVEN(7),SIX(6),
    FIVE(5),FOUR(4),THREE(3),TWO(2);

    private int RankValue;
    
    Rank(int v){
        RankValue = v;
       
    }
    public int getRankValue() {
        return RankValue;
    }
    
}