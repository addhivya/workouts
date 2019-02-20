package Assignment3.Question2;

public abstract class MoodyObject {

    protected abstract String getMood();

    protected abstract void expressFeelings();

    public void queryMood() {
        String mood = this.getMood();
        System.out.println("I feel " + mood + " today!");
    }
}





