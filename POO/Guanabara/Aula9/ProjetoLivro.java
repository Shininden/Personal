package POO.Guanabara.Aula9;

public class ProjetoLivro 
{
    public static void main(String[] args) 
    {
        Pessoa[] people = new Pessoa[2];
        Livro[] books = new Livro[3];

        people[0] = new Pessoa("Barry", 25, "male");
        people[1] = new Pessoa("Jesse", 15, "female");

        books[0] = new Livro("PJO", "RR", 300, people[0]);
        books[1] = new Livro("MC", "RR", 340, people[1]);
        books[2] = new Livro("CK", "RR", 260, people[0]);

        books[0].open();
        books[0].skimOver(400);
        System.out.println(books[0].details());
    }
}
