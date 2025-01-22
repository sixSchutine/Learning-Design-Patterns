package SingleChairman;

public class Test {
    public static void main(String[] args){
        // 创建部长和成员实例
        Member member1 = new Member("M0001");
        Member member2 = new Member("M0002");
        Minister minister1 = new Minister("M0001");
        Minister minister2 = new Minister("M0002");
        // 测试display方法
        minister1.display();
        minister2.display();
        member1.display();
        member2.display();
        // 创建主席实例
        Chairman chairman1 = Chairman.getInstance("C0001");
        Chairman chairman2 = Chairman.getInstance("C0002");  //应该和chairman1是同一个实例
        // 测试主席的display方法
        chairman1.display();
        chairman2.display();
    }
}
