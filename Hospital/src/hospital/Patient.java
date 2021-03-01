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
public class Patient {
    private String name;
    private int NID;
    private String socialWork;

    public Patient(String name, int NID, String socialWork) {
        this.name = name;
        this.NID = NID;
        this.socialWork = socialWork;
    }

    public String getName() {
        return name;
    }

    public int getNID() {
        return NID;
    }

    public String getSocialWork() {
        return socialWork;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public void setSocialWork(String socialWork) {
        this.socialWork = socialWork;
    }
    
    public String toString(){
        return this.name + this.NID + this.socialWork;
    }
    
}
