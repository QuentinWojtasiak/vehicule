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
public interface Vehicule {
    
    public Position getPosition();
    
    public void setDirection(float nord, float sud, float ouest, float est);
    
    public void setSpeed(float speed);
    
}
