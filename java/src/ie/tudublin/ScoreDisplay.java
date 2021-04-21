package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	 String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();

	public void settings()
	{
		size(1500, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48)
		println(i);
	}

	// used to populate ArrayList with contents of String score
	public void loadScore()
	{
		for (int i = 0; i < score.length(); i++)
		{

			if (i + 1 >= score.length())
			{
                char a = score.charAt(i);
                Note note = new Note(a, 1);
                notes.add(note);
			}
			
            else 
            {
				char a = score.charAt(i);
				
				//checking if character is a number				
				if (Character.isDigit(score.charAt(i + 1)))
				{
                    Note note = new Note(a, 2);
                    notes.add(note);//add to the ArrayList
                    i++;
				}
				
				else
				{
                    Note note = new Note(a, 1);
                    notes.add(note);//add to the ArrayList
                }
            }
        }

	}

	public void printScores()
	{

		for (int i = 0; i < notes.size(); i++)
		{
			Note currentNote = notes.get(i); // gets element at index 1 of Array
			System.out.println(currentNote.toString()); // prints the element
		}
	}

	public void setup()
	{
		loadScore();
	}

	public void draw()
	{
		background(255); //white background
		strokeWeight(3); //how thick the lines drawn are
		//lines for the staves
		line(50, 150, 1300, 150);
		line(50, 200, 1300, 200);
		line(50, 250, 1300, 250);
		line(50, 300, 1300, 300);
		line(50, 350, 1300, 350);
		drawNotes();

	}

	void drawNotes()
	{
		int x = 140; //starting x position
		for (int i = 0; i < notes.size(); i++, x+=60)
		{ //loop through ArrayList
			Note note = notes.get(i);
			int y = noteYPos(note.getNote()); //get y value from function
			if (mouseX > x - 20 && mouseX < x + 20)
			{ //when mouse's position on the x axis is between notes, highlight the note red
				fill(255, 0, 0);
			}

			//crochet notes
			if (note.getDuration() == 1)
			{ 
				circle(x, y, 40);
				fill(0);
				line(x+20, y, x+20, y-80);
				//displays right note
				textSize(26);
				text(note.getNote(), x - 5, 100);
			}
			
			//quaver notes
			else
			{ 
				circle(x, y, 40);
				fill(0);
				line(x+20, y, x+20, y-90);
				//additional line for quaver notation
				line(x+20, y-90, x+35, y-80);
				textSize(25);
				text(note.getNote(), x - 5, 100);
			}
		}
	}

	int noteYPos(char note)
	{ //y position for notes
		if (note == 'D') return 375;
		else if (note == 'E') return 350;
		else if (note == 'F') return 325;
		else if (note == 'G') return 300;
		else if (note == 'A') return 275;
		else if (note == 'B') return 250;
		else if (note == 'c') return 225;
		else if (note == 'd') return 200;
		else return -1;
	  }
}
