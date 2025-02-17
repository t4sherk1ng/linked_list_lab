import java.util.Comparator;

public class MinionNameComparator implements Comparator<Minion> {
    @Override
    public int compare(Minion m1, Minion m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
