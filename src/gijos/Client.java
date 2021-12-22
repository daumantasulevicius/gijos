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
public class Client extends Thread {

    private final CubbyHole cubbyhole;
    private final int number;

    public Client(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    @Override
    public void run() {
//        System.out.println("Client #" + this.number
//                + " starting...");

//        System.out.println("Client #" + this.number
//                + " connecting");
        cubbyhole.connect(this.number);
        
        System.out.println("Client #" + this.number
                + " woken up and ended");

    }
}
