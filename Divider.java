

public class Divider {
    private double vol1;
    private double vol2;
    private double res1;
    private double res2;
    private double vOut;
    private double iTotal;

    public Divider() {
    }

    public Divider(double initialVol1 , double initialVol2, double initialRes1, double initialRes2) {
        this.vol1 = initialVol1;
        this.vol2 = initialVol2;
        this.res1 = initialRes1;
        this.res2 = initialRes2;
    }

    public void set_vol1(double initialVol1) {
        this.vol1 = initialVol1;
    }

    public void set_vol2(double initialVol2) {
        this.vol2 = initialVol2;
    }

    public void set_res1(double initialRes1) {
        this.res1 = initialRes1;
    }

    public void set_res2(double initialRes2) {
        this.res2 = initialRes2;
    }

    public double get_vol1() {
        return this.vol1;
    }

    public double get_vol2() {
        return this.vol2;
    }

    public double get_res1() {
        return this.res1;
    }

    public double get_res2() {
        return this.res2;
    }

    private void calculate() {
        this.vOut = this.vol1 + (this.vol2 - this.vol1) * (this.res1 / (this.res1 + this.res2));
        this.iTotal = (this.vol1 - this.vOut) / this.res1;
    }

    public void display() {
        this.calculate();
        System.out.println("Total voltage 1 is :" + this.get_vol1());
        System.out.println("Total voltage 2 is: " + this.get_vol2());
        System.out.println("Total resistor 1 is: " + this.get_res1());
        System.out.println("Total resistor 2 is: " + this.get_res2());
        System.out.println("Total total voltage is:" + this.vOut);
        System.out.println("Total total currrent is:" + this.iTotal);
    }

    public static void main(String[] args) {
        Divider mydivider = new Divider(10.0, -10.0, 5000.0, 15000.0);
        mydivider.calculate();
        System.out.println(mydivider.vOut);
        System.out.println(mydivider.iTotal);
        System.out.println("expected vout is: 5v ");
        System.out.println("expected iTotal is: 1mA");
    }
}
