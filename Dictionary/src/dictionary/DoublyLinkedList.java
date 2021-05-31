
package dictionary;


public class DoublyLinkedList <T extends Comparable<T>>{
    
      Node<T> head;
      HashTable EN=new HashTable(34193);
      HashTable FR=new HashTable(34193);
      
    
    public void insertInOrder(String EW,String FW,String EM,String FM, String T){
        
        
        
        Node<T> n=new Node(EW, FW, EM, FM, T);
        
        EN.insert(n, EW);
        FR.insert(n, FW);
        
        Node<T> temp=head;
        Node<T> previous=temp;
        
        
        if(head==null){
            
            head=n;
        }
        else{
            
        while(temp!=null && n.EnglishWord.compareTo(temp.EnglishWord)>0){
            previous=temp;
            temp=temp.next;
            
        }
        if(temp==null){
            previous.next=n;
            n.prev=previous;
        }
        else if(temp==head){
            
            
            n.next=head;
            head.prev=n;
            head=n;
            
            
            
        }
        else{
            
            n.next=temp;
            n.prev=temp.prev;
            temp.prev.next=n;
            temp.prev=n;
            
        }
        
        
        
        
        
        }
        
    }
    
  /*  public Node Find(T Word){ // return node with data=value
        
        
       Node<T> temp=head;
       
       
        
        while(temp.next!=null){
            
            if(temp.data==value){
                
                return temp;
            }
            
            temp=temp.next;
        }
        
        if(temp.next==null && temp.data==value){
            
            return temp;
        }
        
        else{
            return null;
        }
    }
    
    
    public void Delete(T value){
        
        Node temp=Find(value);
        
        if(temp==null)
            System.out.println("Value not found");
        
        
        
       else if(temp==head){ //adding else if is necessary in order to execute exactly one of the if blocks 
            head=temp.next;
            head.prev=null;
        }
        else if(temp.next==null){
            
            temp.prev.next=null;
            
        }        
        else{
            
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        
        
        }
        
        
        
        
    }
    
    @Override
    public String toString(){
        
         String str="";
       Node T=head;
       while(T!=null){
            str=str+T+" ";
            T=T.next;
        }
        
        return str;
        
        
    }
    
    public void clearList(){
        
        head=null;
        
        
    }
    
    
    public boolean isEmpty(){
        
        if(head==null)
            return true;
        else
            return false;
        
    }
    
    public int Length(){
        
        Node temp=head;
        int count=0;
        
        if(head==null)
            return 0;
        
        while(temp.next!=null){
            
            temp=temp.next;
            count++;
        }
        
        return count+1;
        
        
    }
    
    public void ReverseList(){
        
        
              Node temp=head;
              
              while(temp.next!=null){
                  
                  if(temp==head){
                      
                      Node temp2=temp.next;
                      temp.next=null;
                      temp.prev=temp2;
                      temp=temp2;
                  }
                  
                  else{
                      Node temp2=temp.next;
                      temp.next=temp.prev;
                      temp.prev=temp2;
                      temp=temp2;
                      
                      
                  }
                  
                  
                  
                  
              }
              
              temp.next=temp.prev;
              temp.prev=null;
              head=temp;
              
         
     
     
           
       
       
        
        
           }*/
    
    
}

