package HOME;
import BinarySearch.HomeB;
import LinkedList.HomeL;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Home extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		
		Label label = new Label("Data Structure");
		Image img = new Image("file:Image/logo1.png");
	        ImageView view = new ImageView(img);
	        view.setFitHeight(80);
	        Font font = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
 	      label.setFont(font);
 	      label.setTextFill(Color.WHITE);
 	      view.setPreserveRatio(true);
	        label.setGraphic(view);
	        label.setTranslateX(230);
	        label.setTranslateY(25);
	        
	        
	        ImageView bkg = new ImageView(new Image("file:Image/4.png"));
        	bkg.setFitWidth(900);
        	bkg.setFitHeight(600);
        	bkg.setX(0);
        	bkg.setY(0);
        
      
		
			Image img3 = new Image("file:Image/image.png");
 	    ImageView view3 = new ImageView(img3);
 	    view3.setFitHeight(30); 
 	    view3.setFitWidth(30); 
		Button Linked = new Button("Linkedlist",view3);
		Linked.setLayoutX(280);
		Linked.setLayoutY(200);
		Linked.setPrefSize(300,50);
		Linked.setFont(Font.font("Brush Script MT", FontWeight.BOLD,20));
		Linked.getStylesheets().add("file:Css/stylesheet.css");
	
		
		Linked.setOnAction(e->{
			HomeL link = new HomeL();
				try {
				link.start(stage);
				} catch (Exception e1) {
				}
		});
		
		Image img4 = new Image("file:Image/tree1.png");
 	    ImageView view4 = new ImageView(img4);
 	    view4.setFitHeight(30); 
 	    view4.setFitWidth(30); 
		
		Button binaryTree = new Button("binaryTree",view4);
		binaryTree.setLayoutX(280);
		binaryTree.setLayoutY(280);
		binaryTree.setPrefSize(150,50);
		binaryTree.setFont(Font.font("Brush Script MT", FontWeight.BOLD,20));
		binaryTree.getStylesheets().add("file:Css/stylesheet.css");
		
		binaryTree.setOnAction(e->{
			HomeB binary = new HomeB();
				try {
					binary.start(stage);
				} catch (Exception e1) {
				}
		});
		
		Image img5 = new Image("file:Image/abouts.png");
 	    ImageView view5 = new ImageView(img5);
 	    view5.setFitHeight(30); 
 	    view5.setFitWidth(30); 
		Button about = new Button("About",view5);
		about.setLayoutX(10);
		about.setLayoutY(40);
		about.setPrefSize(150,50);
		about.setFont(Font.font("Brush Script MT", FontWeight.BOLD,20));
		about.getStylesheets().add("file:Css/stylesheet.css");
		
		about.setOnAction(e->{
		ABOUT About = new ABOUT();
				try {
					About.start(stage);
				} catch (Exception e1) {
				}
		});
		
		
		
		
		
		root.getChildren().addAll(bkg,label,Linked,binaryTree,about);
		Scene scene = new Scene(root,900,600);
		stage.setScene(scene);
		stage.setTitle("Data Structure & Algorithm");
		stage.getIcons().add(new Image("file:Image/logo.png"));
		stage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
