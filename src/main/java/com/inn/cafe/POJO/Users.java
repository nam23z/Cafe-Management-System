package com.inn.cafe.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name = "Users.findByEmailId",query = "select u from Users u where u.email=:email")
@NamedQuery(name = "Users.getAllUser",query = "select new com.inn.cafe.wrapper.UserWrapper(u.id,u.name,u.email,u.contactNumber,u.status) from Users u where u.role='user'")
@NamedQuery(name = "Users.getAllAdmin",query = "select u.email from Users u where u.role='admin'")
@NamedQuery(name = "Users.updateStatus", query = "update Users u set u.status=:status where u.id =: id")

@Entity
@Data
@DynamicUpdate
@DynamicInsert
@Table(name = "users")
public class Users implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "role")
    private String role;
}
