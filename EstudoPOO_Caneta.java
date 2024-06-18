public class EstudoPOO_Caneta
{
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean ta_tampada;

    public void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta é: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.ta_tampada);
    }

    public void rabiscar()
    {
        if(this.ta_tampada == true)
            System.out.println("Error");
            
        else    
            System.out.println("Já tô");
    }

    protected void tampar() // Void Set
    {
        this.ta_tampada = true;
    }

    protected void destampar()
    {
        this.ta_tampada = false;
    }
}