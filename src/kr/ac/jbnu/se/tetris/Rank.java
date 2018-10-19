package kr.ac.jbnu.se.tetris;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Rank extends JFrame{

    JPanel jp = new JPanel(); // 패널 초기화
    JLabel jl = new JLabel("레이블"); // 레이블 초기화



    public Rank(){
        super("Test"); // JFrame의 생성자에 값을 입력하면 윈도창에 해당 값이 입력됩니다.

        jp.add(jl); // jp라는 패널에 jl라는 레이블 추가
        add(jp); // JFrame에 jp라는 패널 추가

        setRank();

        setSize(400, 300); // 윈도우의 크기 가로x세로
        setVisible(true); // 창을 보여줄떄 true, 숨길때 false
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 버튼을 눌렀을때 종료
    }

    public void setRank(){

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
            for(Integer v : highScore) {
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

    public String convertToMultiline(String orig)
    {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}



