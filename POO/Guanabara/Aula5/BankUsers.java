package POO.Guanabara.Aula5;

public class BankUsers 
{
    public static void main(String[] args) 
    {
        ContaBanco user1 = new ContaBanco();
        user1.setNumConta(1111);
        user1.setUserName("Jubileu");
        user1.abrirConta("CC");


        ContaBanco user2 = new ContaBanco();
        user2.setNumConta(2222);
        user2.setUserName("Creuza");
        user2.abrirConta("CP");


        user1.deposit(100);
        user2.deposit(500);
        user2.withdraw(100);

        user1.withdraw(150);
        user1.fecharConta();

        user1.currentState();
        user2.currentState();
    }
}