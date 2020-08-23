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
public class Mashina {

    public String name;
    public int spead;
    public int distance;
    public int maxSpead;

    public Mashina(String a, int b, int c, int d) {

        this.name = a;
        this.spead = b;
        this.distance = c;
        this.maxSpead = d;
    }

    public Mashina() {

    }

    public void Gazuok() {

        if (this.maxSpead - this.spead > 5) {
            var a = Math.random();
            if (a <= 0.20) {
                this.spead += 1;
            } else if (a > 0.20 && a <= 0.40) {
                this.spead += 2;
            } else if (a > 0.40 && a <= 0.60) {
                this.spead += 3;
            } else if (a > 0.60 && a <= 0.80) {
                this.spead += 4;
            } else {
                this.spead += 5;
            }
            if (this.distance + this.spead <= 1000)
            this.distance += this.spead;
            else this.distance += 1000 - this.distance;
            
            
            }

        }
    

    public void Stabdyk() {
        var a = Math.random();
        if (this.spead > 1) {
            if (a <= 0.33) {
                this.spead -= 1;
            } else if (a > 0.33 && a <= 0.66) {
                this.spead -= 3;
            } else {
                this.spead -= 5;
            }
            
        }
    }

    public void Vaziuok() {
        this.distance += this.spead;
    }

    @Override
    public String toString() {
        return "Mashina{" + "name=" + name + ", spead=" + spead + ", distance=" + distance + ", maxSpead=" + maxSpead + '}';
    }

    /**
     *
     */
//    public void drive(){
//    if(Math.random() < 0.50){
//        this.spead += 5;
//}
}
