package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DataBase {
    private List<Product> products;
    private HashSet<User> users;

    public DataBase() {
        this.products = new ArrayList();
        this.users = new HashSet();
        this.products.add( new Product(1,"product 1", "This is a nice product buy it now.", 99.99) );
        this.products.add( new Product(2,"product 2", "This is a nice product buy it now.", 29.99) );
        this.products.add( new Product(3,"product 3", "This is a nice product buy it now.", 39.99) );
        this.products.add( new Product(4,"product 4", "This is a nice product buy it now.", 49.99) );
        this.products.add( new Product(5,"product 5", "This is a nice product buy it now.", 95.99) );
        this.users.add(new User(1, "user", "123"));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public void setUsers(HashSet<User> users) {
        this.users = users;
    }
}
