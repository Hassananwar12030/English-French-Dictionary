
package dictionary;

import java.io.*;
import java.util.Scanner;


public class Dictionary {

    
    public static void main(String[] args) {
        
      //  System.out.println("HEllo");

       WELCOME X=new WELCOME();
        
    //  Data X=DumpData();
      
     // Scanner sc=new Scanner(System.in);
      
    //  X.FR.displayTable();
  //   X.FR.CollidedWord.putInCSV("frCollisions.csv");
         // X.FR.CollidedWord.Print();
          
      //  System.out.println("Not inserted in : "+X.EN.CountNotInserted+" \nInserted Count: "+X.EN.countInserted);
       //  System.out.println("Not inserted in FR: "+X.FR.CountNotInserted+" \nInserted Count: "+X.FR.countInserted);

           
      
     //  System.out.println("Enter the French word you want to search");
        
    //  String word=sc.nextLine();
        
     //   word=word.trim().toLowerCase();
      //  System.out.println( X.FR.searchFW(word)); 
       //  X.EN.CollidedWord.Print();
       
     //  X.EN.CollidedWord.putInCSV("AddingPrimeToRehash.csv");
     //  X.SC.displayTable();
  //   X.EN.CollidedWord.putInCSV("HashingWithSize.csv");
        
        
      
     // X.EN.displayTable();
        
        
    }
    
    
    
    public static Data DumpData(){
        
        int counter=0;
        
        Data X=new Data();
        
        
         try{
		
    	// Open the file that is the first 
		// command line parameter
    	//https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html
		FileInputStream fstream = new FileInputStream("COMPLETE DICTIONARY.csv");
		
		// Get the object of DataInputStream
		//https://docs.oracle.com/javase/tutorial/essential/io/datastreams.html
		DataInputStream in = new DataInputStream(fstream);
		
        //https://docs.oracle.com/javase/tutorial/essential/io/buffers.html
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String strLine;
		
		//Read File Line By Line
		while ((strLine = br.readLine()) != null) 	{
			// Print the content on the console
			                 
                          if(!strLine.isEmpty()){              
                              
                            
                        
                        String [] Arr=strLine.split("%");
                        
                        Arr[0]=Arr[0].trim().toLowerCase();
                        Arr[1]=Arr[1].trim().toLowerCase();

                        Arr[2]=Arr[2].trim().toLowerCase();
                        Arr[3]=Arr[3].trim().toLowerCase();
                         Arr[4]=Arr[4].trim().toLowerCase();
                         
                         X.insert(Arr[0], Arr[2], Arr[3], Arr[4], Arr[1]);

                            /*  System.out.println("English Word: "+Arr[0]);
                              System.out.println("Type: "+Arr[1]);
                             System.out.println("French Word: "+Arr[2]);
                              System.out.println("English Meaning: "+Arr[3]);
                             System.out.println("French Meaning: "+Arr[4]);*/
                          
                             // System.out.println("\n\n");
                              
                              counter++;
                              
                          }
                        
		}
		//Close the input stream
		in.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}  
 
        
        System.out.println("Count: "+counter);
        
       // System.out.println(X);
        return X;
        
        
    }
    
    
    public static void PrintArrayElemnts(String[] arr){
        
        for(int i=0; i<arr.length; i++){
            
            System.out.print("");
            
            
        }
    }
    
    
    
    
}
