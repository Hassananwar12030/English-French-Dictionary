
package dictionary;


public class Data {
    HashTable EN=new HashTable(34193);
      HashTable FR=new HashTable(34193);
      HashTableSC SC=new HashTableSC(34193);
  
 public void insert(String EW,String FW,String EM,String FM, String T){

       Node n=new Node(EW, FW, EM, FM, T);
        
        EN.insert(n, EW);
        FR.insert(n, FW);
//SC.insert(n, EW);
}
}
