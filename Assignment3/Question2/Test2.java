package Assignment3.Question2;

public class Test2 {

    public static void main(String[] args) {
        Psychiatrist p = new Psychiatrist();
        MoodyObject h = new HappyObject();
        MoodyObject s = new SadObject();

        p.examine(h);
        p.observe(h);
        p.examine(s);
        p.observe(s);
    }
}
