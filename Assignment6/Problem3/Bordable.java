package Assignment6.Problem3;

public interface Bordable {

    void setBoardStart(int month, int day, int year);
    void setBoardEnd(int month, int day, int year);
    boolean boarding(int month, int day, int year);

}
