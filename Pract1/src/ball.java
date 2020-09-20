public class ball {
    private String colour;
    private int diameter;
    public ball(String c, int d){
        colour = c;
        diameter = d;
    }
    public ball(String c){
        colour = c;
        diameter = 0;
    }
    public ball(){
        colour = "no data";
        diameter = 0;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public String getColour(String colour){
        return colour;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString(){
        return "Colour:"+this.colour+", diameter:"+this.diameter;
    }

}

