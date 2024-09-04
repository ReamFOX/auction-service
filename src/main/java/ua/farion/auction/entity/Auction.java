package ua.farion.auction.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "auctions")
public class Auction {
    private Long id;
    private String name;
    private User seller;
    private User buyer;

}
