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
public class CarRase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Mashina volvo = new Mashina("volvo",0,0,200);
        Mashina audi = new Mashina("audi",0,0,190);
        Mashina vw = new Mashina("vw",0,0,160);
        Mashina shkoda = new Mashina("shkoda",0,0,170);
        Mashina zapas = new Mashina("zapas",0,0,90);
        Mashina mini = new Mashina("mini",0,0,100);




        
        SprtsCar ferrari = new SprtsCar ("ferrari",0,0,300);
        SprtsCar porshas = new SprtsCar ("porshas",0,0,280);

        
        
        
        System.out.println(volvo.maxSpead + volvo.name);
        System.out.println(ferrari.name + " spoiler-" + ferrari.spoiler);
        System.out.println(zapas.name);
        System.out.println(mini.name);
        volvo.name = "volvo xc";
        System.out.println(porshas.toSString() + porshas.toString());
        porshas.Gazuok();
        System.out.println(porshas.toSString() + porshas.toString());
        volvo.Gazuok();
        System.out.println(volvo.toString());

    }
    
    
    
    
}
