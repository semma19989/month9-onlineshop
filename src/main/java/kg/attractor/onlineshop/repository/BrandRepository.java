package kg.attractor.onlineshop.repository;


import kg.attractor.onlineshop.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
    Object getByName(String name);
}
