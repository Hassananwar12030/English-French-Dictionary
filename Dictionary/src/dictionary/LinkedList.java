
package dictionary;

import java.io.*;


public class LinkedList<T extends Comparable<T>> {
    Dnode head;
    
    LinkedList(){
        
        
        
        
        
        
        
    }
    
    
    public void insert (String word, int collisions){
        
        Dnode N=new Dnode(word, collisions);
        
        
        
        if(head==null){
            head=N;
        }
        else{
           Dnode T=head;
           
           
            while(T.next!=null){
                
                T=T.next;
            }
            
            T.next=N;
            
        }
            
        
        
        
    }
    
    
    public Boolean find(T d){
        
     Dnode T=head;
     
         while(T.next!=null){
             
             if(T.word==d){
                 return true;
             }
             
             T=T.next;
             
         }
         
         return false;
     
     
        
        
        
        
        
        
        
        
    }
    
    public void clear(){
        
        this.head=null;
        
        
    }
    
    
    public void delete(T d){
        
        
       Dnode T=head;
       
       Dnode P=T;
       
       
       
       
        
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
            
            
            
            
        }*/
     
     
     while(T!=null){
         
         if(T.word==d){
             
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
        
        
    }
    
    @Override
    public String toString(){
       String str="";
       Dnode T=head;
       while(T!=null){
            str=str+T.word+" "+T.collisions;
            T=T.next;
        }
        
        return str;
        
    }
    
     public void Print(){
       String str="";
       Dnode T=head;
       while(T!=null){
            System.out.println("Word: "+T.word+" Collisions"+T.collisions);
            T=T.next;
        }
        
       
        
    }
    
    
    public void putInCSV(String FilePath){
        
        Dnode T=head;
        
        while(T!=null){
            
            try{
                
                FileWriter FW=new FileWriter(FilePath,true);
                BufferedWriter BW=new BufferedWriter(FW);
                PrintWriter PW=new PrintWriter(BW);
                
                PW.println(T.word+"%"+T.collisions);
                PW.flush();
            }
            catch(Exception e){
                
                
            }
            T=T.next;
            
            
        }
        
    }
    
}

