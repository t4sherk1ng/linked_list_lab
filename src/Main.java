import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Task 1********");

        Minion minion1 = new Minion("Bob", 1, 1, "Vorkuta");
        Minion minion2 = new Minion("Kevin", 7, 2, "Vladimir");
        Minion minion3 = new Minion("Stuart", 3, 3, "Moscow");

        Stack<Minion> minions1 = new Stack<>();
        minions1.push(minion1);
        minions1.push(minion2);
        minions1.push(minion3);

        while (!minions1.isEmpty()) {
            Minion minion = minions1.pop();
            System.out.println(minion);
        }

        System.out.println(minions1.isEmpty());

        System.out.println("********Task 2********");

        Minion minion4 = new Minion("Fil", 30, 4, "Norilsk");
        Minion minion5 = new Minion("Cole", 10, 5, "Ekaterinburg");
        Minion minion6 = new Minion("Dock", 16, 6, "Novosibirsk");

        DoublyLinkedList<Minion> minionDoublyLinkedList = new DoublyLinkedList<>();
        minionDoublyLinkedList.add(minion4);
        minionDoublyLinkedList.add(minion5);
        minionDoublyLinkedList.add(minion6);

        System.out.println("индекс 0" + minionDoublyLinkedList.get(0));
        System.out.println("индекс 1" + minionDoublyLinkedList.get(1));
        System.out.println("индекс 2" + minionDoublyLinkedList.get(2));

        System.out.println("Iterator");
        Iterator<Minion> iterator = minionDoublyLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Foreach");
        minionDoublyLinkedList.print();

        System.out.println("********Task 3********");

        List<Minion> minions = new ArrayList<>();
        minions.add(minion1);
        minions.add(minion2);
        minions.add(minion3);
        minions.add(minion4);

        System.out.println("Несортированный список");
        for (Minion minion : minions) {
            System.out.println(minion);
        }

        minions.sort(new MinionNameComparator());

        System.out.println("Отсортированный список");
        for (Minion minion : minions) {
            System.out.println(minion);
        }

        System.out.println("Несортированный список");
        for (Minion minion : minions) {
            System.out.println(minion);
        }

        minions.sort(new MinionAgeComparator());

        System.out.println("Отсортированный список");
        for (Minion minion : minions) {
            System.out.println(minion);
        }

        List<Minion> minionsss = new ArrayList<>();
        minionsss.add(minion1);
        minionsss.add(minion2);
        minionsss.add(minion3);
        minionsss.add(minion4);
        minionsss.add(minion5);
        minionsss.add(minion6);
        System.out.println("Несортированный список");
        for (Minion minion : minionsss) {
            System.out.println(minion);
        }
        System.out.println("Отсортированный список");
        Collections.sort(minionsss, new MinionComparator());
        for (Minion minion : minionsss) {
            System.out.println(minion);
        }
    }
}