package oop;

public class OopEX1Data {
    int width;
    int height;
    String square = isSquare();

    int calculateArea(){
        return width * height;
    }
    int calculatePerimeter(){
        return 2*width + 2*height;
    }
    String isSquare(){
        if(width == height){
            return "정사각형";
        }else{
            return "직사각형";
        }
    }
}
