package database;
import domain.Product;
import java.util.ArrayList;
public class ProductDA {
    private static ArrayList<Product> products = new ArrayList<Product>(5);
    
    public static void add(Product p) {
        products.add(p);
    }
    
    public static Product find (String code) {
        for (int i = 0; i < products.size(); i++) {
            if (code.equals(products.get(i).getCode()))
                return products.get(i);
        }
        return null;
    }
    
    public static ArrayList<Product> getProducts() {
        return products;
    }
    
    public static void init() {
        if (products.size() <= 0) {
            Product p;
            
            p = new Product();
            p.setCode("8601");
            p.setDescription("86 (the band) - True Life Songs and Pictures");
            p.setPrice(14.95);
            p.add();
            
            p = new Product();
            p.setCode("pf01");
            p.setDescription("Paddlefoot - The first CD");
            p.setPrice(12.95);
            p.add();
            
            p = new Product();
            p.setCode("pf02");
            p.setDescription("Paddlefoot - The second CD");
            p.setPrice(14.95);
            p.add();
            
            p = new Product();
            p.setCode("jr01");
            p.setDescription("Joe Rut - Genuine Wood Grained Finish");
            p.setPrice(14.95);
            p.add();
        }
    }
}