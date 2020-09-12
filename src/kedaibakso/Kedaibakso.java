/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kedaibakso;

import static java.awt.SystemColor.menu;

/**
 *
 * @author win10
 */
public class Kedaibakso {
    public static void main(String[] args) {
       menu data = new menu();
        
        //Memasukan Data pada Variable
        data.setmenu("Bakso Jontor");
        data.setharga(25000.0);
        data.setSpesial(true);
        
        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Menu: "+data.getmenu());
        System.out.println("Harga tiket: Rp."+data.getHarga());
        System.out.println("menu spesial: "+data.getSpesial());
    }
    
}
