import processing.core.PApplet;

public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(1000, 400);  // Canvas size
    }

    @Override
    public void setup() {
        // Draw your shapes here
        background(120, 197, 227);  // Cyan background colour
        float randomX;
        float randomY;
        float randomColour1;
        float randomColour2;
        float randomColour3;
        timeOfDay();

    }
    private void timeOfDay() {
    int i = (int) random(1, 100);  // random integer

    if (i % 2 == 0) {
        // Day
        background(120, 197, 227);
    } else {
        // Night
        background(29, 25, 54);
    }
}



    

    
    }

    /** Define additional methods below */



