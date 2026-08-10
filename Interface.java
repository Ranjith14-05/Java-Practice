//"An interface in Java is a contract that defines what a class must implement. It is mainly used for abstraction and achieving multiple inheritance. A class uses the implements keyword to implement an interface."

class Phone{
    void Call(){
        System.out.println("Can Make Calls");
    }

    void sms(){
        System.out.println("Can Make SMS");
    }
}

interface Camers{
    void click();
    void record();
}

interface Player{
    void pause();
    void play();
}

class SmartPhone extends Phone implements Camers,Player{
    public void click(){
        System.out.println("Take A Photo");
    }

    public void record(){
        System.out.println("Start Recording");

    }

    public void pause(){
        System.out.println("Pause The Music");
    }

    public void play(){
        System.out.println("Play Music");
    }
}


public class Interface {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.Call();
        s1.sms();
        s1.click();
        s1.record();
        s1.pause();
        s1.play();
    }
}
