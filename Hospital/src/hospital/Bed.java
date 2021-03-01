/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author User
 */
public class Bed {
    private int number;
    private Patient data;
    private boolean busy;
    private int total;

    public Bed() {          
        this.busy=false;
        this.data=null;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public int getNumber() {
        return number;
    }

    public boolean isBusy() {
        return busy;
    }

    public int getTotal() {
        return total;
    }

    public Patient getData() {
        return data;
    }
    
    
    public void occupyBed(Patient aPatient){
        this.busy=true;
        this.total++;
        this.data= aPatient;
        
    }
    public void emptyBed (Patient aPatient){
        this.busy=false;
        this.total--;
        this.data= null; 
    }
    
    
    
    
    
    
    
}
