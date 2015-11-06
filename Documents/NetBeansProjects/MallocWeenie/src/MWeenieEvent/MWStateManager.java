/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MWeenieEvent;

import MWeenieGUI.MWGUI;

/**
 *
 * @author Phyllis Peng
 */
public class MWStateManager {

    public enum MWState{
        PROGRAM_NOT_STARTED, PROGRAM_IN_PROGRESS, PROGRAM_END,
    }
    
    private MWGUI ui;
    
    public MWStateManager(MWGUI initUI){
        ui = initUI;
        
        
    }
    
    
    
}
