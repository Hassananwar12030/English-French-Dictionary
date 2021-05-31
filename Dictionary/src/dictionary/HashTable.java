
package dictionary;



public class HashTable {
 Node[] Table;
 LinkedList CollidedWord=new LinkedList();
 int CountNotInserted=0;
 int countInserted=0;
 HashTable(int s){
 Table=new Node [s+(s/3)];
 
 //Intialize();
 // table size should be a prime number and 1/3 extra.
 }
 
 public void Intialize(){
     
     for(int i=0; i<Table.length; i++){
         
         Table[i]=new Node(null, null, null, null, null);
     }
 }
 public int strToInt(String v){
 // convert string into integer
 
 int i=0;
 
 /* for(int k=0; k<v.length(); k++){    
        int a=(int) v.charAt(k);     
        i= (int) (i+(a));    
    } 
 
  for(int k=0; k<v.length(); k++){    
        int a=(int) v.charAt(k);     
        i= (int) (i+(a*Math.pow(3,k)));    
    } */
 
  for(int k=0; k<v.length(); k++){    
        int a=(int) v.charAt(k);     
        i= (int) (i+(a));    
    } 
 
 
 
 return i;
 
 }
 
  private int nextPrime(int num){
     for(int i=2; i<num; i++){
         if(num%i==0){
             num++;
             i=2;
         }        
     }
     return num;
 }
 
  public int LastTwoDigits(int X){
      
      String s=Integer.toString(X);
      
    //  System.out.println("The number: "+X);
      
      String A=""+s.charAt(s.length()-2)+(s.charAt(s.length()-1));
      
     // System.out.println("The last two digits: "+A);
      
      return Integer.parseInt(A);
  }
 
 public int Hash(String v){
 //call strToInt and compute hash value by taking mod on returned value
 
 //return Table.length%(strToInt(v));
 return ((strToInt(v)))%Table.length;
 
 }
 public int Rehash(int index, int i){
 
 
return (index+(i*i)+7)%Table.length;
 }
 
 public int LinearRehash(int index, int i){
 
 
return (index+(i))%Table.length;
 }
 
  public int RehashLastTwoDigits(int index, int i){
 
 
return (index+(i*i))%Table.length;
 }
 
 
 
 public void insert(Node X, String Word){
     
   //  Node X=new Node(Word, Meaning);
 // compute hash value,
 int index=Hash(Word);
 
 
 
 
 // if (no collision on hash value) then place word
 
 if(Table[index]==null){
     
     CollidedWord.insert(Word, 0);
     Table[index]=X;
     countInserted++;
 }
 //else call rehash function until empty cell found
 
 else{
     
     int start=index;
   //  System.out.println("Starting index for "+Word+" is "+start);
     int i=1;
     do{
         
             index=Rehash(start,i);
         
        // System.out.println("New index searched for "+Word+" is "+index);
         
         if(Table[index]==null){
             Table[index]=X;
             CollidedWord.insert(Word, i);
              countInserted++;
             break;
         }
         
       //  System.out.println("Index value: "+index);
         i++;
     } while(i!=Table.length);
     
     /*if(index!=start && Table[index]==null){
         
         System.out.println("Finally "+Word+" is insert at index: "+index);
          CollidedWord.insert(Word, i);
      //   System.out.println("Index value: "+index);
         Table[index]=X; 
     }
     else{
         
                  CountNotInserted++;

         System.out.println("THE TABLE IS FULL");
     }*/
     
     if(i==Table.length){
         System.out.println("THE DICTIONARY IS FULL");CountNotInserted++; }
     
 } 
 // also compute number of collisions on insertion of each word
 } 
 
 
 /*public void insert(Node n, String Word){
    int hash=Hash(Word);
    if(Table[hash]==null){   // if (no collision on hash value) then place word     
        Table[hash]=n;    
       countInserted++;
    }
    else{   //else call rehash function until empty cell found    
        int index=hash;
        int i;
        for(i=1; i<Table.length; i++){
            index=Rehash(hash,i);
           // System.out.println("New index searched for "+Word+" is "+index);
            if(Table[index]==null){
                break;
            }
        }
        if(i!=Table.length){
            
         //System.out.println("Finally "+Word+" is insert at index: "+index);
            CollidedWord.insert(Word, i);
                 //       System.out.println("Finally "+Word+" is placed at index "+index);
countInserted++;
            Table[index]=n; 
        }
        else{
            System.out.println("THE TABLE IS FULL");
        }
    }
 }*/
 
 
 public Node searchEW (String Word) { 
// search word in a hash table 
 int index=Hash(Word);
 
 // if (no collision on hash value) then place word
 
 if(Table[index]!=null && Table[index].EnglishWord.equals(Word)){
     
     return Table[index];
 }
 //else call rehash function until empty cell found
  else{
     
     int start=index;
     int i=1;
     
     
     do{
         index=Rehash(start,i);
         
         if(Table[index]!=null && Table[index].EnglishWord.equals(Word)){
             
             return Table[index];
         }
         
        // System.out.println("Index: "+index);
       i++;
     } while(i!=Table.length);
     
     Node Null=new Node(null, null, "This word does not exist in dictionary", null, null);
     return Null ;
     
 }
 
 
 }
 
 
 
 
 
 public Node searchFW (String Word) { 
// search word in a hash table 
 int index=Hash(Word);
 
 // if (no collision on hash value) then place word
 
 if(Table[index]!=null && Table[index].FrenchWord.equals(Word)){
     
     return Table[index];
 }
 //else call rehash function until empty cell found
  else{
     
     int start=index;
     int i=1;
     
     
     do{
         index=Rehash(start,i);
         
         if(Table[index]!=null && Table[index].FrenchWord.equals(Word)){
             return Table[index];
         }
         
        // System.out.println("Index: "+index);
       i++;
     } while(i!=Table.length);
     
    Node Null=new Node(null, null,null, "This word does not exist in dictionary", null);
     return Null ;
 }
 
 
 } 
 
 
/* public int searchToDelete (String Word) { 
// search word in a hash table 
 

int index=Hash(Word);
 
 
 
 
 // if (no collision on hash value) then place word
 
 if(Table[index].Word!=null && Table[index].Word.equals(Word)){
     
    return index;
 }
 //else call rehash function until empty cell found
 
 else{
     
     int start=index;
     int i=1;
     
     
     do{
         index=Rehash(index,i);
         
        // System.out.println("Index: "+index);
       i++;
     } while(!(Table[index].Word.equals(Word)) && index!=start);
     
     if(Table[index].Word!=null && Table[index].Word.equals(Word)){
         
             return index;

     }
     else{
         
         return -1;
     }
     
 }
 
 
 }
 public void delete (String x) { 
// delete word from hash table 
 
int index=searchToDelete(x);

if(index==-1){
    System.out.println("The word does not exist in the dictionary");
}
else{
    Table[index].Word=null;
    Table[index].Meaning=null;
}
 
 }*/
 public void displayTable() {
     
    // String str="";
     int count=0;
    for(int i=0; i<Table.length; i++){
        System.out.println("\n");
        
        if(Table[i]!=null){
        System.out.println(Table[i].EnglishWord+" "+"At index: "+i); 
        count++;
        }
       // str=str+Table[i]+"\n";
    }
    
     System.out.println("COUNT: "+count);
 
 
    //return str;
 
 }
}

