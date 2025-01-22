package Composite;

public class Member extends Component
{
    private String name;

    public Member(String name){
        this.name = name;
    }

    public void add(Component c){
        System.out.println("对不起，不支持该方法");
    }

    public void remove(Component c){
        System.out.println("对不起，不支持该方法");
    }

    public Component getChild(int i){
        System.out.println("对不起，不支持该方法");
        return null;
    }

    public void operation(String s){
        System.out.println("对成员"+name+"分享内容："+s);
    }
}
