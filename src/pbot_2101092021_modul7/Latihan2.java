/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot_2101092021_modul7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan2 {
    public static void main( String[] args ){
    //BufferedReader
        System.out.println("-->Program Menentukan Input Terbesar<--");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
        int[] ages = new int[10]; 
        int max = -999;
      
        try{
         
            for(int i=0; i<ages.length; i++ )
            { 
                System.out.print(" Masukkan angka"+(i+1)+"= " );
                ages[i]=Integer.parseInt(dataIn.readLine());
            }
            
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.print(" Nilai angka yang terbesar :" );
        for(int i=0; i<ages.length; i++ )
        { 
            if(ages[i]>max){
                max= ages[i];
            }
        }
        
        System.out.println(max);
       
    }
}
