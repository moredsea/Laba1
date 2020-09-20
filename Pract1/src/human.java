public class human {
    private int arm;
    private int leg;
    private int head;
    public human(int a, int l, int h){
        arm = a;
        leg = l;
        head = h;
    }
    public human(int a, int l){
        arm = a;
        leg = l;
        head = 0;
    }
    public human(int a){
        arm = a;
        leg = 0;
        head = 0;
    }
    public void setArm(int arm) {
        this.arm = arm;
    }
    public void setLeg(int leg) {
        this.leg = leg;
    }
    public void setHead(int head) {
        this.leg = head;
    }
    public int getArm(int arm){
        return arm;
    }
    public int getLeg(int leg) {
        return leg;
    }
    public void intoHuman(){
        System.out.println("Leg:"+this.leg+"Arm:"+this.arm+"Head:"+this.head);
    }
}