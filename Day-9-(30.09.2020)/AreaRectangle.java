class Area{ 
    int length, width;   
    Area(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int calArea() {
        return length * width;
    }
}

class Volume extends Area { 
    int height;
    Volume(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    int calVolume(){
        return length * width * height;
    }
}

public class AreaRectangle{
    public static void main(String[] args) {
        Area s = new Area(20, 8);
        System.out.println("Area  = "+s.calArea());
        Volume v = new Volume(20, 6, 5);
        System.out.println("Area 2 = "+v.calArea());
        System.out.println("Volume of Rectangle = "+v.calVolume());
    }
}