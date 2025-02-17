import java.util.Comparator;

public class MinionComparator implements Comparator<Minion> {

    @Override
    public int compare(Minion m1, Minion m2) {

        int result = m1.getName().compareTo(m2.getName());

        if (result != 0) {
            return result;
        }
        Integer age1 = m1.getAge();
        Integer age2 = m2.getAge();
        result = age1.compareTo(age2);

        if (result != 0) {
            return result;
        }

        return m2.getCity().compareTo(m1.getCity());
    }
}