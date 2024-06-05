import java.time.LocalDate;

public class BD implements Crud {
private  final Product []products=new Product[4];
private int productCount=0;
    @Override
    public String createCourse(Product product) {
        products[productCount++]=product;
        return "product add"+product;
    }

    @Override
    public Product getCourseByld(Long id) {
        for (Product product:products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void getAllCourse() {
        for (int i = 0; i <productCount ; i++) {
            System.out.println(products[i]);
        }

    }

    @Override
    public Product updateCourse(Long id, Product newProduct) {
        for (int i = 0; i <productCount ; i++) {
            if (products[i].getId().equals(id)){
                products[i]=newProduct;
                System.out.println("Product updated"+newProduct);
            }

        }
        return null;
    }

    @Override
    public String deleteCourse(Long id) {
        for (int i = 0; i <productCount ; i++) {
            if (products[i].getId().equals(id)){
                for (int j = 0; j < productCount-1; j++) {
                    products[i]=products[j+1];
                }
                productCount--;
                return "Product deleted!";
            }
        }
        return "Product not found!";
    }
}

