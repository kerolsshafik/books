
package addbook;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author KERO
 */
public class addbook extends Application {

    public static void add(TextField name,TextField type,TextField author,TextField note,TextField date)throws IOException
    {
  LinkedList<String> ll=new LinkedList<String>();

ll.add(name.getText());
ll.add(type.getText());
ll.add(author.getText());
ll.add(note.getText());
ll.add(date.getText());


}
    
//    public static void view(LinkedList ll){
//
//  Iterator<String> iterator=ll.iterator();
//     while(iterator.hasNext()){
//     }
//    }
    
    
    
   ////////////////////////////////////
    @Override
    public void start(Stage primaryStage) {
        Pane r=new Pane();   
        r.setStyle("-fx-background:darkcyan;"); 
        HBox h=new HBox();
            h.setPadding(new Insets(50, 20, 0,20 ));
        VBox v=new VBox();
            v.setSpacing(30);
        VBox v1=new VBox();
            v1.setSpacing(20);
            
       TextField t1=new TextField("");
       TextField t2=new TextField("");
       TextField t3=new TextField("");
       TextField t4=new TextField("");
       TextField t5=new TextField("");

              Text tt=new Text("");

       
       Button b=new Button(" add book");
       Button b1=new Button(" search books"); //المفروض يوديك للكتب او للبحث بس انا مش عارف ازاى اخليه يفتح الصفخه التانيه 
         b.setFont(Font.font(15));
         b.setOnAction((ActionEvent event) -> {
            try {
            double v2 = Double.parseDouble(t5.getText());
                add(t1, t2, t3,t4,t5);
                tt.setText ("");
            }catch(Exception e){
                tt.setText("wrong input");
            }
         });
         
         b1.setFont(Font.font(15));
   b1.setOnAction((ActionEvent event) -> {
       //window.setScene(scene2);
   });

       Label l=new Label(" Add Book");
       l.setFont(Font.font("Consolas”", FontWeight.BOLD, 24));
        
        Label l1=new Label(" Book name");
        Label l2=new Label(" Type");
        Label l3=new Label("publish date");
        Label l4=new Label(" Author");
        Label l5=new Label(" Note");

       
       v1.getChildren().addAll(t1,t2,t3,t4,t5);
       r.getChildren().addAll(l,h);
       h.getChildren().addAll(v,v1);     
       v.getChildren().addAll(l1,l2,l3,l4,l5,b,b1 ,tt);
       
       
        Scene scene = new Scene(r, 600,500);
  
        primaryStage.setTitle("Add Book");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
}
    
}