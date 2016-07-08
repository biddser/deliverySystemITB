import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 */
public class DeliveryAppTestGui extends Application {

    public void start(Stage primaryStage) throws Exception {
        //Creating a GridPane container
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

//Defining the reference text field
        final TextField itbReference = new TextField();
        itbReference.setPromptText("Enter ITB reference number.");
        itbReference.setPrefColumnCount(10);
        itbReference.getText();
        GridPane.setConstraints(itbReference, 0, 0);
        grid.getChildren().add(itbReference);
//Defining the Last Name text field

        final TextField lastName = new TextField();
        lastName.setPromptText("Enter your last name.");
        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);
//Defining the Comment text field

        final TextField comment = new TextField();
        comment.setPrefColumnCount(15);
        comment.setPromptText("Enter your comment.");
        GridPane.setConstraints(comment, 0, 2);
        grid.getChildren().add(comment);

//Defining the Submit button
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);

//Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);

//************** Setting the scene
        Group root = new Group(grid);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("My JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();



        //Adding a Label
        final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);



//Setting an action for the Submit button
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if ((itbReference.getText() != null && !itbReference.getText().isEmpty())) {
                   label.setText(itbReference.getText() + " " + lastName.getText() + ", "
                            + "entered");
                    Delivery newDelivery = new Delivery();
                    newDelivery.setReferenceNumber(itbReference.getText());
                    InsertSQL.executeInsertSQL(newDelivery.getReferenceNumber());
                } else {
                    label.setText("Please enter a reference number.");
                }
            }
        });

//Setting an action for the Clear button
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                itbReference.clear();
                lastName.clear();
                comment.clear();
                label.setText(null);
            }
        });



    }
}