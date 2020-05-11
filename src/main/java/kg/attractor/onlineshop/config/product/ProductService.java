package kg.attractor.onlineshop.config.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getSearchResult(String name, float min, float max, String brand, String category) {
        return productRepository.getBy(name, min, max, brand, category);

    }


    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
