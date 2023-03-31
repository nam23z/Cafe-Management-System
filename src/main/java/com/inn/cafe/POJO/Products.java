package com.inn.cafe.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name = "Products.getAllProduct", query = "select new com.inn.cafe.wrapper.ProductWrapper(p.id,p.name,p.description,p.price,p.status,p.category.id,p.category.name) from Products p")

@NamedQuery(name = "Products.updateProductStatus", query = "update Products p set p.status=:status where p.id=:id")

@NamedQuery(name = "Products.getProductByCategory", query = "select new com.inn.cafe.wrapper.ProductWrapper(p.id,p.name) from Products p where p.category.id=:id and p.status='true'")

@NamedQuery(name = "Products.getProductById", query = "select new com.inn.cafe.wrapper.ProductWrapper(p.id,p.name,p.description,p.price) from Products p where p.id=:id")

@Entity
@Data
@DynamicUpdate
@DynamicInsert
@Table(name = "products")
public class Products implements Serializable {
    private static final long serialVersionUID = 123456L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_fk", nullable = false)
    private Category category;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "status")
    private String status;

}
