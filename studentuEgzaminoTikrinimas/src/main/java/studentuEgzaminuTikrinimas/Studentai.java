package studentuEgzaminuTikrinimas;

public class Studentai implements Comparable<Studentai> {

    private int id;
    private String name;
    private String lastName;

    public Studentai() {
    }

    public Studentai(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Studentas{" +
                "Nr. " + id +
                ", vardas" + name + '\'' +
                ", pavarde'" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Studentai o) {
        int a = this.getName().compareTo(o.getLastName());
        if (a != 0) {
            return a;
        }
        int b = this.getName().compareTo(o.getLastName());
        if (b != 0) {
            return b;
        }
        return this.getId() - o.getId();
    }
}

