package Chapter2;

public class Lesson2_3 {
    public static void main(String args[]){
        Sysout("ようこそ占いの館へ\nあなたの名前を教えてください");
        String name = new java.util.Scanner(System.in).nextLine();
        Sysout("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        Sysout("画面に占いの結果が出ました!");
        Sysout(age+"歳の"+name+"さん,あなたの運気番号は"+fortune+"です");
        Sysout("1:大吉　2:中吉　3:吉　4:凶");
    }

    private static void Sysout(String message){
        System.out.println(message);
    }
}