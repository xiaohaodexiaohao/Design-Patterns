package design;

public class Mom {
    public void narrate(IReader iReader){
        System.out.println("开始读物");
        System.out.println(iReader.getContent());
    }
}
