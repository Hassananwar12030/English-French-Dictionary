
package dictionary;


public class HashTableSC<T extends Comparable <T>> {
    
    
    
    LinkedListSC [] Table;
    LinkedList CollidedWord=new LinkedList();
    
 public HashTableSC(int s){
     
     Table=new LinkedListSC[s+(s/3)]; 
     
    // Initialize();
 
 }
 
 
 
 public void Initialize(){
     
     for(int i=0; i<Table.length; i++){
         
         Table[i]=new LinkedListSC();
         
         
     }
     
     
 }
 
 public int strToInt(String v){
 // convert string into integer
 
 int i=0;
 

 
  for(int k=0; k<v.length(); k++){    
        int a=(int) v.charAt(k);     
        i= (int) (i+(a));    
    } 
  
  return i;
 
 }
 
public int Hash(String obj){ 
    
    
    return strToInt(obj)%Table.length;
    

}
public void insert(Node X, String Word){
    
  if(Table[Hash(Word)]==null){
      
      
    Table[Hash(Word)]=new LinkedListSC();  
    
    
  } 
  
    
    insertinLL(X, Hash(Word));
    // CollidedWord.insert(X.EnglishWord, 1);
  
}

  public void insertinLL (Node N, int X){
        
      //  Node<T> N=new Node(d);
        
        int collision=0;
        
        if(Table[X].head==null){
            Table[X].head=N;
            
          CollidedWord.insert(N.EnglishWord, collision);
            
        }
        else{
           Node T=Table[X].head;
           
           
            while(T.next!=null){
                
                T=T.next;
                collision++;
            }
            
            T.next=N;
                      CollidedWord.insert(N.EnglishWord, collision);

            
            
            
        }
            
        
        
        
    }
    
public String find(String Word) {
    
    int index=Hash(Word);
    
    if(Table[index]!=null){
    
    return Table[index].findEW(Word);
    
    }
    
    return null;

    
}
/*public void delete(int obj){
    
    int index=Hash(obj);
    
    
    Table[index].delete(obj);
    
    

}*/



        
        
public void displayTable() {
    
    
    System.out.println("\n\n\n");
    
    for(int i=0; i<Table.length; i++){
        
        if(Table[i]!=null)
        System.out.println(Table[i]);
    }
    
    System.out.println("\n\n\n");
    

}
    
}

