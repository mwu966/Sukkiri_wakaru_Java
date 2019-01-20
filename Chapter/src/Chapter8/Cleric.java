package Chapter8;

public class Cleric {
    String name = null;
    int HP = 0;
    final  int MaxHP = 50;
    int MP = 0;
    final int MaxMP = 10;

    public void selfAid(){
        System.out.println(this.name+"はセルフエイドを唱えたなどした");
        this.HP = this.MaxHP;
        this.MP = -5;
        System.out.println("HPが回復した？");
    }

    public  int pray(int sec){
        int recover = new Rondom().nexInt(3) + sec;

        int HealMp = Math.min(this.MaxMP -  this.MP, recover);

        this.mp += recover;
        System.out.println("MPが"+HealMp+"回復した");


        return HealMp;
    }

}
