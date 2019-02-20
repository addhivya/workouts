package Assignment3;

public class Reverse {
    public String reverse(String s) {
        System.out.println("String:" + s);
        String[] data = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = data.length - 1; i >= 0; i--) {
            if (i == data.length - 1) {
                result.append(data[i].toLowerCase());
            } else {
                result.append(" ");
                result.append(data[i].toLowerCase());
            }
        } char c='d';
        int a=Integer.MAX_VALUE;

        return result.toString();
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        String res = r.reverse("       The sky  is      blue   ");
        System.out.print("Reverse:" + res);
    }
}

