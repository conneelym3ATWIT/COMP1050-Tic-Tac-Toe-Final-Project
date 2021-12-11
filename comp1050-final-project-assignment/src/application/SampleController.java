package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class SampleController implements Initializable {
// A Button for each of the 9 Squares
	@FXML
	private Button Button1;

	@FXML
	private Button Button2;

	@FXML
	private Button Button3;

	@FXML
	private Button Button4;

	@FXML
	private Button Button5;

	@FXML
	private Button Button6;

	@FXML
	private Button Button7;

	@FXML
	private Button Button8;

	@FXML
	private Button Button9;

	@FXML
	private Text winnertext;

	private int turn = 0; // keeps track of how many turns

	private int count = 0;

	ArrayList<Button> buttons;

	@FXML 
	private ImageView drakeL;
	
	@FXML
	private ImageView drakeR;
	
	@FXML
	private ImageView walterL;
	
	@FXML
	private ImageView walterR;
	
	@FXML
	private ImageView emojiL;
	
	@FXML
	private ImageView emojiR;
	
	@FXML
	private ImageView sigma;
	
	@FXML
	private ImageView thanos;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		buttons = new ArrayList<>( // array for all buttons
			Arrays.asList(Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9));

		buttons.forEach(button -> {
			setupButton(button);
			button.setFocusTraversable(false); // allows correct mouse tracing
		});
	}

	@FXML
	void restartGame(ActionEvent event) { // resets game
		buttons.forEach(this::resetButton);

	}

	public void resetButton(Button button) {
		button.setDisable(false);
		winnertext.setText("Tic-Tac-Toe");
		button.setText("");
		turn = 0;
		count = 0;
		drakeL.setOpacity(0);
		drakeR.setOpacity(0);
		walterL.setOpacity(0);
		walterR.setOpacity(0);
		emojiL.setOpacity(0);
		emojiR.setOpacity(0);
		thanos.setOpacity(0);
		sigma.setOpacity(0);
	}

	private void setupButton(Button button) { // on mouse click it runs through multiple processes
		button.setOnMouseClicked(mouseEvent -> {
			count++;
			XorO(button);
			button.setDisable(true);
			checkIfGameIsOver(button);
		});
	}

	public void XorO(Button button) { // sets which player's turn it is
		if (turn % 2 == 0) {
			button.setText("X");
			turn = 1;
		} else {
			button.setText("O");
			turn = 0;
		}
	}

	public void checkIfGameIsOver(Button button) {
		String B = "X WINS!!!"; // String for X winning
		String C = "O WINS!!!"; // String for O winning
		String tie = "It's a TIE???"; // String for a tie
			if (Button1.getText() == "X" && Button2.getText() == "X" && Button3.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button4.getText() == "X" && Button5.getText() == "X" && Button6.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button7.getText() == "X" && Button8.getText() == "X" && Button9.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button1.getText() == "X" && Button4.getText() == "X" && Button7.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button2.getText() == "X" && Button5.getText() == "X" && Button8.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button3.getText() == "X" && Button6.getText() == "X" && Button9.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button1.getText() == "X" && Button5.getText() == "X" && Button9.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button3.getText() == "X" && Button5.getText() == "X" && Button7.getText() == "X") {
				winnertext.setText(B);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeL.setOpacity(100);
				walterR.setOpacity(100);
			}
			else if (Button1.getText() == "O" && Button2.getText() == "O" && Button3.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button4.getText() == "O" && Button5.getText() == "O" && Button6.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button7.getText() == "O" && Button8.getText() == "O" && Button9.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button1.getText() == "O" && Button4.getText() == "O" && Button7.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button2.getText() == "O" && Button5.getText() == "O" && Button8.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button3.getText() == "O" && Button6.getText() == "O" && Button9.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button1.getText() == "O" && Button5.getText() == "O" && Button9.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			}
			else if (Button3.getText() == "O" && Button5.getText() == "O" && Button7.getText() == "O") {
				winnertext.setText(C);
				Button1.setDisable(true);
				Button2.setDisable(true);
				Button3.setDisable(true);
				Button4.setDisable(true);
				Button5.setDisable(true);
				Button6.setDisable(true);
				Button7.setDisable(true);
				Button8.setDisable(true);
				Button9.setDisable(true);
				sigma.setOpacity(100);
				drakeR.setOpacity(100);
				walterL.setOpacity(100);
			} else if (count == 9) { // check for tie
				winnertext.setText(tie);
				thanos.setOpacity(100);
				emojiL.setOpacity(100);
				emojiR.setOpacity(100);
			}
		}
	
}