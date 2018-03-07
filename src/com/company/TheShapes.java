public class TheShapes {
static final double thePI = Math.PI;

double radius, height, length, width;

TheShapes() {
    radius = 1;
    height = 1;
    length = 1;
    width = 1;
}
TheShapes(double inRadius) {
    radius = inRadius;
}
TheShapes(double inRadius, double inHeight) {
    radius = inRadius;
    height = inHeight;
}
TheShapes(double inLength, double inWidth, double inHeight) {
    length = inLength;
    height = inHeight;
    width = inWidth;
}

//this method was static, i removed the static part of it
double coneVolume() {
    return thePI * (radius * radius) * (height / 3.0);
}
//this method was static, i removed the static part of it
    double cylinderVolume() {
        return thePI * (radius * radius) * height;
    }
    double sphereVolume() {
       return (4/3.0) * thePI * Math.pow(radius, 3);
    }
    double pyramidVolume() {
      return  (length * width * height)/ 3.0;
    }
}

