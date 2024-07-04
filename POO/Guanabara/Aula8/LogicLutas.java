package POO.Guanabara.Aula8;

public class LogicLutas 
{
    private DadosLutador desafiado;
    private DadosLutador desafiante;
    private int rounds;
    private boolean isApproved;

    public void marcarLuta(DadosLutador f1, DadosLutador f2)
    {
        if(f1.getCategory().equals(f2.getCategory()) && f1 != f2)
        {
            setApproved(true);
            setDesafiado(f1);
            setDesafiante(f2);

            fight();
        }
        else
        {
            setApproved(false);
            setDesafiado(null);
            setDesafiante(null);
            System.out.println("These fighters are imcompatible\n");
        }
    }

    private void fight()
    {
        if(isApproved() == true)
        {
            desafiado.status();
            desafiante.status();

            int winningProbabilty_F1 = ( ( (desafiado.getAge() - desafiante.getAge() * -1) - Math.abs(desafiado.getExperience() - desafiante.getExperience())) +
                                       ( (int) desafiado.getWeight() - (int) desafiante.getWeight()) + (int) (Math.random() * 101));

            int winningProbabilty_F2 = ( ( (desafiante.getAge() - desafiado.getAge() * -1) - Math.abs(desafiante.getExperience() - desafiado.getExperience())) +
                                       ( (int) desafiante.getWeight() - (int) desafiado.getWeight()) + (int) (Math.random() * 101));
            
            if(winningProbabilty_F1 == winningProbabilty_F2)
            {
                System.out.println("////////////////");
                System.out.println("DRAW!!!");
                System.out.println("////////////////");
                desafiado.end_IN_Draw();
                desafiante.end_IN_Draw();
            }
            else if(winningProbabilty_F1 > winningProbabilty_F2)
            {
                System.out.println("////////////////");
                System.out.println("Winner: ".concat(desafiado.getName()));
                System.out.println("The probability was: " + winningProbabilty_F1);
                System.out.println("////////////////");

                desafiado.winFight();
                desafiante.loseFight();
            }
            else
            {
                System.out.println("////////////////");
                System.out.println("Winner: ".concat(desafiante.getName()));
                System.out.println("The probability was: " + winningProbabilty_F2);
                System.out.println("////////////////");
                System.out.println();
                desafiante.winFight();
                desafiado.loseFight();
            }
        }
    }

    public DadosLutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(DadosLutador fighter) {
        this.desafiado = fighter;
    }

    public DadosLutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(DadosLutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return this.isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
}