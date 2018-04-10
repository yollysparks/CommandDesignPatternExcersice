/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddesignpatternex;

import Interface.Command;

/**
 *
 * @author yolly
 */
public class Student implements Command {

    @Override
    public void excecute() {
        System.out.println("I am a student my main aim is to learn.......");
    }
    
}
