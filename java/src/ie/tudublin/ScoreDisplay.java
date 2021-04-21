package ie.tudublin;

import java.util.ArrayList;

import ddf.minim.AudioOutput;
import ddf.minim.Minim;
import ddf.minim.signals.Oscillator;
import ddf.minim.ugens.Oscil;
//import ddf.minim
import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	ArrayList<Note> Notes = new ArrayList<Note>();

	//schtuff in here later

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	//used to populate ArrayList with contents of String score
	public void loadScore()
	{
		for(int j = 0; j < score.length(); j++)
        {
            result = score.charAt(j);
            println(result);
        }
	}

	public void printScores()
	{
		for (i<) 
            System.out.println("Number = " + number);
	}

	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
