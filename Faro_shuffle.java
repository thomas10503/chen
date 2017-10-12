/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faro_shuffle;

import java.util.Arrays;

/**
 *
 * @author thoma
 */
public class Faro_shuffle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int deck[],odd[],even[];
        deck = new int[52];
        int counter=0;
        
        for(int i =0; i<52; i++){
            deck[i]=(int)i+1;  
            
        }
        print(deck);
       
       
        
        while(true){
            shuffle(deck);
            counter ++;
            if(deck[1]==2){
                break;
            }
        }
        
        System.out.println(counter);
        
    }
    
    
    
    static void print(int deck[]){
        
       // for(int i=0; i<deck.length;i++){
       // System.out.println(deck[i]);
       // }
        System.out.println(Arrays.toString(deck));
       // System.out.println("print done");
        
    }
    
    static void shuffle(int deck[]){
        int one[];
        int two[];
        one = new int[26];
        two = new int[26];
        
        for(int i =0; i<deck.length; i++){
            if(i<26){
               one[i]=deck[i];
            }else{
                two[i-26] = deck[i];
            }
            
        }
        
        
        
        for(int i =0; i<two.length; i++){
         deck[i*2]=one[i];        
       }
        
       for(int i =0; i<one.length; i++){
         deck[(i*2)+1]=two[i];        
       }

        //print(odd);
        //print(even);   
       print(deck);   
        
         
        
        
    }
    
}
