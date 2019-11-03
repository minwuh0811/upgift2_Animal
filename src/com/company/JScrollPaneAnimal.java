package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class JScrollPaneAnimal extends JFrame {
    private JPanel contentPane;
    private JScrollPane scrollPane;

    public void jScrollPaneJtext(JTextArea textArea) {
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(contentPane);
        scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        //scrollPane.add(textArea);
        scrollPane.setViewportView(textArea);
        this.setTitle("System Online");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 250, 200);
        this.setVisible(true);
    }
    }

