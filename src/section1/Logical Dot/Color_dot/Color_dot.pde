void setup () {
  size (1000, 1000);
}
void draw () {
  fill (#03CAFA);
  ellipse (500, 500, 100, 100);
  if (mousePressed) {
    fill (#FA0B03);
  }
  ellipse (500, 500, 100, 100);
}
