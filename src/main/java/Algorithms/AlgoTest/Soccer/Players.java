package Algorithms.AlgoTest.Soccer;

public class Players implements Comparable<Players> {
    private  String name;
    private String family_name;
    private  int age;
    private  int height;


    public Players(String name, String family_name, int age, int height) {
        this.name = name;
        this.family_name = family_name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Players players) {
        return (this.getAge() < players.getAge() ? -1 :
                (this.getAge() == players.getAge() ? 0 : 1));
    }
}
