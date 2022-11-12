/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photontomasamaris;

/**
 *
 * @author Amaris Laelle
 */
public class GrassType extends SimpleMonster {
    
    public GrassType(String n, double m, double b)
    {
        super(n, "grass", "water", "fire", m, b);
        atk = 0.7 * b;
        def = 1.3 * b;
    }
    
    public void special()
    {
        hp = hp + (0.20 * getMaxHP());
    }
    
    public void rest()
    {
        hp = hp + (0.5 * maxHP);
    }
    
}
