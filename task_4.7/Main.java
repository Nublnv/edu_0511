import java.awt.*;

public class Main {
    public static void main(String[] args){
    }
}

interface Animal {
    default Color getColor()
    {
        return Color.ORANGE;
    };
}

class Fox implements Animal {
    public String getName() {
        return "Fox";
    }

}
