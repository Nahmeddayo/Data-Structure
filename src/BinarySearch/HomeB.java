package BinarySearch;



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

public class HomeB extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		BTrees list=new BTrees();
		
		Label label = new Label("Binary Tree");
		Image img = new Image("file:Image/tree.png");
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
		
		
		TextArea status = new TextArea();
		status.setStyle("-fx-background-color: #000000; -fx-text-fill: black; -fx-text-size:20px;");
		status.setLayoutX(200);
		status.setLayoutY(180);
		status.setPrefHeight(400);
		status.setPrefWidth(680);
		
		Button addf = new Button("Insert");
		addf.setPrefWidth(150);
		addf.setPrefHeight(50);
		addf.setTranslateX(15);
		addf.setTranslateY(140);
		addf.getStylesheets().add("file:Css/stylesheet.css");
		
		addf.setOnAction(e->{
			try {
				status.appendText("[ added ] "+list.insert(nametxt.getText())+"\n");
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
			
		
		});
		
		Button delete = new Button("Delete");
		delete.setPrefWidth(150);
		delete.setPrefHeight(50);
		delete.setTranslateX(15);
		delete.setTranslateY(200);
		delete.getStylesheets().add("file:Css/stylesheet.css");
		
		delete.setOnAction(e->{
			try {
				status.appendText("[ deleted ] "+list.delete(nametxt.getText())+"\n");
			} catch (Exception e2) {
				// TODO: handle exception
				status.appendText("Binary tree is Empty\n");
			}
		});
		
		Button inorder = new Button("In-order");
		inorder.setPrefWidth(150);
		inorder.setPrefHeight(50);
		inorder.setTranslateX(15);
		inorder.setTranslateY(260);
		inorder.getStylesheets().add("file:Css/stylesheet.css");
		inorder.setOnAction(e->{
			status.appendText("\n[in-ordre] ");
			list.display(list.root);
			status.appendText("\n"+list.aa.toString()+"");
			list.aa.clear();
		
		});
		
		
		Button preorder = new Button("pre-order");
		preorder.setPrefWidth(150);
		preorder.setPrefHeight(50);
		preorder.setTranslateX(15);
		preorder.setTranslateY(320);
		preorder.getStylesheets().add("file:Css/stylesheet.css");
		preorder.setOnAction(e->{
			status.appendText("\n[pre-ordre] ");
			list.displaypre(list.root);
			status.appendText("\n"+list.aa.toString()+"");
			list.aa.clear();
		});
		
		
		Button postorder = new Button("post-order");
		postorder.setPrefWidth(150);
		postorder.setPrefHeight(50);
		postorder.setTranslateX(15);
		postorder.setTranslateY(380);
		postorder.getStylesheets().add("file:Css/stylesheet.css");
		
		postorder.setOnAction(e->{
			status.appendText("\n[Post-ordre] ");
			list.displaypre(list.root);
			status.appendText("\n"+list.aa.toString()+"");
			list.aa.clear();
		});
		
		TextField searchtxt = new TextField();
		searchtxt.setPrefHeight(30);
		searchtxt.setPromptText("Search ...");
		searchtxt.getStylesheets().add("file:Css/stylesheet.css");
		
		Button search = new Button("Search");
		search.setPrefWidth(150);
		search.setPrefHeight(30);
		search.getStylesheets().add("file:Css/stylesheet.css");
		
		search.setOnAction(e->{
			status.appendText("\n IS Found "+list.find(searchtxt.getText()));
		});
		
		HBox serch=new HBox();
		serch.setLayoutX(200);
		serch.setLayoutY(140);
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
		
		
		
		ImageView bkg = new ImageView(new Image("file:Image/binary.jpg"));
    	bkg.setFitWidth(900);
    	bkg.setFitHeight(600);
    	bkg.setX(0);
    	bkg.setY(0);

		root.getChildren().addAll(bkg,label);
		root.getChildren().addAll(nametxt,addf,delete,preorder,inorder,postorder,homebnt,serch);
		
		
		root.getChildren().add(status);
		Scene scene = new Scene(root,900,600);
		scene.setFill(Color.AZURE);
		stage.setScene(scene);
		stage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
