package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    TextField txtNum1, txtNum2;
    Button btnAdd, btnSub, btnDiv, btnMult, btnEquals, btnClear;
    Label ansLabel;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        txtNum1 = new TextField();
        txtNum2 = new TextField();
        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnDiv = new Button("/");
        btnMult = new Button("*");
        btnClear = new Button("Clear");
        btnEquals = new Button("=");
        ansLabel = new Label("?");
        ansLabel.setAlignment(Pos.CENTER);
        ansLabel.setStyle("-fx-border-color: #000, -fx-padding: 5px;");
	    
	    GridPane root = new GridPane();
	    root.setAlignment(Pos.CENTER);
	    root.setHgap(10);
	    root.setVgap(10);
	    root.add(btnAdd, 0, 0);
	    root.add(btnSub, 1, 0);
	    root.add(btnDiv, 0, 1);
	    root.add(btnMult, 1, 0);
	    root.add(btnClear, 0, 2);
//	    root.add(btnClear, 0, 2);
	    root.add(txtNum1, 0, 3);
	    root.add(txtNum2, 1, 3);
//	    root.add(btnAdd, 2, 0)0;
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
