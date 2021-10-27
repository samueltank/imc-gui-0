package br.senai.sp.jandira.imcg.ui;

import br.senai.sp.jandira.imcg.model.ValorIMC_pessoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tela {
    public void criarTela() {

        // Criação de fontes:
        Font titleFont = new Font("Arial", Font.BOLD, 28);
        Font status = new Font("Arial", Font.ITALIC, 18);

        // Criação do objeto pessoaIMC:
        ValorIMC_pessoa samuel = new ValorIMC_pessoa();

        // Criação do objeto janela:
        JFrame telaIMC = new JFrame();
        telaIMC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*  <- fecha o
        programa quando a janela é fechada; */
        telaIMC.setSize(350, 400);
        telaIMC.setTitle("Calculadora de IMC");
        telaIMC.setLayout(null);

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
        JLabel lblOutputIMC = new JLabel(" ");
        lblOutputIMC.setFont(status);
        lblOutputIMC.setForeground(Color.green);
        lblOutputIMC.setBounds(140, 260, 150, 24);
        JLabel lblOutputStatus = new JLabel(" ");
        lblOutputStatus.setFont(status);
        lblOutputStatus.setForeground(Color.green);
        lblOutputStatus.setBounds(140, 295, 200, 24);

        // criação do jtext:
        JTextField textFieldAltura = new JTextField();
        textFieldAltura.setBounds(140, 110, 100, 24);
        JTextField textFieldPeso = new JTextField();
        textFieldPeso.setBounds(140, 160, 100, 24);


        // criar um botão:
        JButton buttonVerificar = new JButton();
        buttonVerificar.setText("Calcular");
        buttonVerificar.setBounds(50, 210, 150, 35);

        // colocar o label na área de conteúdo:
        telaIMC.getContentPane().add(lableTitle);
        telaIMC.getContentPane().add(labelAltura);
        telaIMC.getContentPane().add(labelPeso);
        telaIMC.getContentPane().add(buttonVerificar);
        telaIMC.getContentPane().add(textFieldAltura);
        telaIMC.getContentPane().add(textFieldPeso);
        telaIMC.getContentPane().add(labelIMC);
        telaIMC.getContentPane().add(labelSaida);
        telaIMC.getContentPane().add(lblOutputIMC);
        telaIMC.getContentPane().add(lblOutputStatus);

        telaIMC.setVisible(true); // sempre no final do código;

        // definir ouvinte(listener) do click do mouse:
        buttonVerificar.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {
                samuel.calculate(textFieldAltura.getText(), textFieldPeso.getText());
                lblOutputIMC.setText(samuel.getResultIMC());
                lblOutputStatus.setText(samuel.CalcularSaidaText());
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
