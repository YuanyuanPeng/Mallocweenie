/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mallocweenie;

import properties_manager.PropertiesManager;
import MWeenieGUI.MWGUI;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;

/**
 *
 * @author Phyllis Peng
 */
public class MallocWeenie extends Application {
    

    /**
     * @param args the command line arguments
     */
    static String PROPERTY_TYPES_LIST = "property_types.txt";
    static String UI_PROPERTIES_FILE_NAME = "properties.xml";
    static String PROPERTIES_SCHEMA_FILE_NAME = "properties_schema.xsd";
    static String DATA_PATH="./data";
    
    


    @Override
    public void start(Stage stage)  {
        try{
            PropertiesManager props = PropertiesManager.getPropertiesManager();
            props.addProperty(MallocWeeniePropertyType. UI_PROPERTIES_FILE_NAME, UI_PROPERTIES_FILE_NAME);
            props.addProperty(MallocWeeniePropertyType. PROPERTIES_SCHEMA_FILE_NAME,PROPERTIES_SCHEMA_FILE_NAME);
            props.addProperty(MallocWeeniePropertyType. DATA_PATH.toString(), DATA_PATH);
            props.loadProperties(UI_PROPERTIES_FILE_NAME, PROPERTIES_SCHEMA_FILE_NAME);
            
            
        }catch (Exception e){
        e.printStackTrace();
        }
        
    }
        
      public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
      
    
    public enum MallocWeeniePropertyType{
    UI_PROPERTIES_FILE_NAME,  PROPERTIES_SCHEMA_FILE_NAME,
    DATA_PATH, IMG_PATH,
    WINDOW_WIDTH, WINDOW_HEIGHT,
    
    SPLASH_SCREEN_IMAGE_NAME,
    
    
    }
    
}
