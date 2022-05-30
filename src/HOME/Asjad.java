package HOME;
import javax.sound.sampled.Clip;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Asjad extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		
		Label label = new Label("Profile");
		
	        Font font = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
 	      label.setFont(font);
 	      label.setTextFill(Color.BLACK);
	        label.setTranslateX(400);
	        label.setTranslateY(25);
	        Rectangle r2 = new Rectangle();
	        r2.setWidth(350);
	        r2.setHeight(550);
	        Image img = new Image("file:Image/Asjad.JPEG");
	        r2.setFill(new ImagePattern(img));
	        r2.setArcWidth(50);
	        r2.setArcHeight(50);
	        
	        Label label1 = new Label("Details");
	         Font font3 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
	         label1.setFont(font3);
	         label1.setTextFill(Color.BLACK);
	         label1.setPrefHeight(40);
	         label1.setTranslateX(400);
	         label1.setTranslateY(100);
	         
	         Label label2 = new Label("Name :");
	         Font font4 = Font.font("Verdana", FontWeight.BOLD,FontPosture.REGULAR, 15);
	         label2.setFont(font4);
	         label2.setTextFill(Color.BLACK);
	         label2.setPrefHeight(40);
	         label2.setTranslateX(400);
	         label2.setTranslateY(130);
	         
	         Label label3 = new Label("Asjad Gul");
	         Font font5 = Font.font("Verdana",FontPosture.REGULAR, 15);
	         label3.setFont(font5);
	         label3.setTextFill(Color.BLACK);
	         label3.setPrefHeight(40);
	         label3.setTranslateX(400);
	         label3.setTranslateY(160);
	       
	         
	         Label label4 = new Label("Age :");
	         Font font6 = Font.font("Verdana", FontWeight.BOLD,FontPosture.REGULAR, 15);
	         label4.setFont(font6);
	         label4.setTextFill(Color.BLACK);
	         label4.setPrefHeight(40);
	         label4.setTranslateX(400);
	         label4.setTranslateY(190);
	         
	         Label label5 = new Label("22");
	         Font font7 = Font.font("Verdana",FontPosture.REGULAR, 15);
	         label5.setFont(font7);
	         label5.setTextFill(Color.BLACK);
	         label5.setPrefHeight(40);
	         label5.setTranslateX(400);
	         label5.setTranslateY(220);
	         
	         
	         Label label6 = new Label("Skills :");
	         Font font8 = Font.font("Verdana", FontWeight.BOLD,FontPosture.REGULAR, 15);
	         label6.setFont(font8);
	         label6.setTextFill(Color.BLACK);
	         label6.setPrefHeight(40);
	         label6.setTranslateX(400);
	         label6.setTranslateY(250);
	       
	         Text txt1=new Text(".Search Engine Optimizer");
	         txt1.setFont(Font.font("Verdana",FontPosture.REGULAR, 15));
	         txt1.setFill(Color.BLACK);
	         txt1.prefHeight(40);
	         txt1.setTranslateX(400);
	         txt1.setTranslateY(300);
	       
	         
	         Label label7 = new Label("Github :");
	         Image img1 = new Image("file:Image/github.png");
		        ImageView view = new ImageView(img1);
		        view.setFitHeight(20);
	         Font font9 = Font.font("Verdana", FontWeight.BOLD,FontPosture.REGULAR, 15);
	         label7.setFont(font9);
	         label7.setTextFill(Color.BLACK);
	         view.setPreserveRatio(true);
		        label7.setGraphic(view);
	         label7.setPrefHeight(40);
	         label7.setTranslateX(400);
	         label7.setTranslateY(360);
	         
	         Hyperlink link = new Hyperlink("https://github.com/Nahmeddayo");
	          Font font10 = Font.font("Verdana",FontPosture.REGULAR, 15);
	          link.setFont(font10);
	    	      link.setTextFill(Color.BLACK);
	    	    link.setTranslateX(400);
	          link.setTranslateY(400);
	          
	          
	          Label label8 = new Label("Email :");
		         Image img2 = new Image("file:Image/gmail.png");
			        ImageView view1 = new ImageView(img2);
			        view1.setFitHeight(20);
		         Font font11 = Font.font("Verdana", FontWeight.BOLD,FontPosture.REGULAR, 15);
		         label8.setFont(font11);
		         label8.setTextFill(Color.BLACK);
		         view1.setPreserveRatio(true);
			        label8.setGraphic(view1);
		         label8.setPrefHeight(40);
		         label8.setTranslateX(400);
		         label8.setTranslateY(430);
		         
		         Hyperlink link1 = new Hyperlink("Asjad@gmail.com");
		          Font font12 = Font.font("Verdana",FontPosture.REGULAR, 15);
		          link1.setFont(font12);
		    	      link1.setTextFill(Color.BLACK);
		    	    link1.setTranslateX(400);
		          link1.setTranslateY(460);
	          
		          
		          Label label9 = new Label("About Me");
			         Font font13 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
			         label9.setFont(font13);
			         label9.setTextFill(Color.BLACK);
			         label9.setPrefHeight(40);
			         label9.setTranslateX(750);
			         label9.setTranslateY(100);
			         
			         
			         Line line =new Line();
			 		line.setStartX(250);
			 		line.setStartY(100);
			 		line.setEndX(250);
			 		line.setEndY(500);
			 		line.setTranslateX(420);
			 		line.setTranslateY(25);
			 		line.setStroke(Color.BLACK);
			 		
			 		
			 		Text txt2=new Text("I am a Search\nEngine Optimizer. I have \nalso Good Knowledge \nAbout Affliate Maketing\nand Flippa.");
			         txt2.setFont(Font.font("Verdana",FontPosture.REGULAR, 15));
			         txt2.setFill(Color.BLACK);
			         txt2.prefHeight(40);
			         txt2.setTranslateX(690);
			         txt2.setTranslateY(150);
			         
			         Button Back = new Button("Back");
			         Back.setPrefWidth(150);
			         Back.setPrefHeight(50);
			         Back.setTranslateX(700);
			         Back.setTranslateY(20);
			         Back.getStylesheets().add("file:Css/stylesheet.css");
						
			         Back.setOnAction(e->{
							ABOUT gae = new ABOUT();
								try {
								gae.start(stage);
								} catch (Exception e1) {
								}
						});
	        		
		root.getChildren().addAll(label,r2,label1,label2,label3,label4,label5,label6,txt1,label7,link,label8,link1,label9,line,txt2,Back);
		Scene scene = new Scene(root,900,600);
		scene.setFill(Color.WHITE);
		stage.setScene(scene);
		
		stage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
