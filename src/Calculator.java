import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
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

    // Text Field check for the last character input in
    private void autoAddRemove(String button){
        if(!textField.getText().isEmpty()){ // check if the textfield not empty
            Character lastCharacter = textField.getText().charAt(textField.getText().length() - 1);
            switch (button){
                case "symbol":
                    switch (lastCharacter){
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        textField.setText(textField.getText() + "x");
                        break;
                        case '.':
                            textField.setText(textField.getText() + "0x");
                            break;
                    }
                    break;
                case "operand":
                    switch (lastCharacter){
                        case '+':
                        case '-':
                        case 'x':
                        case '÷':
                        case '.':
                            textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                            break;
                    }
                    break;
                case "point":
                    switch (lastCharacter){
                        case '+':
                        case '-':
                        case 'x':
                        case '÷':
                            textField.setText(textField.getText() + "0");
                            break;
                        case '.':
                            textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                            break;
                    }
                    break;
            }
        }
    }
    //  button clicked methods
    private void b0_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "0");
    }
    private void b1_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "1");
    }
    private void b2_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "2");
    }
    private void b3_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "3");
    }
    private void b4_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "4");
    }
    private void b5_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "5");
    }
    private void b6_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "6");
    }
    private void b7_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "7");
    }
    private void b8_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "8");
    }
    private void b9_isClicked(){
        autoAddRemove("number");
        textField.setText(textField.getText() + "9");
    }
    private void comma_isClicked(){
        String string = textField.getText();
        if(textField.getText().isEmpty()){
            textField.setText("0.");
        }else{
            int lastPointIndex = string.lastIndexOf(".");
            int lastPlusIndex = string.lastIndexOf("+");
            int lastMinusIndex = string.lastIndexOf("-");
            int lastMultipleIndex = string.lastIndexOf("x");
            int lastDivideIndex = string.lastIndexOf("÷");
            if(lastPointIndex <= lastPlusIndex ||
            lastPointIndex <= lastMinusIndex ||
            lastPointIndex <= lastMultipleIndex||
            lastPointIndex <= lastDivideIndex){
                autoAddRemove("point");
                textField.setText(textField.getText() + ".");
            }
        }
    }

    // c button
    private void clear_isClicked(){
        textField.setText("");
    }

    @Override
    public void start(Stage stage) throws Exception{
        window = stage;
        window.setTitle("Calculator..");
        // Creating controllers
        b0 = new Button("0");
        b0.setTranslateX(10+60+10);
        b0.setTranslateY(100+45+10+45+10+45+10+45+10);
        b0.setId("b0");
        b0.setFocusTraversable(false);
        b1 = new Button("1");
        b1.setTranslateX(10);
        b1.setTranslateY(100+45+10+45+10+45+10);
        b1.setId("b1");
        b1.setFocusTraversable(false);
        b2 = new Button("2");
        b2.setTranslateX(10+60+10);
        b2.setTranslateY(100+45+10+45+10+45+10);
        b2.setId("b2");
        b2.setFocusTraversable(false);
        b3 = new Button("3");
        b3.setTranslateX(10+60+10+60+10);
        b3.setTranslateY(100+45+10+45+10+45+10);
        b3.setId("b3");
        b3.setFocusTraversable(false);
        b4 = new Button("4");
        b4.setTranslateX(10);
        b4.setTranslateY(100+45+10+45+10);
        b4.setId("b4");
        b4.setFocusTraversable(false);
        b5 = new Button("5");
        b5.setTranslateX(10+60+10);
        b5.setTranslateY(100+45+10+45+10);
        b5.setId("b5");
        b5.setFocusTraversable(false);
        b6 = new Button("6");
        b6.setTranslateX(10+60+10+60+10);
        b6.setTranslateY(100+45+10+45+10);
        b6.setId("b6");
        b6.setFocusTraversable(false);
        b7 = new Button("7");
        b7.setTranslateX(10);
        b7.setTranslateY(100+45+10);
        b7.setId("b7");
        b7.setFocusTraversable(false);
        b8 = new Button("8");
        b8.setTranslateX(10+60+10);
        b8.setTranslateY(100+45+10);
        b8.setId("b8");
        b8.setFocusTraversable(false);
        b9 = new Button("9");
        b9.setTranslateX(10+60+10+60+10);
        b9.setTranslateY(100+45+10);
        b9.setId("b9");
        b9.setFocusTraversable(false);
        comma= new Button(".");
        comma.setTranslateX(10+60+10+60+10);
        comma.setTranslateY(100+45+10+45+10+45+10+45+10);
        comma.setId("comma");
        comma.setFocusTraversable(false);
         plus = new Button("+");
        plus.setTranslateX(10+60+10+60+10+60+10);
        plus.setTranslateY(100+45+10+45+10+45+10);
         plus.setId("plus");
        plus.setFocusTraversable(false);
        minus = new Button("-");
        minus.setTranslateX(10+60+10+60+10+60+10);
        minus.setTranslateY(100+45+10+45+10);
        minus.setId("minus");
        minus.setFocusTraversable(false);
        equal = new Button("=");
        equal.setTranslateX(10+60+10+60+10+60+10);
        equal.setTranslateY(100+45+10+45+10+45+10+45+10);
        equal.setId("equal");
        equal.setFocusTraversable(false);
        divide = new Button("÷");
        divide.setTranslateX(80+60+10+60+10);
        divide.setTranslateY(100);
        divide.setId("divide");
        divide.setFocusTraversable(false);
        multiply = new Button("×");
        multiply.setTranslateX(10+60+10+60+10+60+10);
        multiply.setTranslateY(100+45+10);
        multiply.setId("multiply");
        multiply.setFocusTraversable(false);
        clear = new Button("C");
        clear.setTranslateX(10);
        clear.setTranslateY(100);
        clear.setId("clear");
        clear.setFocusTraversable(false);
        back = new Button("←");
        back.setTranslateX(80);
        back.setTranslateY(100);
        back.setId("back");
        back.setFocusTraversable(false);
        brackets = new Button("( )");
        brackets.setTranslateX(80+60+10);
        brackets.setTranslateY(100);
        brackets.setId("brackets");
        brackets.setFocusTraversable(false);
        sign = new Button("±");
        sign.setTranslateX(10);
        sign.setTranslateY(100+45+10+45+10+45+10+45+10);
        sign.setId("sign");
        sign.setFocusTraversable(false);

        textField = new TextField("0"); // make it zero by default
        oldValueLabel = new Label(""); // make it empty by default
        operandLabel = new Label("");
        // positioning textfield, labels
        oldValueLabel.setAlignment(Pos.CENTER_RIGHT);
        operandLabel.setAlignment(Pos.BOTTOM_RIGHT);
        textField.setAlignment(Pos.CENTER_RIGHT);
        // make textfield unmodified
        textField.setEditable(false);
        textField.setFocusTraversable(false);
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
        // event handling
        EventHandler<javafx.event.ActionEvent> eventHandler = (javafx.event.ActionEvent e) -> {
            actionPerformed(e);
        };
        b0.addEventHandler(ActionEvent.ACTION, eventHandler);
        b1.addEventHandler(ActionEvent.ACTION, eventHandler);
        b2.addEventHandler(ActionEvent.ACTION, eventHandler);
        b3.addEventHandler(ActionEvent.ACTION, eventHandler);
        b4.addEventHandler(ActionEvent.ACTION, eventHandler);
        b5.addEventHandler(ActionEvent.ACTION, eventHandler);
        b6.addEventHandler(ActionEvent.ACTION, eventHandler);
        b7.addEventHandler(ActionEvent.ACTION, eventHandler);
        b8.addEventHandler(ActionEvent.ACTION, eventHandler);
        b9.addEventHandler(ActionEvent.ACTION, eventHandler);
        plus.addEventHandler(ActionEvent.ACTION, eventHandler);
        minus.addEventHandler(ActionEvent.ACTION, eventHandler);
        divide.addEventHandler(ActionEvent.ACTION, eventHandler);
        comma.addEventHandler(ActionEvent.ACTION, eventHandler);
        clear.addEventHandler(ActionEvent.ACTION, eventHandler);
        back.addEventHandler(ActionEvent.ACTION,eventHandler);
        equal.addEventHandler(ActionEvent.ACTION, eventHandler);



        Pane layout = new Pane();
        //adding controllers to the layout
        layout.getChildren().addAll(
                oldValueLabel,operandLabel,textField,b0,b1,b2,b3,b4,b5,b6,comma, plus, minus , equal,sign, b7,b8,b9,multiply,clear, back,brackets,divide
        );
        scene = new Scene(layout,290,380);
        scene.getStylesheets().add("StylingSheet.css");
        window.setScene(scene);
        window.show();

        // key board definition
        scene.addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent e) -> {
            switch (e.getCode()){

            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
    // action performed
    public void actionPerformed(ActionEvent event){

    }
}
