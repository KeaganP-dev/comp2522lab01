package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * an example program that draws a simple image to the screen.
 *
 * @author keagan
 *
 * @version 1.0
 */
public class Window extends PApplet {

  /**
   * settings for the Applet window, sets width and height.
   */
  public void settings() {
    size(500, 500);
  }

  /**
   * draws something to the screen.
   */
  public void draw() {
    background(0, 153, 255);

    //mountains
    fill(102, 102, 153);
    triangle(240, 450, 440, 450, 340, 200);
    triangle(300, 450, 500, 450, 400, 250);
    triangle(200, 450, 400, 450, 300, 225);
    triangle(350, 450, 550, 450, 450, 250);

    //background hills
    fill(0, 153, 51);
    ellipse(0, 520, 500, 200);
    ellipse(300, 510, 500, 200);

    //background tree trunks
    fill(102, 51, 0);
    rect(30, 370, 20, 100);
    rect(70, 400, 15, 100);
    rect(110, 385, 25, 100);

    //background tree leaves
    fill(0, 102, 0);
    triangle(10, 420, 70, 420, 40, 290);
    triangle(55, 400, 100, 400, 77, 300);
    triangle(90, 410, 155, 410, 122, 320);

    //foreground hills
    fill(0, 153, 51);
    ellipse(500, 530, 500, 200);
    ellipse(200, 520, 500, 200);

    //sun
    fill(255, 255, 0);
    circle(100, 100, 100);

    //clouds
    fill(204, 204, 255);
    ellipse(220, 105, 200, 75);
    ellipse(400, 135, 200, 75);


  }

  /**
   * function that gets called when mouse is pressed.
   */
  public void mousePressed() {
    circle(mouseX, mouseY, 50);
  }

  /**
   * drives the program.
   *
   * @param args unused
   */

  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
