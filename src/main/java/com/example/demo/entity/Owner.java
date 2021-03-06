package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "owner", fetch = FetchType.EAGER)
    private List lists;

    @Column(name = "name")
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
