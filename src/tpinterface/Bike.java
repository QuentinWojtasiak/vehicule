/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpinterface;

/**
 *
 * @author diginamic09
 */
public class Bike extends AbstractVehicule{
    
    private Type type;
    
    public Bike(Position pos, float speed,float nord, float sud, float ouest, float est,Type type)
    {
        super(pos,speed,nord,sud,ouest,est);
        this.type=type;
    }
    
    public void move()
    {
    }
    
}

