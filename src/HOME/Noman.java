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

public class Noman extends Application{

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
	        r2.setWidth(300);
	        r2.setHeight(600);
	        Image img = new Image("file:Image/11.JPEG");
	        r2.setFill(new ImagePattern(img));
	        
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
	         
	         Label label3 = new Label("Noman Zahoor");
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
	         
	         Label label5 = new Label("21");
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
	       
	         Text txt1=new Text(".Web Development\n.Application Development\n.UI Designer,\n.Backend Development");
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
	          

	       
	     
	       
	         
	         
	        
	        
	        		
		root.getChildren().addAll(label,r2,label1,label2,label3,label4,label5,label6,txt1,label7,link);
		Scene scene = new Scene(root,900,600);
		scene.setFill(Color.WHITE);
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
