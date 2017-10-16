public class Pikachu {

    String name;
    String voice;
    int HP;
    int SP;

    public Pikachu(String name,String voice,int HP,int SP){

        this.name = name;
        this.voice = "pika-pika";
        this.HP = 12;
        this.SP = (int)(1+Math.random()+9);
    }

    public String speak(){
        return voice;
    }





}
