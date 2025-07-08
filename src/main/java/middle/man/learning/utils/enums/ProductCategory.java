package middle.man.learning.utils.enums;

public enum ProductCategory {
    TOOLS(1, "Tools"),
    ELECTRONIC(2, "Electronics"),
    PRODUCTS(3, "Products"),
    BUILDING(4, "Building")
    ;

    private final int id;
    private final String category;

    ProductCategory(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }
}
