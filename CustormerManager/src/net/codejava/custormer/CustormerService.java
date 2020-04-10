package net.codejava.custormer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustormerService {
	
	@Autowired
	private CustormerRepository repository;
	
	public List<Custormer> listall(){
		return (List<Custormer>) repository.findAll();
	}

	public void Save(Custormer custormer) {
		repository.save(custormer);
	}
	public Custormer get(long id) {
		return repository.findById(id).get();
	}
	public void delete(long id) {
		repository.deleteById(id);
	}
	public List<Custormer> search(String keyword){
		return repository.search(keyword);
	}
}
