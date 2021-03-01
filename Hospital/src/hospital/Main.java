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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hospital h= new Hospital("San martin", "calle1");
        
        Patient p= new Patient("Juan", 33333, "Osde");
        Patient p2= new Patient("Pedro", 34333, "IOMA");
        Patient p3= new Patient("Pilar", 35333, "OSPE");
        Patient p4= new Patient("Laura", 39333, "Osde");
        Patient p5= new Patient("Luciana",31333, "Osde");
        Patient p6= new Patient("Edgardo", 32333, "IOMA");
        Patient p7= new Patient("Manuel", 43333, "IOMA");
        
        h.enterOkay(2, p);
        h.enterOkay(4, p2);
        h.enterOkay(5, p3);
        h.enterOkay(7, p4);
        h.enterOkay(16,p5);
        
        h.enterOkay(p6);
        h.enterOkay(p7);
        h.exchangePatient(4, 15);
        System.out.println("*******************************");
        System.out.println("The beds available are"+ h.freeBeds());
        h.freeBed(43333);
        System.out.println("*******************************");
        System.out.println("The beds available are"+ h.freeBeds());
        System.out.println("*******************************");
        System.out.println(h.toString());
        

        
    }
    
}
