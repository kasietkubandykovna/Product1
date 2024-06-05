import java.time.LocalDate;

public interface Crud {
    // ADD method;

    String createCourse(Product product);
    Product getCourseByld(Long id);
    void getAllCourse();
    Product updateCourse(Long id,Product newProduct);
    String deleteCourse(Long id);
}
