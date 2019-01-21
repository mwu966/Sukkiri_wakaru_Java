package Chapter8;

public class Cleric {
    String name = null;
    int HP = 0;
    static final  int MaxHP = 50;
    int MP = 0;
    static final int MaxMP = 10;

    public void selfAid(){
        System.out.println(this.name+"はセルフエイドを唱えたなどした");
        this.HP = this.MaxHP;
        this.MP = -5;
        System.out.println("HPが回復した？");
    }

    public Cleric(String name,int HP,int MP){
        this.name = name;
        this.HP = HP;
        this.MP = MP;

    }

    public  Cleric(String name){
        this.name = name;
        this.HP = MaxHP
        this.MP = MaxMP;
    }
    public  Cleric(String name,int HP){
        this.name = name;
        this.HP = HP;
        MP = MaxMP;
    }

    public  int pray(int sec){
        int recover = new Rondom().nexInt(3) + sec;

        int HealMp = Math.min(this.MaxMP -  this.MP, recover);

        this.mp += recover;
        System.out.println("MPが"+HealMp+"回復した");


        return HealMp;
    }

}
