/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kedaibakso;
/**
 *
 * @author win10
 */
public class menu {
     private String menu;
    private double harga;
    private boolean spesial;
    
    //Method Setter (Public) dengan Parameter
    public void setmenu(String menu){
        this.menu = menu;
    }
    public void setharga(double harga){
        this.harga = harga;
    }
    public void setSpesial(boolean spesial){
        this.spesial = spesial;
    }
    
    //Method Getter (Public)
    public String gettempatduduk(){
        return menu;
    }
    public double getHarga(){
        return harga;
    }
    public boolean getSpesial(){
        return spesial;
    }

    String getmenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
