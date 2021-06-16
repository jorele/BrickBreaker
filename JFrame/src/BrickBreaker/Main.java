package BrickBreaker;

/** Jorel Rutger
 *  06/12/21
 *  @author rutgerj001
 *  For Java Game application, you will follow the same procedure. Prepare a report that includes:
    (1) Java Game Specification : An algorithm or Flowchart
    (2) Pseudocode (code design)
    (3) Implementation (Writing code)
	(4) Application testing and debugging
 */

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		// jframe window properties
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true);
		
	}
}
