package UNIT2.class3;
interface Messagable{
    Message getMEssage(String msg);
}

class Message{
    Message(String msg){
        System.out.println(msg);
    }
}
public class ConstructorRefrencing {

    public static void main(String[] args) {
        Messagable hey = Message::new;
        hey.getMEssage("YOUYU");
    }
}
