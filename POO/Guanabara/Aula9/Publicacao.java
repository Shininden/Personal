package POO.Guanabara.Aula9;

public interface Publicacao 
{
    public abstract void open();
    public abstract void close();
    public abstract void skimOver(int amountOfpages);
    public abstract void nextPage();
    public abstract void previousPage();
}