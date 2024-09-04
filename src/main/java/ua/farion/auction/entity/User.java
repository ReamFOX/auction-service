package ua.farion.auction.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User {
    private Long id;
    private String email;
    private Role role;
}
