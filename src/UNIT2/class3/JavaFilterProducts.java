package UNIT2.class3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFilterProducts {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, 10000, "SAMSUNG"));
        productList.add(new Product(2, 1205, "ASUS"));
        productList.add(new Product(3, 15870, "HP"));
        productList.add(new Product(4, 1548084, "DELL"));
        productList.add(new Product(5, 94000, "APPLE1"));
        productList.add(new Product(6, 94004, "APPLE2"));
        productList.add(new Product(7, 94006, "APPLE3"));
        productList.add(new Product(8, 94009, "APPLE4"));
        productList.add(new Product(9, 940056, "APPLE5"));
        productList.add(new Product(10, 940007876, "APPLE6"));

        List<Double> newList = productList.stream().filter(p -> p.price>1205).map(p -> p.price).collect(Collectors.toList());
        List<String> nameList = productList.stream().filter(p -> p.price>1205).map(p -> p.name).collect(Collectors.toList());
        System.out.println(nameList);
        System.out.println(newList);
    }
}
