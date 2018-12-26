PImage rainbow;
PImage unicorn;
void setup () {
  rainbow = loadImage ("rainbow.png");
  size (800, 600);
  rainbow.resize (width, height);
  unicorn = loadImage ("Unicorn.png");
  unicorn.resize (100, 100);
}
void draw () { 
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}
