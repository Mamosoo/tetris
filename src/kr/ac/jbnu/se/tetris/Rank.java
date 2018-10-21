package kr.ac.jbnu.se.tetris;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Rank extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("label");


    public Rank() {
        super("Test");

        jp.add(jl);
        add(jp);

        setRank();
        setBounds(100, 100, 200, 400);
        jp.setBackground(Color.pink);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void setRank() {

        BufferedReader br;
        java.util.List<Integer> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("abc.txt"));

            String line = br.readLine();

            String[] split = line.split(" ");


            for (String num : split) {
                list.add(Integer.valueOf(num));
            }

            Collections.sort(list);
            Collections.reverse(list);

            java.util.List<Integer> highScore = new ArrayList<>();

            for (Object num : list.stream().distinct().toArray()) {
                highScore.add((int) num);
            }

            String s = "";
            int i = 1;
            for (Integer v : highScore) {
                s += i + "위 " + v + "\n";
                i++;
            }
            jl.setText(convertToMultiline(s));

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

}



