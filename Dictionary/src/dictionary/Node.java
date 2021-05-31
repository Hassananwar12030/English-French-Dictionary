
package dictionary;


public class Node <T extends Comparable<T>>{
    
    
    Node<T> prev;
    Node<T> next;
    
    String EnglishWord;
    String FrenchWord;
    String EnglishMeaning;
    String FrenchMeaning;
    String Type;
    public Node(String EW, String FW, String EM, String FM, String T){
       
        EnglishWord=EW;
        FrenchWord=FW;
        EnglishMeaning=EM;
        FrenchMeaning=FM;
        
        Type=T;
    }
    
   /* public String toString(){
        
        return "\nFRENCH WORD: "+FrenchWord+"\n ENGLISH MEANING: "+EnglishMeaning+"\n ENGLISH WORD: "+EnglishWord+"\n FRENCH MEANING: "+FrenchMeaning;
        
    }*/
    
}
