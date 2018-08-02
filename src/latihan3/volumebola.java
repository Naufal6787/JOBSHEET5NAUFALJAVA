/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Naufal K D
 */
public class volumebola {
    public static void main(String[]args) {
        //deskripsi
        Double phi, r, luas,volumebola;
        r=10.5;
        phi=3.14;
        //proses
        luas= phi *r*r;
        volumebola=4/3*phi*r*r*r;
        //output
        System.out.print("Luas Lingkaran :");
        System.out.println(luas);
        System.out.print("Volume Bola :");
        System.out.println(volumebola);
    }
        
        
    }
