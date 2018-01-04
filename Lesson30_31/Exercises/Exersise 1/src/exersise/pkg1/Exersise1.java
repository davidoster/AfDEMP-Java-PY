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
public class Exersise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();
        facadeServer.stopServer();
    }

}
