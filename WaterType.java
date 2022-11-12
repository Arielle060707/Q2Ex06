/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photontomasamaris;

/**
 *
 * @author Amaris Laelle
 */
public class WaterType extends SimpleMonster {
    public WaterType(String n, double m, double b)
    {
        super(n, "water", "fire", "grass", m, b);
        atk = 0.7 * b;
        def = 1.3 * b;
    }
    
    public void special()
    {
        def += 2;
        hp = hp - (0.10 * maxHP);
    }
}
