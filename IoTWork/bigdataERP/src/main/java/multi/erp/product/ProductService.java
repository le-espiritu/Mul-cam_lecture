package multi.erp.product;

import java.util.List;

public interface ProductService {
	List<ProductVO> productlist(String category);
	List<ProductVO> hitproduct();
	List<ProductVO> newproduct();
	ProductVO read(String prd_no);
}
