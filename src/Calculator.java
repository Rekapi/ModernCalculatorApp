import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

// this is modern calculator is as a training for JavaFX
public class Calculator extends Application {
    // declaring variables
    // 1. front End controllers
    private Stage window;
    private Scene scene;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, comma, plus, minus , equal,divide, multiply,clear, back,brackets,sign;
   private  TextField textField;
   private Label oldValueLabel, operandLabel;
    // setting up the font
   // private Font font = Font.font("Calibri", FontWeight.NORMAL,20);

    @Override
    public void start(Stage stage) throws Exception{
        window = stage;
        window.setTitle("Calculator..");
        // Creating controllers
        b0 = new Button("0");
        b0.setId("b0");
        b1 = new Button("1");
        b1.setId("b1");
        b2 = new Button("2");
        b2.setId("b2");
        b3 = new Button("3");
        b3.setId("b3");
        b4 = new Button("4");
        b4.setId("b4");
        b5 = new Button("5");
        b5.setId("b5");
        b6 = new Button("6");
        b6.setId("b6");
        b7 = new Button("7");
        b7.setId("b7");
        b8 = new Button("8");
        b8.setId("b8");
        b9 = new Button("9");
        b9.setId("b9");
        comma= new Button(".");
        comma.setId("comma");
         plus = new Button("+");
         plus.setId("plus");
        minus = new Button("-");
        minus.setId("minus");
        equal = new Button("=");
        equal.setId("equal");
        divide = new Button("÷");
        divide.setId("divide");
        multiply = new Button("×");
        multiply.setId("multiply");
        clear = new Button("C");
        clear.setTranslateX(10);
        clear.setTranslateY(85);
        clear.setId("clear");
        back = new Button("←");
        back.setId("back");
        brackets = new Button("()");
        brackets.setId("brackets");
        sign = new Button("±");
        sign.setId("sign");

        textField = new TextField("0"); // make it zero by default
        oldValueLabel = new Label(""); // make it empty by default
        operandLabel = new Label("");
        // positioning textfield, labels
        oldValueLabel.setAlignment(Pos.CENTER_RIGHT);
        operandLabel.setAlignment(Pos.BOTTOM_RIGHT);
        textField.setAlignment(Pos.CENTER_RIGHT);
        // make textfield unmodified
        textField.setEditable(false);
        // sizing and positioning controllers
        oldValueLabel.setPrefSize(250,30);
        oldValueLabel.setTranslateX(10);
        oldValueLabel.setTranslateY(20);
        operandLabel.setPrefSize(15,20);
        operandLabel.setTranslateX(225);
        operandLabel.setTranslateY(20);
        textField.setPrefSize(270,40);
        textField.setTranslateX(10);
        textField.setTranslateY(25);
        textField.setId("textField");


        Pane layout = new Pane();
        //adding controllers to the layout
        layout.getChildren().addAll(
                oldValueLabel,operandLabel,textField,/*b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,comma, plus, minus , equal,divide, multiply,*/clear/*, back,brackets,sign*/
        );
        scene = new Scene(layout,290,415);
        scene.getStylesheets().add("StylingSheet.css");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
