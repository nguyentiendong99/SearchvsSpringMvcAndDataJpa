package net.codejava.custormer;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustormerRepository extends CrudRepository<Custormer, Long>{
	
	
	@Query(value = "SELECT c FROM Custormer c WHERE c.name LIKE '%' || :keyword || '%' "
			+ "OR c.email LIKE '%' || :keyword || '%'"
			+ "OR c.address LIKE '%' || :keyword || '%'")
	public List<Custormer> search(@Param("keyword")	String keyword);

}
