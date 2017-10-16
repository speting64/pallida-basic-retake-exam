public class Bulbasaur {

    String name;
    String voice;
    int HP;
    int SP;

    public Bulbasaur(String name,String voice,int HP,int SP){

        this.name = name;
        this.voice = "Bulba-saur";
        this.HP = 10;
    }

    public String speak(){
        return voice;
    }


}
