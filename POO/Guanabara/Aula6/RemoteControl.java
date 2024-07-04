package POO.Guanabara.Aula6;

public class RemoteControl implements Controlador
{
    private int isTurnedOn;
    private int volume;
    private int isPlaying;

    public RemoteControl()
    {
        this.isTurnedOn = -1;
        this.volume = 50;
        this.isPlaying = -1;
    }

    private int isTurnedOn() {
        return isTurnedOn;
    }
    private void setTurnOn() {
        this.isTurnedOn *= -1;
    }

    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int volume) {
        this.volume += volume;
        if(this.volume < 0)
            this.volume = 0;
    }

    private int isPlaying() {
        return isPlaying;
    }
    private void setPlaying() {
        this.isPlaying *= -1;
    }

    @Override
    public void turnOn() 
    {
        this.setTurnOn();
    }

    @Override
    public void openMenu() 
    {
        System.out.println("--------MENU---------");
        if(this.isTurnedOn() == 1)
            System.out.println("Is turned on? true");
        else
            System.out.println("Is turned on? false");

        if(this.isPlaying() == 1)
            System.out.println("Is playing? true");
        else
            System.out.println("Is playing? false");
        
        System.out.print("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i++)
            System.out.print(" |");
    }

    @Override
    public void closeMenu() 
    {
       System.out.println("\nClosing Menu...");
    }

    @Override
    public void turnUp_Volume() 
    {
        if(this.isTurnedOn() == 1)
           this.setVolume(5);
        else    
            System.out.println("The TV is already turned off");
    }

    @Override
    public void turnDown_Volume() 
    {
       if(this.isTurnedOn() == 1)
          this.setVolume(-5);
       else    
          System.out.println("The TV is already turned off");
    }

    @Override
    public void mute() 
    {
        if(this.isTurnedOn() == 1 && this.getVolume() > 0)
            this.setVolume(-100);

        else if(this.isTurnedOn() == 1 && this.getVolume() == 0)
            this.setVolume(100);
    }

    @Override
    public void play_Or_pause() 
    {
        if(this.isTurnedOn() == 1 && this.isPlaying() == -1)
            this.setPlaying();
        
        else if(this.isTurnedOn() == 1 && this.isPlaying() == 1)
            this.isPlaying();
    }  
}