/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Spyros
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InternationalDivision id = new InternationalDivision("Germany", "DE", "Mhtsos", 45445);

        DomesticDivision dd = new DomesticDivision("Attiki", "Mpamphs", 44532);

        id.display();
        dd.display();
    }

}
