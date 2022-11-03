/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot_2101092021_modul7;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan1 {
    @SuppressWarnings("empty-statement")
    public static void main( String[] args ){ 
        System.out.println("-->While<--");
        int[] ages = new int[100]; 
        String days[] = {"Monday ", "Tuesday ", "Wednesday ", "Trhursday ", "Friday ", "Saturday ", "Sunday"};
        int i=0;
        while( i< days.length){ 
        System.out.println( days[i] ); 
        i++ ;
        }
        
        System.out.println("-->For<--");
        for( i=0;i< days.length;i++){ 
            System.out.println( days[i] ); 
        } 
        
        System.out.println("-->Do While<--");
        i=0;
        do{ 
            System.out.println( days[i] ); 
            i++;
        }while(i< days.length );
    }
}
