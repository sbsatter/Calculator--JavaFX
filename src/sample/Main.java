package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
	    root.add(btnMult, 1, 1);
	    root.add(txtNum1, 0, 2);
	    root.add(txtNum2, 1, 2);
	    root.add(ansLabel, 0, 3, 2, 1);
	    root.add(btnClear, 0, 4, 2, 1);
	    
	    setWidths();
	    attachCode();
	
	    Scene scene = new Scene(root, 300, 250);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Calculator");
	    primaryStage.show();
//	    root.add(btnAdd, 2, 0)0;
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }
	
	private void attachCode() {
		btnAdd.setOnAction(e -> btnCode(e));
		btnSub.setOnAction(e -> btnCode(e));
		btnDiv.setOnAction(e -> btnCode(e));
		btnMult.setOnAction(e -> btnCode(e));
//		btnEquals.setOnAction(e -> btnCode(e));
		txtNum1.setOnAction(e -> btnCode(e));
		txtNum2.setOnAction(e -> btnCode(e));
		btnClear.setOnAction(e -> btnCode(e));
	}
	
	private void btnCode(ActionEvent e) {
		int num1, num2, answer;
		char symbol;
		
		if (e.getSource() == btnClear) {
			txtNum1.setText("");
			txtNum2.setText("");
			ansLabel.setText("?");
			txtNum1.requestFocus();
			return;
		}
		num1 = Integer.parseInt(txtNum1.getText());
		num2 = Integer.parseInt(txtNum2.getText());
		
		if (e.getSource() == btnAdd) {
			symbol = '+';
			answer = num1 + num2;
		} else if (e.getSource() == btnSub) {
			symbol = '-';
			answer = num1 - num2;
		} else if (e.getSource() == btnDiv) {
			symbol = '/';
			answer = num1 / num2;
		} else {
			symbol = '*';
			answer = num1 * num2;
		}
		
		ansLabel.setText(num1 + " " + symbol + " " +num2 + " = " + answer);
	}
	
	private void setWidths() {
		btnAdd.setPrefWidth(70);
		btnSub.setPrefWidth(70);
		btnDiv.setPrefWidth(70);
		btnMult.setPrefWidth(70);
//		btnEquals.setPrefWidth(70);
		txtNum1.setPrefWidth(70);
		txtNum2.setPrefWidth(70);
		btnClear.setPrefWidth(150);
		ansLabel.setPrefWidth(150);
	}
	
	
	public static void main(String[] args) {
        launch(args);
    }
}
