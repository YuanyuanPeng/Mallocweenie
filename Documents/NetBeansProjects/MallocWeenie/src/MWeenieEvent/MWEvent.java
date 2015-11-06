/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MWeenieEvent;

import MWeenieGUI.MWGUI;
import MWeenieEvent.MWStateManager;
import javafx.stage.Stage;


/**
 *
 * @author Phyllis Peng
 */
public class MWEvent {
    private MWGUI ui;
    
    public MWEvent (MWGUI  initUI){
        
        ui=initUI;
        
    }
    
    public void respondToStart(){
    
    }
    
    public void respondToSwitchScreenRequest(MWGUI.MWGUIState uiState){
    
        ui.changeWorkspace(uiState);
    
    }
    public void respondToExitRequest(Stage primaryStage){
    System.exit(0);
    }
}
