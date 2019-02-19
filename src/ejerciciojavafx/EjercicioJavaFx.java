/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojavafx;

/**
 *
 * @author Estudiante
 */

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
public class EjercicioJavaFx extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        Button btOK = new Button("Hello");
//        Scene scene = new Scene(btOK, 400, 400);
//        primaryStage.setTitle("MyJavaFX");
//        primaryStage.setScene(scene);
//        primaryStage.show(); 
//    }
    @Override
    public void start (Stage primaryStage) throws Exception{
        primaryStage.setTitle("HBox");
        // creacion de botones para el vbox
        Button button1= new Button("Numero 1");
        Button button2 = new Button("Numero 2");
        
        // creacion de label para agregar imagen
        Label label1 = new Label();
        Label label2 = new Label("Search");
        FileInputStream input = new FileInputStream("icon.png");
        Image image = new Image(input) {};
        Label label3 = new Label("Ubication",new ImageView(image));
        
        //creacion de tabla 
        TableView table = new TableView();
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn("Nombres");
        TableColumn lastNameCol = new TableColumn("Apellidos");
        TableColumn emailCol = new TableColumn("Email");
        table.getColumns().addAll(firstNameCol, lastNameCol,emailCol);
        
        //se mete el label al scene
        HBox hbox=new HBox(button1,button2);
        hbox.getChildren().add(label3);
        hbox.getChildren().add(table);
        

        Scene scene=new Scene(hbox,900,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
        
    }
    
        public static void main(String[] args) {
        Application.launch(args);
}
}   

