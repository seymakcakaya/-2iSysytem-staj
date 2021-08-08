import akka.actor.typed.ActorSystem;


public class Main {
    public static void main(String[] args){
        akka.actor.typed.ActorSystem<HelloWorld.Command> mySystem=ActorSystem.create(HelloWorld.create(),"MySystem");

        mySystem.tell(HelloWorld.SayHello.INSTANCE);
        mySystem.tell(HelloWorld.SayHello.INSTANCE);

        mySystem.tell(new HelloWorld.ChangeMessage("hello actor worls"));

        mySystem.tell(HelloWorld.SayHello.INSTANCE);
        mySystem.tell(HelloWorld.SayHello.INSTANCE);
    }
}
