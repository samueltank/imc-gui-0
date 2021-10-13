package br.senai.sp.jandira.imcg.ui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tela
{
    public void criarTela()
    {
        JFrame telaIcm = new JFrame();
        telaIcm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o programa quando a janela é fechada;
        telaIcm.setSize(300, 400);
        telaIcm.setTitle("Calculadora de IMC");
        telaIcm.setLayout(null);

        // criar um label:
        JLabel labelIdade = new JLabel("Qual a sua idade?"); // deve contar o prefixo lbl ou label;
        labelIdade.setBounds(20, 10, 120, 30);
        JLabel labelResultado = new JLabel("Resultado aqui!");
        labelResultado.setBounds(20, 60, 150, 24);

        // criação do jtext:
        JTextField textFieldIdade = new JTextField();
        textFieldIdade.setBounds(20, 35, 100, 24);

        // criar um botão:
        JButton buttonVerificar = new JButton();
        buttonVerificar.setText("Verificar");
        buttonVerificar.setBounds(125, 35, 100, 24);

        // colocar o label na área de conteúdo:
        telaIcm.getContentPane().add(labelIdade);
        telaIcm.getContentPane().add(buttonVerificar);
        telaIcm.getContentPane().add(textFieldIdade);
        telaIcm.getContentPane().add(labelResultado);

        telaIcm.setVisible(true); // sempre no final do código;

        // definir ouvinte(listener) do click do mouse:
        textFieldIdade.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) // a variável e guarda o valor do evento do mouse;
            {
                System.out.println("Clicou!");
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                System.out.println("Apertou!");
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                System.out.println("Soltou!");
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("Entrou!");
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Saiu!");
            }
        });
        textFieldIdade.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                System.out.println("apertou a tecla " + e.getKeyChar() + " qualquer!");
                System.out.println(e.getExtendedKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println("tecla " + e.getKeyChar() + " pressionada!");
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                System.out.println("Tecla solta!");
            }
        });
    }
}
