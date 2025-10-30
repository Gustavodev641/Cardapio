package com.example.cardapio.food;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String image;

    private Integer price;

    public Food(foodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();

    }
}
