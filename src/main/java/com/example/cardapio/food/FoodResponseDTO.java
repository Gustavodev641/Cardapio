package com.example.cardapio.food;


import lombok.Getter;

@Getter

public class FoodResponseDTO {

    private Long id;
    private String title;
    private String image;
    private Integer price;


    public FoodResponseDTO(Long id, String title, String image, Integer price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }


    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }


}
