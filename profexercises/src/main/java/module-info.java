module profexercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.realemj.exercises18 to javafx.fxml;

    exports edu.decintn.exercises00;
    exports edu.realemj.exercises02;
    exports edu.realemj.exercises18;
}