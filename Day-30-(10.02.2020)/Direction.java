// enum contains abstract methods
public enum Direction {        
    NORTH {
        @Override
        public String getInfo() {
            return NORTH.toString().toLowerCase();
        }
    },
    
    SOUTH {
        @Override
        public String getInfo() {
            return SOUTH.toString().toLowerCase();
        }
    },
    
    EAST {
        @Override
        public String getInfo() {
            return EAST.toString().toLowerCase();
        }
    },
    
    WEST {
        @Override
        public String getInfo() {
            return WEST.toString().toLowerCase();
        }
    };
    
    public abstract String getInfo(); //abstract method
    
    public static void main(String[] args) {
        Direction d = Direction.EAST;
        System.out.println(d.getInfo() + " is at index: " + d.ordinal());  //2
    }
}
