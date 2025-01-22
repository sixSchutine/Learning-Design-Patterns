package Composite;
public class Client {
    public static void main(String[] args) {
        // Create members
        Member m1 = new Member("Alice");
        Member m2 = new Member("Bob");
        Member m3 = new Member("Charlie");
        Member m4 = new Member("Leslie");
        Member m5 = new Member("Peter");
        Member m6 = new Member("Jerry");
        // Create groups
        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        Group subGroup1 = new Group("SubGroup1");
        // Add members to groups
        group1.add(m1);
        group1.add(m2);
        group2.add(m4);
        group2.add(m5);
        group2.add(m6);
        // Add subgroup to group
        subGroup1.add(m3);
        group1.add(subGroup1);
        group1.getChild(2);
        m2.add(m1);
        m2.remove(m2);
        m2.operation("老师提醒你交作业了！");
        subGroup1.operation("Java是世界上最好的语言！");
        group2.operation("我Python第一个表示不服！");
    }
}