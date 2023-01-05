package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

public class Gravity extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    triangle(mouseX, mouseY, 0, 0, 50, 50);
  }

  public void mousePressed() {
    circle(mouseX, mouseY, 50);
  }

  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
