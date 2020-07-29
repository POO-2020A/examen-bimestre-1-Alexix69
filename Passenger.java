/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael
 */
public class Passenger {
    private String name;
    private String lastname;
    
    public Passenger(String name, String lastName){
        this.name = name;
        this.lastname = lastName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastname(){
        return this.lastname;
    }
    
    public void setName(String namePassenger){
        this.name = namePassenger;
    }
    
    public void setLastname(String lastnamePassenger){
        this.lastname = lastnamePassenger;
    }
    
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Passenger)) {
            return false;
        }
        
        Passenger comparedPass = (Passenger) compared;
        if (this.name.equals(comparedPass.name)
                &&this.lastname.equals(comparedPass.lastname)) {
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.name + " " + this.lastname;
    }
}
