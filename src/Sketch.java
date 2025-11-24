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
        
        timeOfDay();
        cityScape();

    }
    private void timeOfDay() {
    int i = (int) random(1, 100);  // random number to determine day or night

    if (i % 2 == 0) {
        // Daytime
        background(120, 197, 227);
    } else {
        // Nightime
        background(29, 25, 54);
    }
    }

 private void cityScape() {

        int x = 0;

        while (x < width) {
            int buildingWidth = (int) random(50, 120);
            int buildingHeight = (int) random(150, 350);
            int shade = (int) random(80, 200);

            // Buildings
            fill(shade);
            noStroke();
            rect(x, height - buildingHeight, buildingWidth, buildingHeight);

            // Windows
            buildingWindows(x, buildingWidth, buildingHeight);

            x += buildingWidth;
        }
    }

    












}



