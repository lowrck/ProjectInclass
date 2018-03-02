public class TheShapes {
static final double thePI = Math.PI;

double radius, height;

TheShapes() {
    radius = 1;
    height = 1;
}
TheShapes(double inRadius, double inHeight) {
    radius = inRadius;
    height = inHeight;
}
//this method was static, i removed the static part of it
double coneVolume() {
    return thePI * (radius * radius) * (height / 3.0);
}
//this method was static, i removed the static part of it
    double cylinderVolume() {
        return thePI * (radius * radius) * height;
    }
}

