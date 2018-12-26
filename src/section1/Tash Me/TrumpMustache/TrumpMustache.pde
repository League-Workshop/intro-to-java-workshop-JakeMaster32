PImage mustache;
PImage trump;
void setup () {
mustache = loadImage ("Mustache.png");
trump = loadImage ("Trump.jpg");
size (800,600);
trump.resize (width,height);
}
void draw () {
image(mustache, 200,200);

background (trump);
}
