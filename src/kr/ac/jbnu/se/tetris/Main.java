package kr.ac.jbnu.se.tetris;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 200, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 184, 361);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("PLAY");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.removeAll();
                new Tetris().setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 15));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(41, 245, 106, 23);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("RANKING");
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 15));
        btnNewButton_1.setBounds(41, 287, 106, 23);
        panel.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("OPTION");
        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setBackground(Color.BLACK);
        btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 15));
        btnNewButton_2.setBounds(41, 328, 106, 23);
        panel.add(btnNewButton_2);

        JLabel lblNewLabel = new JLabel("TETRIS");
        lblNewLabel.setBounds(41, 29, 106, 42);
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        panel.add(lblNewLabel);

        JLabel label = new JLabel("");
        label.setBounds(-8, -12, 200, 400);
        //label.setIcon(new ImageIcon(Main.class.getResource("/IMAGES/introimage.png")));
        label.setBackground(Color.black);
        panel.add(label);
    }
}