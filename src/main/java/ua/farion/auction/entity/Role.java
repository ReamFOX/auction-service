package ua.farion.auction.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "roles")
public class Role {
    private Long id;
    private RoleName name;

    public enum RoleName {
        BUYER,
        SELLER,
        ADMIN
    }

}
