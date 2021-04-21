package ie.tudublin;

import java.util.ArrayList;

/*
import ddf.minim.AudioOutput;
import ddf.minim.Minim;
import ddf.minim.signals.Oscillator;
import ddf.minim.ugens.Oscil;
import ddf.minim.ugens.Instrument;
*/
import processing.core.PApplet;

public class ScoreDisplay extends PApplet {
	String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();

	public void settings() {
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48)
		println(i);
	}

	// used to populate ArrayList with contents of String score
	public void loadScore()
	{
		for (int i = 0; i < score.length(); i++) {
            if (i + 1 >= score.length()) {
                char a = score.charAt(i);
                Note note = new Note(a, 1);
                notes.add(note);
            }
            else 
            {
                char a = score.charAt(i);
                if (Character.isDigit(score.charAt(i + 1))) {
                    Note note = new Note(a, 2);
                    notes.add(note);
                    i++;
                }
                else {
                    Note note = new Note(a, 1);
                    notes.add(note);
                }
            }
        }

	}

	public void printScores() {

		for (int i = 0; i < notes.size(); i++) {
			Note currentNote = notes.get(i); // returns Array element at index i
			System.out.println(currentNote.toString()); // prints element
		}
	}

	public void setup() {
		loadScore();
	}

	public void draw() {
		background(255);

	}

	void drawNotes() {
	}
}
