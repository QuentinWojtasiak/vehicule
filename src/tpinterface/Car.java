/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpinterface;

public class Car extends AbstractVehicule{
    
    private int volEss, puissance,co2;
    
    public Car(Position pos, float speed,float nord, float sud, float ouest, float est,int volEss,int puiss, int co2){
        super(pos,speed,nord,sud,ouest,est);
        this.volEss=volEss;
        this.puissance=puiss;
        this.co2=co2;
    }
    
}
