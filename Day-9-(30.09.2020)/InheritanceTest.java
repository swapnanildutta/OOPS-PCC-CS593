//code to demonstrate inheritance
package test;

//superclass
class Area_Calc { 
    int l, b; //instance variables    
    Area_Calc(int l, int b) { //local variables
        //'this' is the reference of the current class
        this.l = l;
        this.b = b;
    }
    int compArea() {
        return l * b;
    }
}

//subclass
class Volume_Calc extends Area_Calc { 
    int h;
    Volume_Calc(int l, int b, int h) {
        super(l, b); //call to the super class constructor
        this.h = h;
    }
    int compVolume() {
        return l * b * h;
    }
}

public class InheritanceTest {
    //IS-A relationship
    public static void main(String[] args) {
        Area_Calc ac = new Area_Calc(15, 12); //object of superclass
        System.out.println("AREA1 = "+ac.compArea());
        Volume_Calc vc = new Volume_Calc(20, 15, 10); //object of subclass
        System.out.println("AREA2 = "+vc.compArea());
        System.out.println("VOLUME = "+vc.compVolume());
    }
}
