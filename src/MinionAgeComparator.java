import java.util.Comparator;
public class MinionAgeComparator implements Comparator<Minion> {
    @Override
    public int compare(Minion m1, Minion m2) {
        return Integer.compare(m1.getAge(), m2.getAge());
    }
}
