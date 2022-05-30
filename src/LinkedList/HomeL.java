package LinkedList;

import HOME.Home;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeL extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		LinkedList list=new LinkedList();
		
		Label label = new Label("Linked List");
		Image img = new Image("file:Image/linkedlist.png");
	        ImageView view = new ImageView(img);
	        view.setFitHeight(60);
	        Font font = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
 	      label.setFont(font);
 	      label.setTextFill(Color.WHITE);
 	      view.setPreserveRatio(true);
	        label.setGraphic(view);
	        label.setTranslateX(280);
	        label.setTranslateY(15);
		
		TextField nametxt = new TextField();
		nametxt.setPrefHeight(40);
		nametxt.setTranslateX(15);
		nametxt.setTranslateY(80);
		nametxt.setPromptText("Name");
		nametxt.getStylesheets().add("file:Css/stylesheet.css");
		
		TextField cnictxt = new TextField();
		cnictxt.setPrefHeight(40);
		cnictxt.setTranslateX(15);
		cnictxt.setTranslateY(140);
		cnictxt.setPromptText("Enter CNIC without (-)");
		cnictxt.getStylesheets().add("file:Css/stylesheet.css");
		
		TextField agetxt = new TextField();
		agetxt.setPrefHeight(40);
		agetxt.setTranslateX(15);
		agetxt.setTranslateY(200);
		agetxt.setPromptText("Enter your Age");
		agetxt.getStylesheets().add("file:Css/stylesheet.css");
		
		TextArea status = new TextArea();
		status.setStyle("-fx-background-color: #000000; -fx-text-fill: black;");
		status.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 15));
		status.setLayoutX(200);
		status.setLayoutY(180);
		status.setPrefHeight(400);
		status.setPrefWidth(680);
		
		Button addf = new Button("Add First");
		addf.setPrefWidth(150);
		addf.setPrefHeight(50);
		addf.setTranslateX(15);
		addf.setTranslateY(260);
		addf.getStylesheets().add("file:Css/stylesheet.css");
		
		addf.setOnAction(e->{
			try {
				if(list.search(Integer.parseInt(cnictxt.getText()))==false) {
				list.addF(nametxt.getText(),Integer.parseInt(cnictxt.getText()),Double.parseDouble(agetxt.getText()));
				status.appendText("Name:"+nametxt.getText()+"\tCnic:"+cnictxt.getText()+"\tAge:"+agetxt.getText()+"\n");
				status.setStyle(" -fx-text-fill: black;");
				}
				else 
					status.appendText("\nyour enter same data\n");
				
			} catch (Exception e2) {
				status.appendText("Enter complete detail !)\n");
				status.setStyle(" -fx-text-fill: red;");
			}
			});
		
		
		
		Button addl = new Button("Add last");
		addl.setPrefWidth(150);
		addl.setPrefHeight(50);
		addl.setTranslateX(15);
		addl.setTranslateY(320);
		addl.getStylesheets().add("file:Css/stylesheet.css");
		
		addl.setOnAction(e->{
			try {
				if(list.search(Integer.parseInt(cnictxt.getText()))==false) {
				list.addlast(nametxt.getText(),Integer.parseInt(cnictxt.getText()),Double.parseDouble(agetxt.getText()));
				status.appendText("[add last]\tName:"+nametxt.getText()+"\tCnic:"+cnictxt.getText()+"\tAge:"+agetxt.getText()+"\n");
				}
				else 
					status.appendText("\nyour enter same data\n");
				
				
				} catch (Exception e2) {
				// TODO: handle exception
				status.appendText("Enter complete detail !)\n");
				status.setStyle(" -fx-text-fill: red;");
			}
			
		});
		
		
		Button removel = new Button("Remove last");
		removel.setPrefWidth(150);
		removel.setPrefHeight(50);
		removel.setTranslateX(15);
		removel.setTranslateY(380);
		removel.getStylesheets().add("file:Css/stylesheet.css");
		removel.setOnAction(e->{
			
			try {
				
				list.removelast();
				
				status.appendText("Removed last\n");	
			} catch (Exception e2) {
				// TODO: handle exception
				status.appendText("linkedlist is empty\n");
				status.setStyle(" -fx-text-fill: red;");
			}
		});
		
		
		Button removef = new Button("Remove first");
		removef.setPrefWidth(150);
		removef.setPrefHeight(50);
		removef.setTranslateX(15);
		removef.setTranslateY(440);
		removef.getStylesheets().add("file:Css/stylesheet.css");
		removef.setOnAction(e->{
			
			status.appendText(list.removeFirst());
		});
		
		
		Button display = new Button("Display");
		display.setPrefWidth(150);
		display.setPrefHeight(50);
		display.setTranslateX(15);
		display.setTranslateY(500);
		display.getStylesheets().add("file:Css/stylesheet.css");		display.setOnAction(e->{
			try {
				
				status.appendText("[---DISPLAY---]\n");
				list.display2(root, status);
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		});
		Button search = new Button("Search");
		search.setPrefWidth(150);
		search.setPrefHeight(30);
		search.getStylesheets().add("file:Css/stylesheet.css");
		
		TextField searchtxt = new TextField();
		searchtxt.setPrefHeight(30);
		searchtxt.setPromptText("Search");
		searchtxt.getStylesheets().add("file:Css/stylesheet.css");
		
		search.setOnAction(e->{
			
			status.appendText(list.search(searchtxt.getText()));
			status.setStyle(" -fx-text-fill: red;");
		});
		
		HBox serch=new HBox();
		serch.setLayoutX(200);
		serch.setLayoutY(120);
		serch.getChildren().addAll(searchtxt,search);
		
		
		Button homebnt = new Button("Home");
		homebnt.setPrefWidth(150);
		homebnt.setPrefHeight(50);
		homebnt.setTranslateX(700);
		homebnt.setTranslateY(20);
		homebnt.getStylesheets().add("file:Css/stylesheet.css");
		
		homebnt.setOnAction(e->{
			Home gae = new Home();
				try {
				gae.start(stage);
				} catch (Exception e1) {
				}
		});
			
		
		ImageView bkg = new ImageView(new Image("file:Image/linklist1.jpg"));
    	bkg.setFitWidth(900);
    	bkg.setFitHeight(600);
    	bkg.setX(0);
    	bkg.setY(0);
    	
    	root.getChildren().addAll(bkg,label);
		root.getChildren().add(status);
		root.getChildren().addAll(nametxt,cnictxt,agetxt,addf,addl,removef,removel,display,serch,homebnt);
		
		Scene scene = new Scene(root,900,600);
		scene.setFill(Color.LIGHTSKYBLUE);
		stage.setScene(scene);
		stage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}

