package Assignment7.Problem3;

public class Rock extends Tool {
    Rock(int strength) {
        this.setStrength(strength);
        this.type = 'r';
    }

    public boolean fight(Tool tool) {
        int newstrength = 0;
        if (tool.type == 's') {
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
