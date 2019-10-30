package com.example;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CsrService {
	@Autowired
	private CsrRepository repo;

	public List<Csr> listAll(){
		return repo.findAll();	}

	public void save(Csr csr) {
		repo.save(csr);
	}
	
	public Csr get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
}
