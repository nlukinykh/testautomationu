package chapter6;

import java.util.Locale;

public class PhoneBill {

    public void getBill(Locale locale) {
        printResult(locale, countOverage(), countTaxTotal(), countTotal());
    }

    private void printResult(Locale locale, double overage, double taxTotal, double total) {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format(locale,"%.2f", basePlan));
        System.out.println("Overage: $" + String.format(locale,"%.2f", overage));
        System.out.println("Tax: $"+ String.format(locale, "%.2f", taxTotal));
        System.out.println("Total: $" + String.format(locale, "%.2f", total));
    }

    private double countTotal() {
        return countSubTotal() + countTaxTotal();
    }
    private double countTaxTotal() {
        return tax * countSubTotal();
    }

    private double countSubTotal() {
        return basePlan + overageMins * costForExtraMins;
    }

    private double countOverage() {
        return overageMins * costForExtraMins;
    }

    private int id = 0;
    private double basePlan = 79.99;
    private int overageMins = 800;
    private int usedMins = 800;

    private final double costForExtraMins = 0.25;
    private final double tax = 0.15;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBasePlan() {
        return basePlan;
    }

    public void setBasePlan(double basePlan) {
        this.basePlan = basePlan;
    }

    public int getOverageMins() {
        return overageMins;
    }

    public void setOverageMins(int overageMins) {
        this.overageMins = overageMins;
    }

    public int getUsedMins() {
        return usedMins;
    }

    public void setUsedMins(int usedMins) {
        this.usedMins = usedMins;
    }

    PhoneBill(int id, double basePlan, int overageMins, int usedMins) {
        this.id = id;
        this.basePlan = basePlan;
        this.overageMins = overageMins;
        this.usedMins = usedMins;
    }

    PhoneBill(int id) {
        this.id = id;
    }

    PhoneBill() {
    }



}
