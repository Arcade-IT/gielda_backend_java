package pl.arcadeit.forex.stock.entity;

/*
Not in use atm
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Getter @Setter
@Transactional
public class Order {

    private Stock stock;
    private int quantity;
    private double price;
    private Date expiration;

    public Order(Stock stock, int quantity, double price, Date expiration) {
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.expiration = expiration;
    }


}