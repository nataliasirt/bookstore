package chapter8;

public interface Discountable {

    void applyPercentDiscount(double percent);

    void applyFlatDiscount(double amount);

    void removeDiscount();
}