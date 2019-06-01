package prekybos.botas.modelis;

import java.time.LocalDateTime;

public class MomentineKaina {

    private double kaina;
    private LocalDateTime laikas;
    private double bid;
    private double ask;

    public MomentineKaina(double kaina, double bid, double ask, double hi, double low, LocalDateTime laikas) {
        this.kaina = kaina;
        this.laikas = laikas;
        this.bid = bid;
        this.ask = ask;
        this.hi = hi;
        this.low = low;
    }

    public MomentineKaina(double kaina, double bid, double ask, double hi, double low) {
        this.kaina = kaina;
        this.laikas = LocalDateTime.now();
        this.bid = bid;
        this.ask = ask;
        this.hi = hi;
        this.low = low;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public LocalDateTime getLaikas() {
        return laikas;
    }

    public void setLaikas(LocalDateTime laikas) {
        this.laikas = laikas;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getHi() {
        return hi;
    }

    public void setHi(double hi) {
        this.hi = hi;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }
    private double hi;
    private double low;
}
