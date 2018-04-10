/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddesignpatternex;

import Interface.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yolly
 */
public class CommandDemo {
    
    public static List personsRequest(){
       List<Command> queue = new ArrayList<>();
        queue.add(new Teacher());
        queue.add(new  Student());
        queue.add(new Cleaner());
        return queue; 
    }
    
     public static void workOffRequests(List queue) {
         queue.forEach((command) -> {
             ((Command)command).excecute();
        });
    }
}
