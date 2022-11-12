/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photontomasamaris;

/**
 *
 * @author Amaris Laelle
 */
public class FireType extends SimpleMonster{
    public FireType(String n, double m, double b)
    {
        super(n,"fire","grass","water", m, b);
        atk = 1.3 * b;
        def = 0.7 * b;
    }
    
    public void special()
    {
        atk += 2;
        hp = hp - (0.10 * maxHP);
    }
}
