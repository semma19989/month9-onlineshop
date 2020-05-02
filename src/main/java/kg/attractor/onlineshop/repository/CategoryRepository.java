package kg.attractor.onlineshop.repository;


import kg.attractor.onlineshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
