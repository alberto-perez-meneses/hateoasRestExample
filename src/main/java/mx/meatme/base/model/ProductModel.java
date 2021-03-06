package mx.meatme.base.model;

import lombok.Data;


import javax.persistence.*;


@Entity
@Data
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private String title;
    private String description;
    private String imgUrl;
    private double price;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    public ProductModel(){}
}
