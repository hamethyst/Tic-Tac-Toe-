import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
			Object[] options = {"Yes", "No"};
			int n = JOptionPane.showOptionDialog(null, "Do you want to play tic tac toe?", null, JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,null, options,options[1]);
			
				if(n == 0){
				GUIPlay g = new GUIPlay();
				g.setSize(505, 525);
				g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				g.setVisible(true);
				g.setResizable(false);
			}else{
				System.exit(0);
			}

	
	}

}
