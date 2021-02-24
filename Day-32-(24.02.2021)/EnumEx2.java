import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumEx2 {
    public static void main(String[] args) {
        EnumSet<Week> enumSet = EnumSet.of(Week.THURSDAY, Week.TUESDAY, Week.WEDNESDAY);
        Iterator<Week> it = enumSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        EnumMap<Week, String> enumMap = new EnumMap<Week, String>(Week.class);
        enumMap.put(Week.SUNDAY, "1");
        enumMap.put(Week.TUESDAY, "5");
        enumMap.put(Week.THURSDAY, "6");
        enumMap.put(Week.WEDNESDAY, "9");
        enumMap.put(Week.FRIDAY, "7");
        String day = enumMap.get(Week.FRIDAY);
        System.out.println(day);
    }
}