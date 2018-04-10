/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddesignpatternex;

import static commanddesignpatternex.CommandDemo.workOffRequests;
import static commanddesignpatternex.CommandDemo.personsRequest;
import java.util.List;

/**
 *
 * @author yolly
 */
public class CommandDesignPatternEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List queue = personsRequest();
        workOffRequests(queue);
    
    }
    
}
