package com.example.codelab;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.application.Platform;

import java.util.concurrent.ThreadLocalRandom;

public class TebakAngka extends Application {
    private int angka;
    private int percobaan;

    @Override
    public void start(Stage stageutama) {
        resetGame();
        Label judul = new Label("Tebak Angka 1-100");
        judul.setFont(Font.font("Roboto", 24));
        judul.setTextFill(Color.DARKCYAN);

        Label subjudul = new Label("Masukkan Tebakanmu!");
        subjudul.setFont(Font.font(16));
        subjudul.setTextFill(Color.GRAY);

        TextField teksinput = new TextField();
        teksinput.setPromptText("Masukkan Angka Disini");
        teksinput.setPrefWidth(200);

        Button tomboltebak = new Button("Coba Tebak!");
        tomboltebak.setStyle("-fx-background-color: #28a745; -fx-text-fill: white;");
        tomboltebak.setDefaultButton(true);

        Label labelJumlah = new Label("Jumlah percobaan: " + percobaan);
        labelJumlah.setFont(Font.font(14));
        labelJumlah.setTextFill(Color.DARKGRAY);

        HBox hbInput = new HBox(10, teksinput, tomboltebak);
        hbInput.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, judul, subjudul, hbInput, labelJumlah);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));
        root.setBackground(new Background(new BackgroundFill(
                Color.LIGHTBLUE.brighter(), CornerRadii.EMPTY, Insets.EMPTY
        )));

        tomboltebak.setOnAction(e -> {
            if (tomboltebak.getText().equals("Coba Tebak!")) {
                String teks = teksinput.getText().trim();
                if (!teks.matches("\\d+")) {
                    subjudul.setText("Masukkan angka yang valid!");
                    subjudul.setTextFill(Color.ORANGE);
                    return;
                }
                int tebak = Integer.parseInt(teks);
                percobaan++;
                labelJumlah.setText("Jumlah percobaan: " + percobaan);

                if (tebak < angka) {
                    subjudul.setText("Terlalu Kecil!");
                    subjudul.setTextFill(Color.ORANGE);
                } else if (tebak > angka) {
                    subjudul.setText("Terlalu Besar!");
                    subjudul.setTextFill(Color.ORANGE);
                } else {
                    subjudul.setText("Tebakan Benar!");
                    subjudul.setTextFill(Color.GREEN);
                    teksinput.setDisable(true);
                    tomboltebak.setText("Main Lagi");
                    tomboltebak.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;");
                }

            } else {
                resetGame();
                subjudul.setText("Masukkan Tebakanmu!");
                subjudul.setTextFill(Color.GRAY);
                labelJumlah.setText("Jumlah percobaan: " + percobaan);
                teksinput.clear();
                teksinput.setDisable(false);
                tomboltebak.setText("Coba Tebak!");
                tomboltebak.setStyle("-fx-background-color: #28a745; -fx-text-fill: white;");
            }
        });

        Scene scene = new Scene(root, 400, 300);
        stageutama.setTitle("Tebak Angka Advance");
        stageutama.setScene(scene);
        stageutama.show();
        Platform.runLater(() -> tomboltebak.requestFocus());
    }

    private void resetGame() {
        angka = ThreadLocalRandom.current().nextInt(1, 101);
        percobaan = 0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
