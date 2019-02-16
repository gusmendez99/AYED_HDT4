import DesignPatternClasses.StackFactory;
import Interfaces.Calculator;
import Interfaces.Stack;
import Models.MyCalculator;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * date 02/15/2019
 * @author  Gustavo Andrés, Carné 18500
 * @author  Luis Urbina, Carné 18473
 * This program is designed to calculate a postfix operation using multiple data structures
 * The user will be able to choose between 3 options of stacks and in case he or she selects the
 * ListStack type of Stack, a new window will be prompted asking for what kind of implementation
 * of List he / she wants to use to test the program. All choices point in the same direction, solve
 * the same problem. Code was mostly extracted from Java Structures from Bailey, D.
 */

/**
 * Calculator view class for display a JavaFX UI
 */
public class CalculatorView {


    /**
     * TextArea for show the results
     */
    TextArea result = new TextArea("...");
    /**
     * File chooser for pick the text file with the math expressions
     */
    final FileChooser fileChooser = new FileChooser();

    private final String [] arrayData = {"VECTOR", "ARRAYLIST", "LIST"};
    private final String [] arrayDataForLists = {"SINGLE", "DOUBLE", "CIRCULAR"};
    private List<String> dialogData, dialogDataList;

    /**
     * To return a cleaned String of the math expression
     * @param input receives a String, with the full math operation
     * @param acceptedInputs ArrayList that have the valid operators
     * @return
     */
    private static ArrayList<String> cleanInput(String input, ArrayList<String> acceptedInputs) {
        ArrayList<String> stringsArrayList = new ArrayList<>(Arrays.asList(input.trim().split("")));
        ArrayList<String> cleanedInputArrayList = new ArrayList<>();
        for (String s : stringsArrayList) {
            if (acceptedInputs.contains(s)) {
                cleanedInputArrayList.add(s);
            }
        }
        return cleanedInputArrayList;
    }

    /**
     * To show the JavFX UI
     * @param stage Stage of JavaFX where we're gonna render the UI
     */
    public void showCalculator(Stage stage){

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );

        BorderPane border = new BorderPane();
        HBox hbox = addHBox(stage);
        border.setTop(hbox);
        border.setLeft(addVBox());

        Scene scene = new Scene(border, 400, 400);
        stage.setTitle("Calculadora");
        //scene.getStylesheets().add(Calculadora.class.getResource("estilo.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }

    /**
     * To return a HBox with two buttons for read file and clear TextArea
     * @param stage Stage of JavaFX where we're gonna render the UI
     * @return a filled HBox to add to the UI
     */
    public HBox addHBox(Stage stage) {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(6);
        hbox.setStyle("-fx-background-color: #455a64;");

        //Button for load the text file
        Button buttonCurrent = new Button("Open File");
        buttonCurrent.setPrefSize(100, 20);
        buttonCurrent.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(stage);
            if(selectedFile != null){
                ArrayList<String> myLines = readFile(selectedFile);
                for(String line: myLines){
                    String resultStr = operate(line);
                    result.appendText("\n" + line + " tiene como resultado: " + resultStr);
                }
            }

        });

        //Button for clear the input data
        Button buttonProjected = new Button("Clear");
        buttonProjected.setPrefSize(100, 20);
        buttonProjected.setOnAction(e -> {
            result.clear();
        });

        hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        return hbox;
    }

    /**
     * For read a file line by line
     * @param file File object which have the math operation
     * @return an ArrayList of String lines of the file
     */
    private ArrayList<String> readFile(File file){
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                lines.add(text);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lines;
    }

    /**
     * For operate a single line, and return the result
     * @param line String with the math operation
     * @return the result of that operation, as a String
     */
    private String operate(String line) {
        ArrayList<String> acceptedInputs = new ArrayList<>();
        for (int index = 0; index <= 9; index++) {
            acceptedInputs.add(Integer.toString(index));
        }
        acceptedInputs.add("+");
        acceptedInputs.add("-");
        acceptedInputs.add("*");
        acceptedInputs.add("/");

        ArrayList<String> finalInputArrayList;
        Calculator myCalculator = MyCalculator.getInstance();
        Stack myPila = null;

        //For Stack choice. Dialog with strings
        dialogData = Arrays.asList(arrayData);

        ChoiceDialog dialog = new ChoiceDialog(dialogData.get(0), dialogData);
        dialog.setTitle("Tipo de Stack");
        dialog.setHeaderText("Selecciona un tipo de stack: ");

        Optional<String> optionalResult = dialog.showAndWait();
        String selected = "";

        if (optionalResult.isPresent()) {
            selected = optionalResult.get();
            switch (selected){
                case "VECTOR":
                   myPila = StackFactory.getStack("VECTOR", "");
                   break;
                case "ARRAYLIST":
                    myPila = StackFactory.getStack("ARRAYLIST", "");
                    break;
                case "LIST":
                    dialogDataList = Arrays.asList(arrayDataForLists);

                    ChoiceDialog dialogList = new ChoiceDialog(dialogDataList.get(0), dialogDataList);
                    dialogList.setTitle("Tipo de List");
                    dialogList.setHeaderText("Selecciona un tipo de lista: ");

                    Optional<String> resultList = dialogList.showAndWait();
                    String selectedList = "";

                    if (resultList.isPresent()) {
                        selectedList = resultList.get();
                        switch (selectedList) {
                            case "SINGLE":
                                myPila = StackFactory.getStack("LIST", "SINGLE");
                                break;
                            case "DOUBLE":
                                myPila = StackFactory.getStack("LIST", "DOUBLE");
                                break;
                            case "CIRCULAR":
                                myPila = StackFactory.getStack("LIST", "CIRCULAR");
                                break;
                        }

                    }
                    break;
            }
        }

        finalInputArrayList = cleanInput(line, acceptedInputs);

        int result = 0;

        for (int i = 0; i < finalInputArrayList.size(); i++) {
            System.out.println(finalInputArrayList.get(i));
            System.out.println(myPila.toString());
            if (finalInputArrayList.get(i).equals("+") || finalInputArrayList.get(i).equals("*") ||
                    finalInputArrayList.get(i).equals("-") || finalInputArrayList.get(i).equals("/")) {
                if (finalInputArrayList.get(i).equals("/") && finalInputArrayList.get(i - 1).equals("0")) {
                    myPila.pop();
                    System.out.println("No se puede dividir entre cero!");
                } else {
                    int num2 = (Integer) myPila.pop();
                    int num1 = (Integer) myPila.pop();
                    result = myCalculator.calculate(num1, num2, finalInputArrayList.get(i));
                    myPila.push(result);
                    System.out.println("Se ha ejecutado la operación: " + num2 + " " + finalInputArrayList.get(i) + " " + num1);
                    System.out.println("el estado actual de la pila es: " + myPila.toString());
                }
            } else {
                myPila.push(Integer.parseInt(finalInputArrayList.get(i)));
            }
        }
        return myPila.pop().toString();

    }

    /**
     * For add a TextArea to the screen, and show the result
     * @return a filled HBox to add to the UI
     */
    public VBox addVBox() {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);

        //Adding the TextArea to the VBox
        result.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(result);

        return vbox;
    }
}
