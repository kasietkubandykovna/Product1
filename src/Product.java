import java.time.LocalDate;

public class Product {
    private String name;
    private int price;
    private String description;
    Category category;
    LocalDate localDate;
    private Long id;

    public Product() {
    }

    public Product(String name, int price, String description, Category category, LocalDate localDate, Long id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.localDate = localDate;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", localDate=" + localDate +
                ", id=" + id +
                '}';
    }
}
