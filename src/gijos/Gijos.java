/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gijos;

/**
 *
 * @author Daumantas
 */
public class Gijos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 10;
        
        CubbyHole c = new CubbyHole(count);
        
        for(int i = 1; i <= count; i++)
        {
            Client cl = new Client(c, i);
            cl.start();
            
        }
//        Client c1 = new Client (c, 1);
//        Client c2 = new Client (c, 2);
//        Client c3 = new Client (c, 3);
//        Client c4 = new Client (c, 4);
//        Client c5 = new Client (c, 5);
//        Client c6 = new Client (c, 6);
//        
//        c1.start();
//        c2.start();
//        c3.start();
//        c4.start();
//        c5.start();
//        c6.start();

    }
    
}






