/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06photontomasamaris;

/**
 *
 * @author Amaris Laelle
 */
public class Exercise06photontomasamaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireType Rena = new FireType("GabLab", 50, 15); //monsters of each type
        GrassType Naya = new GrassType("GunDong", 70,20);
        WaterType Lena = new WaterType("Gumu-Guho", 60,5);
        
        while(Rena.getHP() != 0 && Naya.getHP() != 0)
        {
            Rena.attack(Naya);            
        }
        
        while(Rena.getHP() != 0 && Lena.getHP() != 0)
        {
            Rena.attack(Lena);
        }
        
        while(Naya.getHP() != 0 && Lena.getHP() != 0)
        {
            Naya.attack(Lena);
        }
    }
    
}
