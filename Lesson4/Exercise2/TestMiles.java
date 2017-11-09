/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Spyros
 */
public class TestMiles {

    /* We declare the variables that holds the numberof miles and killometers in a nautical mile
    The variables are final and static. 
    final because i dont want them to be changed and
    static so that each instance of TestMiles class shares the same values*/
    private static final double KM_IN_NM = 1.852;
    private static final double M_IN_NM = 1.150779;

    private int radious;

    private int nm = 23;

    public String nmToMiles() {
        return ("The number of miles in " + nm + " nautical miles are " + nm * M_IN_NM);
    }

    public String nmToKm() {
        return ("The number of killometers in " + nm + " nautical miles are " + nm * KM_IN_NM);
    }

    //We only have gettes for this variables. We dont want anyone to chage their values
    public static double getKM_IN_NM() {
        return KM_IN_NM;
    }

    public static double getM_IN_NM() {
        return M_IN_NM;
    }

    public int getNm() {
        return nm;
    }

    public void setNm(int nm) {
        this.nm = nm;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

}
