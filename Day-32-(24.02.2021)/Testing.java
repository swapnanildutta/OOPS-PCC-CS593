import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

enum Direction {
    NORTH, SOUTH, EAST, WEST;
}

public class Testing {

    public static void main(String[] args) {
        // EnumSet Example
        EnumSet<Direction> enumSet = EnumSet.of(Direction.NORTH, Direction.SOUTH);
        Iterator<Direction> it = enumSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // EnumMap Example
        EnumMap<Direction, String> enumMap = new EnumMap<Direction, String>(Direction.class);
        enumMap.put(Direction.NORTH, "1");
        enumMap.put(Direction.SOUTH, "2");
        enumMap.put(Direction.EAST, "3");
        enumMap.put(Direction.WEST, "4");

        String direction = enumMap.get(Direction.EAST);
        System.out.println(direction);
    }
}
