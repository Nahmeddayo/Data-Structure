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
        	bkg.setFitHeight(700);
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
				box.setWidth(250); 
				box.setHeight(250);
				box.setArcWidth(30);
				box.setArcHeight(30);
			 				
				root.getChildren().addAll(bkg,label);
				root.getChildren().add(box);

				VBox prop=new VBox();
				prop.setLayoutX(x);
				prop.setLayoutY(y);
				prop.getChildren().addAll(myCircle,label1,label2,label3,Noman);
				
				
				//Arbaaz
				Label label4 = new Label("Mir Arbaaz");
		         Font font6 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
		         label4.setFont(font6);
		         label4.setTextFill(Color.BLACK);
		         label4.setPrefHeight(40);
		         label4.setTranslateX(40);
		         label4.setTranslateY(2);
		         
		         Label label5 = new Label("Team Member");
		         Font font7 = Font.font("Verdana",FontPosture.REGULAR, 15);
		         label5.setFont(font7);
		         label5.setTextFill(Color.GRAY);
		         label5.setPrefHeight(10);
		         label5.setTranslateX(40);
		         label5.setTranslateY(1);
		         
		         Label label6 = new Label("UI/UX Designer");
		         Font font8 = Font.font("Verdana",FontPosture.REGULAR, 15);
		         label6.setFont(font8);
		         label6.setTextFill(Color.GRAY);
		         label6.setPrefHeight(10);
		         label6.setTranslateX(40);
		         label6.setTranslateY(1);
		         
		         Button Arbaaz = new Button("Contact");
		         Arbaaz.setPrefSize(100,30);
		         Arbaaz.setFont(Font.font("Brush Script MT", FontWeight.BOLD,15));
		         Arbaaz.setTranslateX(60);
		         Arbaaz.setTranslateY(5);
		         Arbaaz.getStylesheets().add("file:Css/stylesheet.css");
		 		
		         Arbaaz.setOnAction(e->{
		 		Arbaaz Arbaaz1 = new Arbaaz();
		 				try {
		 					Arbaaz1.start(stage);
		 				} catch (Exception e1) {
		 				}
		 		});
		              	
		        	Circle myCircle1 =new Circle(20,20,60);
		        	myCircle1.setStroke(Color.BLACK);
		            Image im1 = new Image("file:Image/Arbaaz.JPEG",false);
		            myCircle1.setFill(new ImagePattern(im1));
		            myCircle1.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
		            myCircle1.setTranslateX(45);
		           	
			        double x1=350,y1=120;
					Rectangle box1 = new Rectangle(x1-10,y1-10,170,540);
					box1.setFill(Color.WHITE);
					box1.setStroke(Color.WHITE);
					box1.setStrokeWidth(1.5);
					box1.setWidth(250); 
					box1.setHeight(250);
					box1.setArcWidth(30);
					box1.setArcHeight(30);
				 				
					root.getChildren().add(box1);

					VBox prop1=new VBox();
					prop1.setLayoutX(x1);
					prop1.setLayoutY(y1);
					prop1.getChildren().addAll(myCircle1,label4,label5,label6,Arbaaz);
					
					//Qadeer
					Label label7 = new Label("Qadeer Ahmed");
			         Font font9 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
			         label7.setFont(font9);
			         label7.setTextFill(Color.BLACK);
			         label7.setPrefHeight(40);
			         label7.setTranslateX(40);
			         label7.setTranslateY(2);
			         
			         Label label8 = new Label("Team Member");
			         Font font10 = Font.font("Verdana",FontPosture.REGULAR, 15);
			         label8.setFont(font10);
			         label8.setTextFill(Color.GRAY);
			         label8.setPrefHeight(10);
			         label8.setTranslateX(40);
			         label8.setTranslateY(1);
			         
			         Label label9 = new Label("Graphic Designer");
			         Font font11 = Font.font("Verdana",FontPosture.REGULAR, 15);
			         label9.setFont(font11);
			         label9.setTextFill(Color.GRAY);
			         label9.setPrefHeight(10);
			         label9.setTranslateX(40);
			         label9.setTranslateY(1);
			         
			         Button Qadeer = new Button("Contact");
			         Qadeer.setPrefSize(100,30);
			         Qadeer.setFont(Font.font("Brush Script MT", FontWeight.BOLD,15));
			         Qadeer.setTranslateX(60);
			         Qadeer.setTranslateY(5);
			         Qadeer.getStylesheets().add("file:Css/stylesheet.css");
			 		
			         Qadeer.setOnAction(e->{
			 		Qadeer Qadeer1 = new Qadeer();
			 				try {
			 					Qadeer1.start(stage);
			 				} catch (Exception e1) {
			 				}
			 		});
			              	
			        	Circle myCircle2 =new Circle(20,20,60);
			        	myCircle2.setStroke(Color.BLACK);
			            Image im2 = new Image("file:Image/Qadeer.JPEG",false);
			            myCircle2.setFill(new ImagePattern(im2));
			            myCircle2.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			            myCircle2.setTranslateX(45);
			           	
				        double x2=650,y2=120;
						Rectangle box2 = new Rectangle(x2-10,y2-10,170,540);
						box2.setFill(Color.WHITE);
						box2.setStroke(Color.WHITE);
						box2.setStrokeWidth(1.5);
						box2.setWidth(250); 
						box2.setHeight(250);
						box2.setArcWidth(30);
						box2.setArcHeight(30);
					 				
						root.getChildren().add(box2);

						VBox prop2=new VBox();
						prop2.setLayoutX(x2);
						prop2.setLayoutY(y2);
						prop2.getChildren().addAll(myCircle2,label7,label8,label9,Qadeer);

						//Sikender
						Label label10 = new Label("Sikendar Mehdi");
				         Font font12 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
				         label10.setFont(font12);
				         label10.setTextFill(Color.BLACK);
				         label10.setPrefHeight(40);
				         label10.setTranslateX(40);
				         label10.setTranslateY(2);
				         
				         Label label11 = new Label("Team Member");
				         Font font13 = Font.font("Verdana",FontPosture.REGULAR, 15);
				         label11.setFont(font13);
				         label11.setTextFill(Color.GRAY);
				         label11.setPrefHeight(10);
				         label11.setTranslateX(40);
				         label11.setTranslateY(1);
				         
				         Label label12 = new Label("Backend Developer");
				         Font font14 = Font.font("Verdana",FontPosture.REGULAR, 15);
				         label12.setFont(font14);
				         label12.setTextFill(Color.GRAY);
				         label12.setPrefHeight(10);
				         label12.setTranslateX(40);
				         label12.setTranslateY(1);
				         
				         Button Sikendar = new Button("Contact");
				         Sikendar.setPrefSize(100,30);
				         Sikendar.setFont(Font.font("Brush Script MT", FontWeight.BOLD,15));
				         Sikendar.setTranslateX(60);
				         Sikendar.setTranslateY(5);
				         Sikendar.getStylesheets().add("file:Css/stylesheet.css");
				 		
				         Sikendar.setOnAction(e->{
				        	 Sikendar Sikendar1 = new Sikendar();
				 				try {
				 					Sikendar1.start(stage);
				 				} catch (Exception e1) {
				 				}
				 		});
				              	
				        	Circle myCircle3 =new Circle(20,20,60);
				        	myCircle3.setStroke(Color.BLACK);
				            Image im3 = new Image("file:Image/Sikendar.JPEG",false);
				            myCircle3.setFill(new ImagePattern(im3));
				            myCircle3.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
				            myCircle3.setTranslateX(45);
				           	
					        double x3=20,y3=400;
							Rectangle box3 = new Rectangle(x3-10,y3-10,170,540);
							box3.setFill(Color.WHITE);
							box3.setStroke(Color.WHITE);
							box3.setStrokeWidth(1.5);
							box3.setWidth(250); 
							box3.setHeight(250);
							box3.setArcWidth(30);
							box3.setArcHeight(30);
						 				
							root.getChildren().add(box3);

							VBox prop3=new VBox();
							prop3.setLayoutX(x3);
							prop3.setLayoutY(y3);
							prop3.getChildren().addAll(myCircle3,label10,label11,label12,Sikendar);
							
							//Saad
							Label label13 = new Label("Saad Khan");
					         Font font15 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
					         label13.setFont(font15);
					         label13.setTextFill(Color.BLACK);
					         label13.setPrefHeight(40);
					         label13.setTranslateX(40);
					         label13.setTranslateY(2);
					         
					         Label label14 = new Label("Team Member");
					         Font font16 = Font.font("Verdana",FontPosture.REGULAR, 15);
					         label14.setFont(font16);
					         label14.setTextFill(Color.GRAY);
					         label14.setPrefHeight(10);
					         label14.setTranslateX(40);
					         label14.setTranslateY(1);
					         
					         Label label15 = new Label("Java Developer");
					         Font font17 = Font.font("Verdana",FontPosture.REGULAR, 15);
					         label15.setFont(font17);
					         label15.setTextFill(Color.GRAY);
					         label15.setPrefHeight(10);
					         label15.setTranslateX(40);
					         label15.setTranslateY(1);
					         
					         Button Saad = new Button("Contact");
					         Saad.setPrefSize(100,30);
					         Saad.setFont(Font.font("Brush Script MT", FontWeight.BOLD,15));
					         Saad.setTranslateX(60);
					         Saad.setTranslateY(5);
					         Saad.getStylesheets().add("file:Css/stylesheet.css");
					 		
					         Saad.setOnAction(e->{
					        	 Saad Saad1 = new Saad();
					 				try {
					 					Saad1.start(stage);
					 				} catch (Exception e1) {
					 				}
					 		});
					              	
					        	Circle myCircle4 =new Circle(20,20,60);
					        	myCircle4.setStroke(Color.BLACK);
					            Image im4 = new Image("file:Image/about1.JPG",false);
					            myCircle4.setFill(new ImagePattern(im4));
					            myCircle4.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
					            myCircle4.setTranslateX(45);
					           	
						        double x4=350,y4=400;
								Rectangle box4 = new Rectangle(x4-10,y4-10,170,540);
								box4.setFill(Color.WHITE);
								box4.setStroke(Color.WHITE);
								box4.setStrokeWidth(1.5);
								box4.setWidth(250); 
								box4.setHeight(250);
								box4.setArcWidth(30);
								box4.setArcHeight(30);
							 				
								root.getChildren().add(box4);

								VBox prop4=new VBox();
								prop4.setLayoutX(x4);
								prop4.setLayoutY(y4);
								prop4.getChildren().addAll(myCircle4,label13,label14,label15,Saad);

								
								//Asjad
								Label label16 = new Label("Asjad Gul");
						         Font font18 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
						         label16.setFont(font18);
						         label16.setTextFill(Color.BLACK);
						         label16.setPrefHeight(40);
						         label16.setTranslateX(40);
						         label16.setTranslateY(2);
						         
						         Label label17 = new Label("Team Member");
						         Font font19 = Font.font("Verdana",FontPosture.REGULAR, 15);
						         label17.setFont(font19);
						         label17.setTextFill(Color.GRAY);
						         label17.setPrefHeight(10);
						         label17.setTranslateX(40);
						         label17.setTranslateY(1);
						         
						         Label label18 = new Label("SEO");
						         Font font20 = Font.font("Verdana",FontPosture.REGULAR, 15);
						         label18.setFont(font20);
						         label18.setTextFill(Color.GRAY);
						         label18.setPrefHeight(10);
						         label18.setTranslateX(40);
						         label18.setTranslateY(1);
						         
						         Button Asjad = new Button("Contact");
						         Asjad.setPrefSize(100,30);
						         Asjad.setFont(Font.font("Brush Script MT", FontWeight.BOLD,15));
						         Asjad.setTranslateX(60);
						         Asjad.setTranslateY(5);
						         Asjad.getStylesheets().add("file:Css/stylesheet.css");
						 		
						         Asjad.setOnAction(e->{
						        	 Asjad Asjad1 = new Asjad();
						 				try {
						 					Asjad1.start(stage);
						 				} catch (Exception e1) {
						 				}
						 		});
						              	
						        	Circle myCircle5 =new Circle(20,20,60);
						        	myCircle5.setStroke(Color.BLACK);
						            Image im5 = new Image("file:Image/Asjad.JPEG",false);
						            myCircle5.setFill(new ImagePattern(im5));
						            myCircle5.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
						            myCircle5.setTranslateX(45);
						           	
							        double x5=650,y5=400;
									Rectangle box5 = new Rectangle(x5-10,y5-10,170,540);
									box5.setFill(Color.WHITE);
									box5.setStroke(Color.WHITE);
									box5.setStrokeWidth(1.5);
									box5.setWidth(250); 
									box5.setHeight(250);
									box5.setArcWidth(30);
									box5.setArcHeight(30);
								 				
									root.getChildren().add(box5);

									VBox prop5=new VBox();
									prop5.setLayoutX(x5);
									prop5.setLayoutY(y5);
									prop5.getChildren().addAll(myCircle5,label16,label17,label18,Asjad);




				
									Button homebnt = new Button("Back");
									homebnt.setPrefWidth(150);
									homebnt.setPrefHeight(50);
									homebnt.setTranslateX(25);
									homebnt.setTranslateY(20);
									homebnt.getStylesheets().add("file:Css/stylesheet.css");
									
									homebnt.setOnAction(e->{
										Home gae = new Home();
											try {
											gae.start(stage);
											} catch (Exception e1) {
											}
									});
		
		
		root.getChildren().addAll(prop,prop1,prop2,prop3,prop4,prop5,homebnt);
		Scene scene = new Scene(root,900,700);
		scene.setFill(Color.SKYBLUE);
		stage.setScene(scene);
		stage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
