package Assignment3.Question2;

public class Psychiatrist {
    public void examine(MoodyObject moodyobject) {
        System.out.println("How are you feeling today?");
        moodyobject.queryMood();
        System.out.println();
        moodyobject.expressFeelings();
    }

    public void observe(MoodyObject moodyobject) {
        System.out.println("Observation : " + moodyobject.toString());
        System.out.println();
    }

}

