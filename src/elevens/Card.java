//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package elevens;
public class Card
{
    public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
		"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    //instance variables
        //String suit
        //int face
    private String suit;
    private int face;
    //constructors
    public Card(){
        
    }
    public Card(String s, int f){
        suit = s; face = f;
    }
    // modifiers
        //set methods
    public void setSuit(String s){
        suit = s;
    }
    public void setFace(int f){
        face = f;
    }
    public void setCard(String s, int f){
        suit = s; face = f;
    }
    //accessors
        //get methods
    public int getFace(){
        return face;
    }
    public String getSuit(){
        return suit;
    }
    //toString
    public String toString(){
        return FACES[face] + " of " + suit;
    }
 }