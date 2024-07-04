package POO.Guanabara.Aula8;

public class DadosLutador implements Lutador
{
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private int experience;
    private String category;
    private int victories;
    private int losses;
    private int draws;

    public DadosLutador(String name, String country, int age, double height, double weight, int experience, int victories, int losses, int draws) 
    {
        setName(name);
        setNationality(country);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setExperience(experience);
        setVictories(victories);
        setLosses(losses);
        setDraws(draws);
    }

    @Override
    public void status() 
    {
        System.out.println("Name: ".concat(getName()));
        System.out.println("Nationality: ".concat(getNationality()));
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Category: ".concat(getCategory()));
        System.out.println("Years of experience: " + getExperience());
        System.out.println("Victories: " + getVictories());
        System.out.println("Losses: " + getLosses());
        System.out.println("Draws: " + getDraws());
        System.out.println();
    }


    @Override
    public void winFight() {
        setVictories(1);
    }

    @Override
    public void loseFight() {
        setLosses(1);
    }

    @Override
    public void end_IN_Draw() {
        setDraws(1);
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }
    private void setWeight(double weight) 
    {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return this.category;
    }
    public void setCategory() 
    { 
        if(this.weight >= 52.2 && this.weight <= 70.3)
            this.category = "Light";
        
        else if(this.weight <= 83.9)
            this.category = "Medium";
        
        else if(this.weight <= 120.2)
            this.category = "Heavy";
        else
            this.category = "Invalid";
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getVictories() {
        return this.victories;
    }
    public void setVictories(int victories) {
        this.victories += victories;
    }

    public int getLosses() {
        return this.losses;
    }
    public void setLosses(int losses) {
        this.losses += losses;
    }

    public int getDraws() {
        return this.draws;
    }
    public void setDraws(int draws) {
        this.draws += draws;
    }
}