package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (double) fund*interestRate*days/36500;
    }

    public double close(int days){
        double yield = (active ? (getYield(days) + fund)*(1-cost/100) : 0);
        active = false;
        return yield;
    }
}
