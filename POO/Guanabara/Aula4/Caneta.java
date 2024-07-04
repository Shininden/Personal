package POO.Guanabara.Aula4;

public class Caneta
{
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean ta_tampada;
    

    public Caneta()
    {
        this.tampar();
        this.cor = "Azul";
    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }


    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }


    public void tampar()
    {
        this.ta_tampada = true;
    }
    public void destampar()
    {
        this.ta_tampada = false;
    }


    public void status()
    {
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor " + this.cor);
        System.out.println("Tamapada: " + this.ta_tampada);
    }
}