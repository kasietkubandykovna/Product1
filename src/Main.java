import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Crud crud=new BD();
Product product=new Product("Lenovo",95000,"des",Category.ELECTRONICS,LocalDate.of(2022,1,4),1L);
        Product product1=new Product("iPhone",130000,"des",Category.ELECTRONICS, LocalDate.of(2023,5,9),2L);
        Product product2=new Product("Charger",250,"des",Category.ACSESSORIES, LocalDate.of(2021,7,1),3L);
        Product product3=new Product("Pasta",85,"des",Category.FOOD_PRODUCTS, LocalDate.of(2024,6,6),4L);

      //ADD product

        System.out.println(crud.createCourse(product));
        System.out.println(crud.createCourse(product1));
        System.out.println(crud.createCourse(product2));
        System.out.println(crud.createCourse(product3));

        //Get by id

        System.out.println( "Get by id Course : ");
        System.out.println(crud.getCourseByld(3L));

        //Get all Product

        System.out.println("All products : ");
        crud.getAllCourse();

        //Update product

        System.out.println("Update product : ");
        Product newProduct=new Product("Samsung",110000,"des",Category.ELECTRONICS,LocalDate.of(2023,8,8),4L);
        System.out.println(crud.updateCourse(1L,newProduct));

    //Delete product

        System.out.println("Delete product");
        System.out.println(crud.deleteCourse(2L));
        System.out.println("All product after deletion");
        crud.getAllCourse();
    }
}