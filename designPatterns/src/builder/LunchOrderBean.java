package builder;

public class LunchOrderBean {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBean(){

    }

    public String getBread() {
        return bread;
    }

    public LunchOrderBean setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public String getCondiments() {
        return condiments;
    }

    public LunchOrderBean setCondiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public String getDressing() {
        return dressing;
    }

    public LunchOrderBean setDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public String getMeat() {
        return meat;
    }

    public LunchOrderBean setMeat(String meat) {
        this.meat = meat;
        return this;
    }
}
