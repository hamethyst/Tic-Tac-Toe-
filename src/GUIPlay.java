import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUIPlay extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton one, two, three, four, five, six, seven, eight, nine;
	private JPanel contentPanel;
	private String player1Choice = "X";
	private String player2Choice = "O";
	private String letter;
	private int count;
	
	public GUIPlay(){
		one = new JButton();
		two = new JButton();
		three = new JButton();
		four = new JButton();
		five = new JButton();
		six = new JButton();
		seven = new JButton();
		eight = new JButton();
		nine = new JButton();
		
		Dimension dim = new Dimension(155,155);
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		
		Play p = new Play();


		//show
		one.addActionListener(p); two.addActionListener(p); three.addActionListener(p); four.addActionListener(p);
		five.addActionListener(p); six.addActionListener(p); seven.addActionListener(p); eight.addActionListener(p); 
		nine.addActionListener(p);
		
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.PINK);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four); contentPanel.add(five);
		contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine);
		
		this.setContentPane(contentPanel);
	}
	
	private class Play implements ActionListener{
		
		//create board
		String[][] board = {  {"1","2","3"},
							  {"4","5","6"},
			                  {"7","8","9"}
		                    };
		
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			
			// who's turn?
			count++;
			if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9 )
				letter = player1Choice;
			else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10)
				letter = player2Choice;
				
			
			//player choice - show button
			if(src.equals(one)){
				one.setText(letter);
				one.setEnabled(false);
				board[0][0]= letter;
			}else if(src.equals(two)){
				two.setText(letter);
				two.setEnabled(false);
				board[0][1] = letter; 
			}else if(src.equals(three)){
				three.setText(letter);
				three.setEnabled(false);
				board[0][2] = letter;
			}else if(src.equals(four)){
				four.setText(letter);
				four.setEnabled(false);
				board[1][0] = letter;
			}else if(src.equals(five)){
				five.setText(letter);
				five.setEnabled(false);
				board[1][1] = letter;
			}else if(src.equals(six)){
				six.setText(letter);
				six.setEnabled(false);
				board[1][2] = letter;
			}else if(src.equals(seven)){
				seven.setText(letter);
				seven.setEnabled(false);
				board[2][0] = letter;
			}else if(src.equals(eight)){
				eight.setText(letter);
				eight.setEnabled(false);
				board[2][1] = letter;
			}else if(src.equals(nine)){
				nine.setText(letter);
				nine.setEnabled(false);
				board[2][2] = letter;
			}
			
			
			//determine winner
			if((board[0][0] == player1Choice && board[1][0] == player1Choice && board[2][0] == player1Choice) || //vertical
				(board[0][1] == player1Choice && board[1][1] == player1Choice && board[2][1] == player1Choice) ||
				(board[0][2] == player1Choice && board[1][2] == player1Choice && board[2][2] == player1Choice) ||
				(board[0][0] == player1Choice && board[0][1] == player1Choice && board[0][2] == player1Choice) || //horizontal
				(board[1][0] == player1Choice && board[1][1] == player1Choice && board[1][2] == player1Choice) ||
				(board[2][0] == player1Choice && board[2][1] == player1Choice && board[2][2] == player1Choice) ||
				(board[0][0] == player1Choice && board[1][1] == player1Choice && board[2][2] == player1Choice) || //diagonal
				(board[0][2] == player1Choice && board[1][1] == player1Choice && board[2][0] == player1Choice)){
				JOptionPane.showMessageDialog(null, "Player One wins!");
			}else if((board[0][0] == player2Choice && board[1][0] == player2Choice && board[2][0] == player2Choice) || //vertical
					(board[0][1] == player2Choice && board[1][1] == player2Choice && board[2][1] == player2Choice) ||
					(board[0][2] == player2Choice && board[1][2] == player2Choice && board[2][2] == player2Choice) ||
					(board[0][0] == player2Choice && board[0][1] == player2Choice && board[0][2] == player2Choice) || //horizontal
					(board[1][0] == player2Choice && board[1][1] == player2Choice && board[1][2] == player2Choice) ||
					(board[2][0] == player2Choice && board[2][1] == player2Choice && board[2][2] == player2Choice) ||
					(board[0][0] == player2Choice && board[1][1] == player2Choice && board[2][2] == player2Choice) || //diagonal
					(board[0][2] == player2Choice && board[1][1] == player2Choice && board[2][0] == player2Choice)){
					JOptionPane.showMessageDialog(null, "Player Two wins!");
				}else if(count >= 9){
					JOptionPane.showMessageDialog(null, "Tie! No one wins.");
				}
			
			
			}
		}
	}
	

	

			