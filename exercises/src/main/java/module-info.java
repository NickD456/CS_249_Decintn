module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.decintn.exercises00 to javafx.fxml;

    exports edu.decintn.exercises00;
}
