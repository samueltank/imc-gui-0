package br.senai.sp.jandira.imcg.ui;

import br.senai.sp.jandira.imcg.model.ValorIMC_pessoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tela {
    public void criarTela() {

        Font titleFont = new Font("Arial", Font.BOLD, 28);
        // Criação do objeto pessoaIMC:
        ValorIMC_pessoa samuel = new ValorIMC_pessoa();

        JFrame telaIcm = new JFrame();
        telaIcm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*  <- fecha o
        programa quando a janela é fechada; */
        telaIcm.setSize(280, 400);
        telaIcm.setTitle("Calculadora de IMC");
        telaIcm.setLayout(null);

        // criar um label:
        JLabel lableTitle = new JLabel("Calcular I.M.C");
        lableTitle.setFont(titleFont);
        lableTitle.setForeground(Color.BLUE);
        lableTitle.setBounds(15, 20, 500, 80);
        JLabel labelAltura = new JLabel("Qual a sua Altura?"); /* <- deve
        acrescentar o prefixo lbl ou label; */
        labelAltura.setBounds(15, 105, 120, 30);
        JLabel labelPeso = new JLabel("Qual o seu peso?");
        labelPeso.setBounds(15, 155, 120, 30);
        JLabel labelIMC = new JLabel("Seu I.M.C: ");
        labelIMC.setBounds(15, 260, 150, 24);
        JLabel labelSaida = new JLabel("Sua situação: ");
        labelSaida.setBounds(15, 294, 150, 24);

        // criação do jtext:
        JTextField textFieldAltura = new JTextField();
        textFieldAltura.setBounds(145, 110, 100, 24);
        JTextField textFieldPeso = new JTextField();
        textFieldPeso.setBounds(145, 160, 100, 24);


        // criar um botão:
        JButton buttonVerificar = new JButton();
        buttonVerificar.setText("Calcular");
        buttonVerificar.setBounds(70, 210, 120, 35);

        // colocar o label na área de conteúdo:
        telaIcm.getContentPane().add(lableTitle);
        telaIcm.getContentPane().add(labelAltura);
        telaIcm.getContentPane().add(labelPeso);
        telaIcm.getContentPane().add(buttonVerificar);
        telaIcm.getContentPane().add(textFieldAltura);
        telaIcm.getContentPane().add(textFieldPeso);
        telaIcm.getContentPane().add(labelIMC);
        telaIcm.getContentPane().add(labelSaida);

        telaIcm.setVisible(true); // sempre no final do código;

        // definir ouvinte(listener) do click do mouse:
        buttonVerificar.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {
                samuel.calcular(textFieldAltura.getText(), textFieldPeso.getText());
                labelIMC.setText(samuel.getIMC_String());
                labelSaida.setText(samuel.CalcularSaidaText());
            }

            @Override public void mousePressed(MouseEvent e) {

            }

            @Override public void mouseReleased(MouseEvent e) {

            }

            @Override public void mouseEntered(MouseEvent e) {

            }

            @Override public void mouseExited(MouseEvent e) {

            }
        });
    }
}
