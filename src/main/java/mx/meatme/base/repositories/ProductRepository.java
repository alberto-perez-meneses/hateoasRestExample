package mx.meatme.base.repositories;

import mx.meatme.base.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<ProductModel,Integer> {
}
