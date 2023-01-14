package com.emregecer.designpatterns.creational.factorymethod.example1.buttons;

import javax.swing.*;
import java.awt.*;

/**
 * One more concrete product
 * Windows button implementation.
 */
public class WindowsButton implements Button {

    private JPanel panel;
    private JFrame frame;
    private JButton button;

    public WindowsButton() {
        this.panel = new JPanel();
        this.frame = new JFrame();
    }

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }
}
