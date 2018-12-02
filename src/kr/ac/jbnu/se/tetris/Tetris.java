package kr.ac.jbnu.se.tetris;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

import sun.audio.*;

import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Tetris extends JFrame {

    JLabel statusbar1 = new JLabel("0", JLabel.CENTER);
    JLabel statusbar2 = new JLabel("0", JLabel.CENTER);

    Board board1 = new Board(statusbar1);
    JPanel score = new JPanel(new GridLayout(2, 1));
    Board board2 = new Board(statusbar2);


    public Tetris() {

        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;

        try {
            BGM = new AudioStream(new FileInputStream("/Users/Mamosoo/tetris/src/kr/ac/jbnu/se/tetris/resource/Hal_Final.wav"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        } catch (IOException error) {
            error.printStackTrace();
        }
        MGP.start(loop);

        //board1.setBackground(Color.pink);
        score.setBackground(Color.orange);
        board2.setBackground(Color.pink);


        JPanel panel = new JPanel(new GridLayout(1, 3));

        board1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Tetris.this.keyPressed(e);
            }
        });

        board2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Tetris.this.keyPressed(e);
            }
        });

        board1.start();
        board2.start();


        score.add(statusbar1);
        score.add(statusbar2);


        panel.add(board2);
        panel.add(score);
        panel.add(board1);

        add(panel);
        setSize(600, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }


    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();

        if (keycode == 'p' || keycode == 'P') {
            board1.pause();
            board2.pause();
            return;
        }

        if (board1.isPaused || board2.isPaused)
            return;

        switch (keycode) {
            case KeyEvent.VK_LEFT:
                board1.tryMove(board1.curPiece, board1.curX - 1, board1.curY);
                break;
            case KeyEvent.VK_RIGHT:
                board1.tryMove(board1.curPiece, board1.curX + 1, board1.curY);
                break;
            case KeyEvent.VK_DOWN:
                board1.oneLineDown();
                board1.guideDonw();
                break;
            case KeyEvent.VK_UP:
                board1.tryMove(board1.curPiece.rotateLeft(), board1.curX, board1.curY);
                board1.guideMove(board1.guidePiece.rotateLeft(),board1.curX,board1.curY);

                try {
                    AudioInputStream ais = AudioSystem.getAudioInputStream(new File("/Users/Mamosoo/tetris/src/kr/ac/jbnu/se/tetris/resource/ding.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.stop();
                    clip.open(ais);
                    clip.start();
                } catch (Exception ex) {

                }
                break;
            case KeyEvent.VK_SPACE:
                board1.dropDown();

                try {
                    AudioInputStream ais = AudioSystem.getAudioInputStream(new File("/Users/Mamosoo/tetris/src/kr/ac/jbnu/se/tetris/resource/gunshot.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.stop();
                    clip.open(ais);
                    clip.start();
                } catch (Exception ex) {

                }

                break;


            case 'a':
                board2.tryMove(board2.curPiece, board2.curX - 1, board2.curY);
                break;

            case 'A':
                board2.tryMove(board2.curPiece, board2.curX - 1, board2.curY);
                break;

            case 'd':
                board2.tryMove(board2.curPiece, board2.curX + 1, board2.curY);
                break;

            case 'D':
                board2.tryMove(board2.curPiece, board2.curX + 1, board2.curY);
                break;

            case 's':
                board2.oneLineDown();
                break;

            case 'S':
                board2.oneLineDown();
                break;

            case 'w':
                board2.tryMove(board2.curPiece.rotateLeft(), board2.curX, board2.curY);
                board2.guideMove(board2.guidePiece.rotateLeft(),board2.curX,board2.curY);

                try {
                    AudioInputStream kd = AudioSystem.getAudioInputStream(new File("/Users/Mamosoo/tetris/src/kr/ac/jbnu/se/tetris/resource/ding1.wav"));

                    Clip clip = AudioSystem.getClip();
                    clip.stop();
                    clip.open(kd);
                    clip.start();
                } catch (Exception ex) {

                }

                break;

            case 'W':
                board2.tryMove(board2.curPiece.rotateLeft(), board2.curX, board2.curY);
                board2.guideMove(board2.guidePiece.rotateLeft(),board2.curX,board2.curY);

                try {
                    AudioInputStream kd = AudioSystem.getAudioInputStream(new File("/Users/Mamosoo/tetris/src/kr/ac/jbnu/se/tetris/resource/ding1_1.wav"));

                    Clip clip = AudioSystem.getClip();
                    clip.stop();
                    clip.open(kd);
                    clip.start();
                } catch (Exception ex) {

                }

                break;

            case KeyEvent.VK_SHIFT:
                board2.dropDown();

                try {
                    AudioInputStream kd = AudioSystem.getAudioInputStream(new File("/Users/Mamosoo/tetris/src/kr/ac/jbnu/se/tetris/resource/gunshot1.wav"));

                    Clip clip = AudioSystem.getClip();
                    clip.stop();
                    clip.open(kd);
                    clip.start();
                } catch (Exception ex) {

                }


                break;

        }


    }


}