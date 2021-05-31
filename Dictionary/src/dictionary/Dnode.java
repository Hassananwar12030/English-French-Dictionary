
package dictionary;


public class Dnode {
    
   String word;
   int collisions;
   Dnode next;
   Dnode prev;
   
   
   public Dnode(String w, int x){
    
    word=w; 
    collisions=x;
    
}
    
}
