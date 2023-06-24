module com.mycompany.calculadoracientifica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.calculadoracientifica to javafx.fxml;
    exports com.mycompany.calculadoracientifica;
}
