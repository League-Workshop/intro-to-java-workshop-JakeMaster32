int x = 430,y = 365;
PImage catPic;
void setup () {
  noStroke();
  size(1000, 800);
  catPic = loadImage("cat.jpg");
  catPic.resize(width, height);
  background(catPic);
}
void draw () {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  fill(#FF0A0A);
  ellipse(x, y, 40, 40);
 ellipse(x + 175, y, 40, 40);
}
void keyPressed() {
  x+=5;y+=5;
}
