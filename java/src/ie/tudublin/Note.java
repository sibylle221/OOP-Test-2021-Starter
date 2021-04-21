package ie.tudublin;

import processing.core.PApplet;

public class Note {

   private int duration;
   private char note;

//generated constructor
public Note(int duration, char note) {
    this.duration = duration;
    this.note = note;
}

//generated toString
@Override
public String toString() {
    return "Note [duration=" + duration + ", note=" + note + "]";
}

//generated getters and setters
public int getDuration() {
    return duration;
}

public void setDuration(int duration) {
    this.duration = duration;
}

public char getNote() {
    return note;
}

public void setNote(char note) {
    this.note = note;
}


}//end


   

