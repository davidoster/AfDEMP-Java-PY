/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Spyros
 */
public class BufferImpl {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void readBuffer() throws IOException {
        System.out.println("Buffer enter an integer");
        System.out.println(br.readLine());
    }

}
