package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    static class task extends JFrame
    {
        private int milanGoals=0;
        private int madridGoals=0;
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Atletico Madrid");
        JLabel resultLabel = new JLabel("Result: " + milanGoals + " X " + madridGoals);
        JLabel scorerLabel = new JLabel("Last Scorer: N/A");
        JLabel winnerLabel = new JLabel("Winner: DRAW");

        task() {
            super("task");
            setLayout(null);
            milanButton.setBounds(50,30,120,40);
            madridButton.setBounds(200,30,120,40);
            milanButton.setBackground(Color.RED);
            madridButton.setBackground(Color.YELLOW);
            resultLabel.setBounds(150,100,100,20);
            scorerLabel.setBounds(130,125,170,20);
            winnerLabel.setBounds(140,150,150,20);
            add(milanButton);
            milanButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    milanGoals += 1;
                    scorerLabel.setText("Last scorer: AC Milan");
                    resultLabel.setText("Result: "+ milanGoals + " X " + madridGoals);
                    if (madridGoals == milanGoals)
                        winnerLabel.setText("WINNER: DRAW");
                    else winnerLabel.setText(madridGoals > milanGoals ? "WINNER: Atletico Madrid" : "WINNER: AC Milan");
                }
            });
            add(madridButton);
            madridButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    madridGoals += 1;
                    scorerLabel.setText("Last scorer: Atletico Madrid");
                    resultLabel.setText("Result: "+ milanGoals + " X " + madridGoals);
                    if (madridGoals == milanGoals)
                        winnerLabel.setText("WINNER: DRAW");
                    else winnerLabel.setText(madridGoals > milanGoals ? "WINNER: Atletico Madrid" : "WINNER: AC Milan");
                }
            });

            add(resultLabel);
            add(scorerLabel);
            add(winnerLabel);
            setSize(400,250);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
    public static void main(String[]args)
    {
        new task();
    }

}