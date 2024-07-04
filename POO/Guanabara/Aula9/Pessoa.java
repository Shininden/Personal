package POO.Guanabara.Aula9;

public class Pessoa 
{
    private String name;
    private int age;
    private String gender;


    public Pessoa(String name, int age, String gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void haveBirthday()
    {
        setAge(1);
        System.out.println("Today's my birthday, now I'm " + getAge() + " years old");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age += age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}