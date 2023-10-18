package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private double total1 = 0.0;
    private double total2= 0.0;
    private char operador;
    private JTextField textField;
    private JButton CEButton2;
    private JButton a0Button;
    private JButton equalsButton;
    private JButton raizButton1;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton pointButton;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton sumarButton;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button17;
    private JButton restaButton;
    private JButton multButton;
    private JButton divButton;
    private JPanel panel;




    public Calculator(){
        this.setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setResizable(false);

        a1Button.addActionListener(e -> {
            String button1text = a1Button.getText();
            textField.setText(textField.getText()+button1text);
        });
        a2Button.addActionListener(e -> {
            String button2text = a2Button.getText();
            textField.setText(textField.getText()+button2text);
        });
        a3Button.addActionListener(e -> {
            String button3text = a3Button.getText();
            textField.setText(textField.getText()+button3text);
        });
        a4Button.addActionListener(e -> {
            String button4text = a4Button.getText();
            textField.setText(textField.getText()+button4text);
        });
        a5Button.addActionListener(e -> {
            String button5text = a5Button.getText();
            textField.setText(textField.getText()+button5text);
        });
        a6Button.addActionListener(e -> {
            String button6text = a6Button.getText();
            textField.setText(textField.getText()+button6text);
        });
        a7Button.addActionListener(e -> {
            String button7text = a7Button.getText();
            textField.setText(textField.getText()+button7text);
        });
        a8Button.addActionListener(e -> {
            String button8text = a8Button.getText();
            textField.setText(textField.getText()+button8text);
        });
        a9Button.addActionListener(e -> {
            String button9text = a9Button.getText();
            textField.setText(textField.getText()+button9text);
        });
        a0Button.addActionListener(e -> {
            String button0text = a0Button.getText();
            textField.setText(textField.getText()+button0text);
        });


        sumarButton.addActionListener(e -> {
            String texto_boton = sumarButton.getText();
            getOperador(texto_boton);

        });

        equalsButton.addActionListener(e -> {
            switch (operador) {
                case '+' -> total2 = total1 + Double.parseDouble(textField.getText());
                case '-' -> total2 = total1 - Double.parseDouble(textField.getText());
                case '*' -> total2 = total1 * Double.parseDouble(textField.getText());
                case '/' -> total2 = total1 / Double.parseDouble(textField.getText());
            }
            textField.setText(Double.toString(total2));
            total1=0;

        });

        CEButton2.addActionListener(e -> {
            total2= 0;
            textField.setText("");

        });

        pointButton.addActionListener(e -> {
            if(textField.getText().equals("")){
               textField.setText("0. ");
            } else if (textField.getText().contains(".")) {
                pointButton.setEnabled(false);
            }else {
                String pointButtontext = textField.getText() + pointButton.getText();
                textField.setText(pointButtontext);
            }
            pointButton.setEnabled(true);

        });

        restaButton.addActionListener(e -> {
            String texto_boton = restaButton.getText();
            getOperador(texto_boton);

        });

        divButton.addActionListener(e -> {
            String texto_boton = divButton.getText();
            getOperador(texto_boton);

        });

        multButton.addActionListener(e -> {
            String texto_boton = multButton.getText();
            getOperador(texto_boton);

        });
    }
    private void getOperador(String textobutton){
        operador = textobutton.charAt(0);
        total1=total1+ Double.parseDouble((textField.getText()));
        textField.setText("");
    }


    public void load(){
        this.setVisible(true);
    }




}
