/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZKY
 */
public class Rizkysyahputra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int a = 80; 
        int b = 24;
        //Bitwise AND//
        
        int hasilbitwiseAND  = a & b;
         System.out.println("Hasil a & b = " + hasilbitwiseAND );

      //Bitwise OR//
      
      int hasilbitwiseOR  = a | b;
        System.out.println("Hasil a | b = " + hasilbitwiseOR );
        
      //Bitwise XOR//
      
      int hasilbitwiseXOR  = a ^ b;
        System.out.println("Hasil a ^ b = " + hasilbitwiseOR );
      
        //Bitwise NOT//
      
      int hasilbitwiseNOT  = ~a;
        System.out.println("Hasil ~a = " + hasilbitwiseNOT );
        
    }
    
}
