package POO.Guanabara.Aula8;

public class Lutas 
{
    public static void main(String[] args) 
    {
        DadosLutador fighters[] = new DadosLutador[3];

        fighters[0] = new DadosLutador("Pretty Boy", "France", 31, 1.75, 68.9, 5, 11, 2, 1);

        fighters[1] = new DadosLutador("Neerder", "France", 19, 1.65, 60, 2, 4, 2, 7);

        LogicLutas uec1 = new LogicLutas();

        uec1.marcarLuta(fighters[0], fighters[1]);
        fighters[0].status();
        fighters[1].status();
    }
}