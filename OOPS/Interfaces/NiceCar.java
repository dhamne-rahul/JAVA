package OOPS.Interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player=new MediaPlayes();

    public NiceCar()
    {
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine)
    {
        this.engine=engine;
    }
    void start()
    {
        engine.start();
    }
    void stop()
    {
        engine.stop();
    }
    void startMedia()
    {
        player.start();
    }
    void stopMedia()
    {
        player.stop();
    }
}
