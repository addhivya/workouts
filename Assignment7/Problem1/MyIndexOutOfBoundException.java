package Assignment7.Problem1;

public class MyIndexOutOfBoundException extends  Exception{
    MyIndexOutOfBoundException(int lowerbound,int upperbound,int index)
    {
        super("Error Message: Index:"+index+","+"but Lower bound:"+lowerbound+",Upper bound:"+upperbound);
    }
}
