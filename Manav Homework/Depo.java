public class Depo {
    private int elma;
    private int armut;
    private int kiraz;

    public Depo(int elma, int armut, int kiraz) {
        this.setElma(elma);
        this.setArmut(armut);
        this.setKiraz(kiraz);
    }
    public void stoksorgu(){
        System.out.println("Depoda mevcut olan mal: " + getElma() + " " + getArmut() + " " + getKiraz());
    }
    public void satınalma(int satılanelma, int satılanarmut, int satılankiraz) {
        if (satılanelma <= getElma() && satılanarmut <= getArmut() && satılankiraz <= getKiraz()) {
            this.setElma(getElma() - satılanelma);
            this.setArmut(getArmut() - satılanarmut);
            this.setKiraz(getKiraz() - satılankiraz);
            System.out.println("Satın alım sonrası depoda kalan mal : " + getElma() + " " + getArmut() + " " + getKiraz());
        } else {
            System.out.println("Depoda yeterli mal mevcut degil.");
            return;
        }


    }

    public int getElma() {
        return elma;
    }

    public void setElma(int elma) {
        this.elma = elma;
    }

    public int getArmut() {
        return armut;
    }

    public void setArmut(int armut) {
        this.armut = armut;
    }

    public int getKiraz() {
        return kiraz;
    }

    public void setKiraz(int kiraz) {
        this.kiraz = kiraz;
    }
}
