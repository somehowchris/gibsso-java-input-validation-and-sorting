/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01_weickhardtchristof;

import java.util.Scanner;

/**
 *
 * @author christoftobias.weick
 */
public class Weickhardt_Christof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       print("************* Aufgabe 1 ****************");
       print("");
       print("Geben Sie die Anzahl zu srotierende Einträge ein:");
       int anzahl = scannforInt(16,1);
       print("Es müssen "+ anzahl+" Zahlen eingegeben werden.");
       int[] ints = new int[anzahl];
       for(int i = 0;i < anzahl; i++){
           print("Zahl "+(i+1)+": ");
           ints[i] = scannforInt();
       }
       int[] sortedints = sort(ints);
       print("Sortierte Zahlen Grösste voran:");
       for(int i = 0; i < sortedints.length;i++){
           print("Zahl "+(sortedints.length-i)+" = "+sortedints[i]);
       }
       print("");
       print("");
       print("************ Aufgabe 2 ****************");
       print("");
       print("");
       print("Bitte geben Sie die Personen ein:");
       String[] personen = new String[anzahl];
       for(int i = 0;i<anzahl;i++){
           print("Person "+(i+1)+" :");
           personen[i] = new Scanner(System.in).next();
       }
       for(int i = 0; i<personen.length;i++){
            print("Person: "+(i+1)+" = "+personen[i]);
       }
       print("");
       print("");
       print("************ Aufgabe 3 ****************");
       print("");
       print("");
       print("Ausgabe Personen:");
       for(int i = 0;i<anzahl;i++){
           print("Person "+(i+1)+" : "+personen[i]+" hat die "+(i+1)+". eingebene Zahl "+ints[i]);
       }
       
    }
    public static void print(String output){
        System.out.println(output);
    }
    public static int scannforInt(int max,int min){
        int input = 0;
        boolean found = false;
        while(!found){
            String tempinput = new Scanner(System.in).next();
            try{
                input = new Integer(tempinput);
                if(input >= min&&input <= max){
                    found = true;
                }else{
                    print("Fehlerhafte Eingabe. Nochmals eingeben:");
                }
            }catch(Exception e){
                print(tempinput + " ist keine Zahl");
                print("Fehlerhafte Eingabe. Nochmals eingeben:");
            }
        }
        return input;
    }
    public static int scannforInt(){
        boolean found = false;
        int input = 0;
        while(!found){
            String tempinput = new Scanner(System.in).next();
            try{
                input = new Integer(tempinput);
                found = true;
            }catch(Exception e){
                print(tempinput + " ist keine Zahl");
                print("Fehlerhafte Eingabe. Nochmals eingeben:");
            }
        }
        return input;
    }
    public static int[] sort(int[] array){
        int[] arraytosort = array.clone();
        boolean found = false;
        while(!found){
            found = true;
            for(int i = 0;i < arraytosort.length;i++){
                if(i+1 < arraytosort.length){
                    if(arraytosort[i]<arraytosort[i+1]){
                        int one = arraytosort[i];
                        arraytosort[i] = arraytosort[i+1];
                        arraytosort[i+1] = one;
                        found = false;
                    }
                }
            }
        }
        return arraytosort;
    }
}
