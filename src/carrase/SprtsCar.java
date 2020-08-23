/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrase;

/**
 *
 * @author vyrishkis
 */
public class SprtsCar extends Mashina {
    public boolean spoiler;
    
    public SprtsCar(String a, int b, int c, int d){
        super.name = a;
        super.spead = b;
        super.distance =c;
        super.maxSpead = d;
        this.spoiler = Math.random() < 0.50;
    }
    
    @Override
        public void Gazuok() {
            if (this.spoiler == true){
                super.Gazuok();
                super.Gazuok();
            } else super.Gazuok();
    }
        
    @Override
        public void Stabdyk() {
            if (this.spoiler == true){
                super.Stabdyk();
                super.Stabdyk();
            } else super.Stabdyk();
    }
    

    public String toSString() {
        return "SprtsCar{" + "spoiler=" + spoiler + '}';
        
    }
    
    
}
