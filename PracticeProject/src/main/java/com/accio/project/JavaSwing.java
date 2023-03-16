package com.accio.project;

import java.awt.Color;

import javax.swing.JFrame;

/*
 * @Amresh Tripathy
 */

public class JavaSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
//		frame.getContentPane().setBackground(Color.decode("#ffff"));
		
		frame.setLocation(200, 100);
		frame.setSize(800, 600);
		frame.setTitle("Introduction");
//		frame.setBackground(Color.CYAN);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
