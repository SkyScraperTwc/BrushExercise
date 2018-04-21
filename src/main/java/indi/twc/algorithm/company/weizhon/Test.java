package indi.twc.algorithm.company.weizhon;

public class Test {
    public static void main(String[] args) {
        Dad d = new Dad();
//        d.setNickname("jack");
        System.out.println(d.getNickname());
        Son s = new Son();
        s.setName("tom");
        System.out.println(s.getName());
    }
}

class Dad{
    String name;

    private String nickname;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getNickname() {
        return nickname;
    }

    private void setNickname(String nickname) {
        this.nickname = nickname;
    }

}

class Son extends Dad{

    String outsea;
}