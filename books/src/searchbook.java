
import java.util.Iterator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.LinkedList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;


public class searchbook extends Application {
    LinkedList<String> ll=new LinkedList<String>();

    public static void search(String data,LinkedList ll){
     try { 
          Iterator<String> li = ll.iterator();
    while (li.hasNext()) {
        if (li.next().contains(data)) {   
         
        }
     }
    }
          catch (Exception ex) {
         	
 
        }}
     
    
   //***************************************************
    
    @Override
    public void start(Stage primaryStage) {
        Pane p=new Pane();
        VBox v=new VBox();
        v.setSpacing(30);
        v.setPadding(new Insets(17));
        HBox h1=new HBox();
        h1.setSpacing(10);
        HBox h2=new HBox();
        h2.setSpacing(10);
        
//        ImageView img=new ImageView("kkk.jpg");
//            img.setFitWidth(350 );
//            img.setFitWidth(350);
//            p.getChildren().add(img);
        
        Label l=new Label("Search");
        l.setFont(Font.font("Consolas”", 15));
        
        Text t1=new Text("1-"+"  ");

        TextField t=new TextField("input");
       t.setOnMouseClicked( (event )-> {   
    
           t.setText("");
    });
        
       Button bb1=new Button("Back to Disktop");
   bb1.setOnAction((e)->{
   
   
  
   
   });
       
        Button b1=new Button("Name");
        b1.setOnAction((ActionEvent event) -> {       
        
        search(t.getText(),ll);            
        });
        
        Button b2=new Button("Type");
         b2.setOnAction((ActionEvent event) -> {       
        
        search(t.getText(),ll);            
        });
        Button b3=new Button("D.date");
             double v2 = Double.parseDouble(t.getText());
        b3.setOnAction((ActionEvent event) -> {       
        
        search(t.getText(),ll);            
        });
        Button b4=new Button("Author");
         b4.setOnAction((ActionEvent event) -> {       
        
        search(t.getText(),ll);            
        });
        Button b5=new Button("Note");
     b5.setOnAction((ActionEvent event) -> {       
        
        search(t.getText(),ll);            
      
        });
    
        p.getChildren().add(v);
        v.getChildren().addAll(h1,h2,t1,bb1);
        h1.getChildren().addAll(l,t);
        h2.getChildren().addAll(b1,b2,b3,b4,b5);
        
        Scene scene2 = new Scene(p, 350, 350);
        
        primaryStage.setTitle("Search");
        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
