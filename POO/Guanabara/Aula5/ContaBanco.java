package POO.Guanabara.Aula5;

public class ContaBanco
{
    public int numConta;
    protected String tipoConta;
    private String userName;
    private int balance;
    private boolean isOpen;

    public ContaBanco()
    {
        this.isOpen = false;
        this.balance = 0;
    }

    public void currentState()
    {
        System.out.println("---------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getUserName());
        System.out.println("Saldo: " + this.getBalance());
        System.out.println("Status: " + this.getisOpen());
    }



    public void abrirConta(String tipo)
    {
        setTipoConta(tipo);
        setOpen(true);

        if(tipo.equalsIgnoreCase("CC"))
            this.balance += 50;
            
        else if(tipo.equalsIgnoreCase("CP"))
            this.balance += 150;
        
    }
    public void fecharConta()
    {
        if(this.balance > 0)
            System.out.println("You have money, so you can't close");
        
        else if(this.balance < 0)
            System.out.println("Cê ainda tá devendo safado[a]");
        
        else
        {
            this.isOpen = false; 
            System.out.println("Conta fechada");
        }       
    }

    public void deposit(int depositedValue)
    {
        if(isOpen)
        {
            this.balance += depositedValue;
            System.out.println("Depósito realizado na conta de " + this.getUserName());
        }
        else
            System.out.println("Erro, sua conta está fechada");
    }
    public void withdraw(int requestedValue)
    {
        if(isOpen)
        {
            this.balance -= requestedValue;  

            if(this.balance > 0)
                System.out.println("Saque realizado na conta de " + this.getUserName());

            else
                System.out.println("You don't have that much");
        }
        else    
            System.out.println("Impossible to withdraw with a closed account");
    }



    public void pagarMensalidade()
    {
        if(isOpen && balance > 20 || balance > 12)
        {
            if(this.tipoConta.equalsIgnoreCase("CC"))
            {
                this.balance -= 12;
                System.out.println("Mensalidade paga por " + getUserName());
            }
            
            else if(this.tipoConta.equalsIgnoreCase("CP"))
            {
                this.balance -= 20;
                System.out.println("Mensalidade paga por " + getUserName());
            } 
        }
        else    
            System.out.println("It's impossible to pay for a closed account");
    }

    public void setNumConta(int num){
        this.numConta = num;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setTipoConta(String tipo){
        this.tipoConta = tipo;
    }
    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setUserName(String name){
        this.userName = name;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setBalance(int total){
        this.balance = total;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public boolean getisOpen() {
        return this.isOpen;
    }  
}