package nl.novi.classandobjects_auto;

public class Auto {
    String type;
    String brand;
    int bouwjaar;
    double kmStand;
    boolean automatisch;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        this.bouwjaar = bouwjaar;
    }

    public double getKmStand() {
        return kmStand;
    }

    public void setKmStand(double kmStand) {
        this.kmStand = kmStand;
    }

    public boolean isAutomatisch() {
        return automatisch;
    }

    public void setAutomatisch(boolean automatisch) {
        this.automatisch = automatisch;
    }

    public Auto(String type, String brand, int bouwjaar, double kmStand, boolean automatisch) {
        this.type = type;
        this.brand = brand;
        this.bouwjaar = bouwjaar;
        this.kmStand = kmStand;
        this.automatisch = automatisch;
    }

    public void Info() {
        if (automatisch) {
            System.out.println("You just parked a " + brand + " " + type + " from the year " + bouwjaar + "." + "It drove " + kmStand + "kilometers " + "and has an automatic gear system");
        } else {
            System.out.println("You just parked a " + brand + " " + type + " from the year " + bouwjaar + "." + "It drove " +
                    "and you drive stick");
        }

    }

    public void stukjeRijden(int afstand) {
        this.kmStand = kmStand + afstand;

    }
}
