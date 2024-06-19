package SB_Elastic_Search.Elastic.repo;

import SB_Elastic_Search.Elastic.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {

}