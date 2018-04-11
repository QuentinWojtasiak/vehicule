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
public abstract class AbstractVehicule implements Vehicule{
    
    private Position pos;
    private float nord, sud ,est ,ouest,speed;
    private String couleur,marque,modele;
    
    public AbstractVehicule(Position pos, float speed,float nord, float sud, float ouest, float est)
    {
        this.setSpeed(speed);
        this.setDirection(nord, sud, ouest, est);
        
    }
    
    @Override
    public Position getPosition(){
        return this.pos;
    }
    
    @Override
    public void setDirection(float nord, float sud, float ouest, float est){
        this.nord=nord;
        this.ouest=ouest;
        this.est=est;
        this.sud=sud;
    }
    
    @Override
    public void setSpeed(float speed){
        this.speed=speed;
    }
    
}
