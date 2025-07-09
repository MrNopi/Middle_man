package middle.man.learning;

import middle.man.learning.utils.enums.ProductCategory;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    private static final Random RND = new Random();
    private static final List<Product> PRODUCTS = List.of(
            new Product("Milk", ProductCategory.PRODUCTS, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("Screwdriver", ProductCategory.TOOLS, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("Hammer", ProductCategory.TOOLS, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("Eggs", ProductCategory.PRODUCTS, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("MacBook", ProductCategory.ELECTRONIC, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("Raspberry PI", ProductCategory.ELECTRONIC, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("Cement", ProductCategory.BUILDING, RND.nextDouble(1, 1000), RND.nextBoolean()),
            new Product("Metal sheet", ProductCategory.BUILDING, RND.nextDouble(1, 1000), RND.nextBoolean())
    );

    public static void main(String[] args) {
        System.out.println(PRODUCTS);
        System.out.println(getAvailableProductsByCategory("Products"));
        System.out.println(getAvailableProductsByCategory("Tools"));
        System.out.println(getAvailableProductsByCategory("Electronics"));
        System.out.println(getAvailableProductsByCategory("Building"));
    }

    private static List<String> getAvailableProductsByCategory(String category) {
        return PRODUCTS.stream()
                .filter(x -> x.getCategory().equals(category))
                .filter(Product::isInStock)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .map(Product::getName)
                .collect(Collectors.toList());
    }

}