abstract class Mobile{

    abstract void Camera();

    abstract void Display();

    void Phone (){
        System.out.println("We Can Make Phone Calls");
    }
}

class Samsung extends Mobile{

    @Override
    void Camera(){
        System.out.println("This Mobile Has 8Mp Camera");
    }

    @Override
    void Display(){
        System.out.println("This Mobile Has 6,7 Inch Display");
    }
}

class Infinix extends Mobile{

    @Override
    void Camera(){
        System.out.println("This Mobile Offers 12MP Camera");
    }

    @Override
    void Display(){
        System.out.println("This Mobile Has 6.9Inch Curver Display");
    }

    void FingerPrint(){
        System.out.println("This Mbile Has A FingerPrint Sensor");
    }
}

public class Abstract_Class2 {
    public static void main (String[] args){
        Samsung s1 = new Samsung();
        s1.Display();
        s1.Camera();
        s1.Phone();
        System.out.println("-----------------------------");
        Infinix I1 = new Infinix();
        I1.Display();
        I1.Camera();
        I1.Phone();
        I1.FingerPrint();

    }
}
