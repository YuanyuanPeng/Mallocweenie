/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MWeenieGUI;

import mallocweenie.MallocWeenie;
import MWeenieEvent.MWEvent;
import MWeenieEvent.MWStateManager;

import mallocweenie.MallocWeenie.MallocWeeniePropertyType;
import properties_manager.PropertiesManager;

import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.*;

/**
 *
 * @author Phyllis Peng
 */
public class MWGUI {
    /*
     main pane 
     */

    private Stage primaryStage;
    private BorderPane mainPane;
    private BorderPane hmPane;

    private Button StartButton;
    private RadioButton playoption;
    private RadioButton uploadFile;

    private Insets marginlessInsets;
    private String ImgPath = "file:img/";
    
    private VBox OptionBox;
    private MWEvent mwevent;
    private MWStateManager mwsm;
    
    public enum MWGUIState {

        SPLASH_SCEEN_STATE, START_PROGRAM_STATE, TEST_PROGRAM_STATE, UPLOAD_FILE_STATE,
        RESULT_STATE,
    }

    public MWGUI() {
        mwsm =  new MWStateManager(this);
        mwevent= new MWEvent(this);
        initMainPane();
        initSplashScreen();

    }

    private void initMainPane() {
        marginlessInsets = new Insets(5, 5, 5, 5);
        mainPane = new BorderPane();
        PropertiesManager props = PropertiesManager.getPropertiesManager();
        int paneWidth = Integer.parseInt(props.getProperty(MallocWeeniePropertyType.WINDOW_WIDTH));
        int paneHeight = Integer.parseInt(props.getProperty(MallocWeeniePropertyType.WINDOW_HEIGHT));
        mainPane.resize(paneWidth, paneHeight);
        mainPane.setPadding(marginlessInsets);
    }
    /*
     Pane to init the pointer names, basic address, and sbrk value
     */

    private void initSplashScreen() {
        PropertiesManager props = PropertiesManager.getPropertiesManager();
        String splashScreenImagePath = props.getProperty(MallocWeeniePropertyType.SPLASH_SCREEN_IMAGE_NAME);

        StackPane splashScreenPane = new StackPane();
        splashScreenPane.setPrefSize(827, 622);
        
        Image splashScreenImage = loadImage(splashScreenImagePath);
        ImageView  splashScreenImageView = new ImageView(splashScreenImage);
        
        Label spalshScreenImageLabel = new Label();
        spalshScreenImageLabel.setGraphic(splashScreenImageView);
        spalshScreenImageLabel.setLayoutX(-45);
        
        splashScreenPane.getChildren().add(spalshScreenImageLabel );
        StackPane.setAlignment(spalshScreenImageLabel , Pos.CENTER);
        
        initOptionToolBox();
        mainPane.setCenter(splashScreenPane);
        mainPane.setBottom(OptionBox);

    }
    private void initOptionToolBox(){
    
    }
    private void initPlayPane() {

    }
    /*
     Pane can test out test case
     */

    private void initTestPane() {
    }

    /*
     Pane handle uplaod file from the user
     */
    private void initUploadFilePane() {

    }

    /*
     Result from the uploaded file
     */
    private void initResultPane() {

    }

    public Image loadImage(String imageName) {
        Image img;
        img = new Image(ImgPath + imageName);
        return img;
    }

    public void changeWorkspace(MWGUIState uiState) {
        switch (uiState) {
            case SPLASH_SCEEN_STATE:
                mainPane.getChildren().clear();
                initSplashScreen();
                break;

            case START_PROGRAM_STATE:
                mainPane.getChildren().clear();
                initPlayPane();
                break;

            case UPLOAD_FILE_STATE:
                mainPane.getChildren().clear();
                initUploadFilePane();
                break;

            case TEST_PROGRAM_STATE:
                mainPane.getChildren().clear();
                initTestPane();
                break;
                
            case RESULT_STATE:
                mainPane.getChildren().clear();
                initResultPane();
                break;

            default:
        }
    }

}
