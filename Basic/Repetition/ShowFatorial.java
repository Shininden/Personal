package Basic.Repetition;
public class ShowFatorial
{
    public static void main(String[] args) 
    {
        CalculoFatorial calculadora_De_Fatoriais = new CalculoFatorial();

        calculadora_De_Fatoriais.setValue(5);
        System.out.print(calculadora_De_Fatoriais.getFormula_String());
        System.out.print(calculadora_De_Fatoriais.getFatorial());
    }
}

class CalculoFatorial 
{
    String formula_String = "";

    int last_value = 1;

    public void setValue(int number)
    {
        for (int c = number; c > 1; c--) 
        {
            last_value *= c;
            formula_String += c + " x ";
        }

        formula_String += "1 = ";
    }

    public String getFormula_String(){
        return formula_String;
    }
    
    public int getFatorial(){
        return last_value;
    }
}