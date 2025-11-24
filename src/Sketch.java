import processing.core.PApplet;

public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }



     boolean isDay;
     int domeX;


    @Override
    public void settings() {
        size(1000, 400);  // Canvas size
    }

    @Override
    public void setup() {
        // Draw your shapes here
        background(120, 197, 227);  // Cyan background colour
        
        timeOfDay();
        sunMoon();
        cityScape();

    }



    
    
    private void timeOfDay() {
    int i = (int) random(1, 100);  // random number to determine day or night

    if (i % 2 == 0) {
        // Daytime
        background(120, 197, 227);
        isDay = true;
    } else {
        // Nightime
        background(29, 25, 54);
        isDay = false;
    }
    }

    private void sunMoon() {
        if (isDay) {
            // Sun
            fill(255, 247, 0);
            noStroke();
            ellipse(850, 80, 80, 80);
        } else {
            // Moon
            fill(240, 240, 255);
            noStroke();
            ellipse(850, 80, 80, 80);

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

    private void buildingWindows(int startX, int w, int h) {
    int windowSize = 10;
    int spacing = 7;

    for (int y = height - h + 20; y < height - 20; y += windowSize + spacing) {
        for (int x = startX + 10; x < startX + w - 10; x += windowSize + spacing) {

            fill(255, 230, 140);  // Windows
            rect(x, y, windowSize, windowSize);
        }
    }
}












}



