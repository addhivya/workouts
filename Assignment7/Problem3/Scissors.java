package Assignment7.Problem3;

public class Scissors extends Tool {
    Scissors(int strength) {
        this.setStrength(strength);
        this.type = 's';
    }

    public boolean fight(Tool tool) {
        int newstrength = 0;
        if (tool.type == ('p')) {
            newstrength = this.strength * 2;
        } else {
            newstrength = this.strength / 2;
        }
        if (newstrength > this.strength) {
            return true;
        } else
            return false;


    }
}

