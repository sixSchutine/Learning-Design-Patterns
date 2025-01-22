package SingleChairman;

public class Member {
    private String id;
    public Member(String id){
        this.id = id;
    }
    public void display(){
        System.out.println("成员id:"+this.id);
    }
}
