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
public class Hospital {

    private String name;
    private String address;
    private Bed[] beds;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.beds = new Bed[100];
        for (int i = 0; i < 100; i++) {
            this.beds[i] = new Bed();
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void enterOkay(int number, Patient aPatient) { // enter a specific location
        if (this.beds[number].isBusy()) {
            System.out.println(" No place available");
        } else {
            this.beds[number].occupyBed(aPatient);
        }

    }

    public void enterOkay(Patient aPatient) {  //enter in the first available place
        int i = 0;
        if (this.beds[i].getTotal() < 100) {
            while (this.beds[i].isBusy()) {
                i++;
            }
            this.beds[i].occupyBed(aPatient);
            System.out.println("The patient was admitted correctly");

        }else{
            System.out.println(" No place available");
    }
  }
    public void freeBed(int NID) {
        int i = 0;
        boolean ok = false;
        while (i < 100 & !ok) {
            if (this.beds[i].isBusy()) {
                if (this.beds[i].getData().getNID() == NID) {
                    this.beds[i].emptyBed(this.beds[i].getData());
                    System.out.println("The bed was released correctly");
                    ok=true;
                }else{
                    i++;
                }
                }else{
                    i++;
            }
        }

    }

    public void exchangePatient(int x, int y) { //change bed patient. The bed is available
        this.beds[y].occupyBed(this.beds[x].getData());
        this.beds[x].emptyBed(this.beds[x].getData());
        System.out.println("The modification was made successfully");

    }
    
    public int freeBeds(){ 
        int variable =0;
        for (int i=0; i<100; i++){
            if ( !this.beds[i].isBusy()){
                variable++;
                
            }
        }
        return variable;
    }
    
    public String toString(){ 
        String aux="";
        for (int i=0; i<100; i++){ 
            if ( this.beds[i].isBusy()){ 
                aux = aux  + this.beds[i].getData().toString() +"\n" ;
                     }
             }
        return aux;

}
}
    
