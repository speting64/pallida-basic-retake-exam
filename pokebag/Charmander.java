public class Charmander {

    String name;
    String voice;
    int HP;
    int SP;

    public Charmander(String name,String voice,int HP,int SP){
        this.name = name;
        this.voice = "char-cahr";
        this.HP = 10;
        this.SP =(int)(1+ Math.random()*9);
    }

    public String speak(){
        return voice;
    }
}
