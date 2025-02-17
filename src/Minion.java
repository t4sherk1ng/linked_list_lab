public class Minion {
    private String name;
    private int age;
    private int id;
    private String city;

    public Minion(String name, int age, int id, String city) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Minion minion = (Minion) obj;
        return age == minion.age && name.equals(minion.name);
    }

    @Override
    public String toString() {
        return "Minion{name='" + name + "', age=" + age + "}";
    }
}