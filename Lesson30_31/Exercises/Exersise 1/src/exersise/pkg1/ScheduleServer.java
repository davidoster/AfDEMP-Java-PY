/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exersise.pkg1;

/**
 *
 * @author Spyros
 */
public class ScheduleServer {

    //Starting up
    public void startBooting() {
        System.out.println("Start booting.....");
    }

    public void readSystemConfigFile() {
        System.out.println("Reading config.....");
    }

    public void init() {
        System.out.println("init .....");
    }

    public void initializeContext() {
        System.out.println("Initializing context.....");
    }

    public void initializeListeners() {
        System.out.println("Initializing listeners.....");
    }

    public void createSystemObjects() {
        System.out.println("Creating objects.....");
    }
//Shuting down

    public void releaseProcesses() {

        System.out.println("Realizing proc.....");
    }

    public void destroy() {
        System.out.println("Destroying .....");
    }

    public void destroySystemObjects() {
        System.out.println("Destroy SO.....");
    }

    public void destroyListeners() {
        System.out.println("Destroy listeners.....");
    }

    public void destoryContext() {
        System.out.println("Destroy context.....");
    }

    public void shutdown() {
        System.out.println("Ending life.....");
    }

}
