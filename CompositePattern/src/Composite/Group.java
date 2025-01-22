package Composite;
import java.util.ArrayList;

public class Group extends Component{
    private ArrayList list = new ArrayList();

    private String name;

    public Group(String name){
        this.name = name;
    }

    public void add(Component c)
    {
        list.add(c);
    }

    public void remove(Component c)
    {
        list.remove(c);
    }

    public Component getChild(int i)
    {
        return (Component) list.get(i);
    }

    public void operation(String s)
    {
        System.out.println("对群组"+name+"分享内容："+s);
        for(Object obj:list)
        {
            ((Component)obj).operation(s);
        }
    }
}
