package Assignment7.Problem3;

public class Paper extends Tool {

    Paper(int strength) {
        this.setStrength(strength);
        this.type = 'p';
    }

    public boolean fight(Tool tool) {
        int newstrength = 0;
        if (tool.type == 'r') {
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
