
package dictionary;


public class LinkedListSC<T extends Comparable<T>> {
    Node head;
    
    
    
    LinkedListSC(){
        
        
        
        
        
        
        
    }
    
    
    public void insert (Node N){
        
      //  Node<T> N=new Node(d);
        
        int collision=0;
        
        if(head==null){
            head=N;
            
          //  Dnode X=new Dnode(N.EnglishWord,collision);
            
        }
        else{
           Node T=head;
           
           
            while(T.next!=null){
                
                T=T.next;
                collision++;
            }
            
            T.next=N;
            
            
            
        }
            
        
        
        
    }
    
    
    public String findEW(T Word){
        
     Node T=head;
     
         while(T!=null){
             
             if(T.EnglishWord==Word){
                 return T.FrenchMeaning;
             }
             
             T=T.next;
             
         }
         
         return "Does not exist in dictionary";
     
     
 }
    
     public String findFW(T Word){
        
     Node T=head;
     
         while(T!=null){
             
             if(T.FrenchWord==Word){
                 return T.EnglishMeaning;
             }
             
             T=T.next;
             
         }
         
         return "Does not exist in dictionary";
     
     
 }
    
    public void clear(){
        
        this.head=null;
        
        
    }
    
    
   /* public void delete(T d){
        
        
       Node T=head;
       
       Node P=T;
       
       
       
       
        
     /*   while(T!=null){
            
            if(T.data!=d){
            
            P=T;
            
            T=T.next;
            
            }
            else if(T==head){
              head=T.next;
             }
            else{
            P.next=T.next; //Destroyed reference of T
            
             }
            
            
            
            
        }/
     
     
     while(T!=null){
         
         if(T.data==d){
             
             if(T==head){
                 head=head.next;
                 
                 break;
             }
             
             else{
                 P.next=T.next;
                 
                 break;
                 
                 
             }
         }
         else{
             P=T;
             T=T.next;
             
     }
         
         
         
     }
        
        
    }*/
    
    @Override
    public String toString(){
       String str="";
       Node T=head;
       while(T!=null){
            str=str+T.EnglishWord+" ";
            T=T.next;
        }
        
        return str;
        
    } 
    
}