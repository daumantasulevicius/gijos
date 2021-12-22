/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gijos;

import static java.lang.Thread.sleep;

/**
 *
 * @author Daumantas
 */
public class CubbyHole {

    private int count;
    private int number = 0;
    private int contents;
    private int temp;
//    private boolean used = true;
    private boolean first = true;

    public CubbyHole(int count){
        this.count = count;
    }

    
    public synchronized void connect(int value) {
        temp = contents;    //Paimamas pries tai laukiancios gijos pavadinimas (numeris)
        contents = value;   //Įdedamas prisijungiancios gijos pavadinimas (numeris)
        number++;           //Padidinamas giju, kurios buvo prisijungusios, skaicius
        System.out.println("Client #" + value + " connected");

        if (!first) {       //Patikra ar ne pirma gija (kadangi pirma neturi ko prikelti)
            notify();       //Prikeliama pries tai laukianti gija
            System.out.println("Client #" + value + " waking up Client #" + temp);
        }
        else{
            first = false;      //Nustatoma, kad pirma gija jau buvo
            System.out.println("Client #" + value + " is first - not waking up other");
        }
            
        if (number != count) {  //Tikrinama ar ne paskutine gija
            System.out.println("Client #" + value + " waiting");
            try {
                wait();         //Jei gija ne paskutine - užmiega
            } catch (InterruptedException e) {
            }
        }
        else{                   //Jei gija paskutine - nemiega
            System.out.println("Client #" + value + " is last - not waiting");
        }
    }
}
