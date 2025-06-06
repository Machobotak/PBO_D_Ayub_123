package com.praktikum.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Testing extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("belajar");


        /*
        Label lblangka1 = new Label("Angka 1");
        TextField in1 = new TextField();
        in1.setPromptText("Masukkan Angka");
        in1.setPrefWidth(50);

        Label lblangka2 = new Label("Angka 2");
        TextField in2 = new TextField();
        in2.setPromptText("Masukkan Angka");
        in2.setPrefWidth(50);

        VBox boxkiri = new VBox(10,lblangka1);
        boxkiri.getChildren().addAll(in1);

        VBox boxkanan = new VBox(10,lblangka2);
        boxkanan.getChildren().addAll(in2);

        Button tomboltambah = new Button("Jumlahkan");
        tomboltambah.setPrefWidth(80);
        Label lblHasil = new Label("Hasil: ");



        tomboltambah.setOnAction(e->{
            try {
                double angka1 = Double.parseDouble(in1.getText());
                double angka2 = Double.parseDouble(in2.getText());
                double hasil = angka1+angka2;
                lblHasil.setText("Hasil: "+hasil);
            }catch (NumberFormatException ex){
                lblHasil.setText("Input tidak valid");
            }
        });

        HBox boxtengah = new HBox(10,boxkiri,boxkanan);
        boxtengah.setAlignment(Pos.CENTER);
        VBox root = new VBox(10,boxtengah);
        root.getChildren().addAll(tomboltambah);
        root.getChildren().addAll(lblHasil);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10));
         */

        /*Label lbljeniskelamin = new Label("Pilih Jenis Kelamin");
        RadioButton rblk = new RadioButton("Laki-laki");
        RadioButton rbpr = new RadioButton("Perempuan");

        ToggleGroup genderGroup = new ToggleGroup();
            rblk.setToggleGroup(genderGroup);
            rbpr.setToggleGroup(genderGroup);

        Button btncek = new Button("Tampilkan Pilihan");
        Label hasil = new  Label();

        btncek.setOnAction(e->{
            RadioButton selected = (RadioButton) genderGroup.getSelectedToggle();
            if (selected != null){
                hasil.setText("Kamu memilih: "+selected.getText());
            }else{
                hasil.setText("Kamu belum memilih");
            }
        });

        VBox root = new VBox(10,lbljeniskelamin,rblk,rbpr,btncek,hasil);
        root.setPadding(new Insets(10));
        */

        /*
        Scene scene = new Scene(root,300,200);
        primaryStage.setTitle("Kalkulator penjumlahan");
        primaryStage.setScene(scene);
        primaryStage.show();

         */
    }

    public static void main(String[] args) {
        launch(args);
    }
}
