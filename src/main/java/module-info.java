module pl.pjwstk.qrcepta {
  requires javafx.controls;
  requires javafx.fxml;

  opens pl.pjwstk.qrcepta to javafx.fxml;
  exports pl.pjwstk.qrcepta;
}