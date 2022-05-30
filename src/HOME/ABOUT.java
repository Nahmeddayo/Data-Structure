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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ABOUT extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		
		Label label = new Label("About Us");
		Image img = new Image("file:Image/about.png");
	        ImageView view = new ImageView(img);
	        view.setFitHeight(80);
	        Font font = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
 	      label.setFont(font);
 	      label.setTextFill(Color.WHITE);
 	      view.setPreserveRatio(true);
	        label.setGraphic(view);
	        label.setTranslateX(230);
	        label.setTranslateY(25);
	        
	        
	        ImageView bkg = new ImageView(new Image("file:Image/about2.jpg"));
        	bkg.setFitWidth(900);
        	bkg.setFitHeight(600);
        	bkg.setX(0);
        	bkg.setY(0);
        
      

        	Label label1 = new Label("Noman Zahoor");
	         Font font3 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
	         label1.setFont(font3);
	         label1.setTextFill(Color.BLACK);
	         label1.setPrefHeight(40);
	         label1.setTranslateX(40);
	         label1.setTranslateY(2);
	         
	         Label label2 = new Label("Team Leader");
	         Font font4 = Font.font("Verdana",FontPosture.REGULAR, 15);
	         label2.setFont(font4);
	         label2.setTextFill(Color.GRAY);
	         label2.setPrefHeight(10);
	         label2.setTranslateX(40);
	         label2.setTranslateY(1);
	         
	         Label label3 = new Label("MERN Stack Developer");
	         Font font5 = Font.font("Verdana",FontPosture.REGULAR, 15);
	         label3.setFont(font5);
	         label3.setTextFill(Color.GRAY);
	         label3.setPrefHeight(10);
	         label3.setTranslateX(40);
	         label3.setTranslateY(1);
	         Button Noman = new Button("Contact");
	        Noman.setPrefSize(100,30);
	         Noman.setFont(Font.font("Brush Script MT", FontWeight.BOLD,15));
	         Noman.setTranslateX(60);
	         Noman.setTranslateY(5);
	         Noman.getStylesheets().add("file:Css/stylesheet.css");
	 		
	         Noman.setOnAction(e->{
	 		Noman Noman1 = new Noman();
	 				try {
	 					Noman1.start(stage);
	 				} catch (Exception e1) {
	 				}
	 		});
	         
	       
	         
	         
	        	        	
	        	Circle myCircle =new Circle(20,20,60);
	        	myCircle.setStroke(Color.BLACK);
	            Image im = new Image("file:Image/11.JPEG",false);
	            myCircle.setFill(new ImagePattern(im));
	            myCircle.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
	            myCircle.setTranslateX(45);
	           
	        	
		        double x=20,y=120;
				Rectangle box = new Rectangle(x-10,y-10,170,540);
				box.setFill(Color.WHITE);
				box.setStroke(Color.WHITE);
				box.setStrokeWidth(1.5);
				//box.setX(202);
				//box.setY(160);
				box.setWidth(250); 
				box.setHeight(250);
				box.setArcWidth(30);
				box.setArcHeight(30);
				
				 /*Box box1 = new Box(200.0f, 120.0f, 150.0f);
				 
			        box1.setTranslateX(100);
			        box1.setTranslateY(100);
			        VBox h =new VBox();
			        h.getChildren().addAll(box1,link);*/
			  
				
				root.getChildren().addAll(bkg,label);
				root.getChildren().add(box);

				VBox prop=new VBox();
				prop.setLayoutX(x);
	prop.setLayoutY(y);
				prop.getChildren().addAll(myCircle,label1,label2,label3,Noman);
				
				
				
				//root.getChildren().add(prop);

			
				
				
				//root.getChildren().add(box);
				/*VBox prop=new VBox();
				prop.setLayoutX(x);
				prop.setLayoutY(y);
				prop.getChildren().addAll(box,link);*/
			
		       


		
		Button close = new Button("EXIT");
		close.setPrefWidth(550);
		close.setPrefHeight(50);
		close.setLayoutX(250);
		close.setLayoutY(400);
		close.setStyle("-fx-background-color: red; -fx-text-fill: white;-fx-background-radius: .5em; fx-min-width: 1.5px; fx-min-height: 1.5px; -fx-max-width: 400px; -fx-max-height: 50px;-fx-border-color:white;-fx-border-width:2px;-fx-border-radius:.5em;");
		
		close.setOnAction(e->{
		
				try {
					stage.close();
				} catch (Exception e1) {
				}
		});
		
		
		root.getChildren().addAll(prop,close);
		Scene scene = new Scene(root,900,600);
		scene.setFill(Color.SKYBLUE);
		stage.setScene(scene);
		stage.setTitle("Data-Structer------[PARKASH]");
		Image iu=new Image("file://../Images/IU.png",900,900,true,true);
		stage.getIcons().add(iu);
		stage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
