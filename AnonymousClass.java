//"An anonymous inner class is a class without a name that is declared and instantiated at the same time. It is mainly used when we need a one-time implementation of an interface or abstract class."


abstract class Animal3{
    abstract void Sound();
}



public class AnonymousClass {
    public static void main(String[] args){
        Animal3 a = new Animal3() {
            @Override
            void Sound(){
                System.out.println("From Inner Class");
            }
        };

        a.Sound();
    }
}
