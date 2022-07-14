package io.github.wferdinando.dsmeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.wferdinando.dsmeta.entities.Sale;
import io.github.wferdinando.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	private final SaleRepository repository;
	public SaleService(SaleRepository repository) {
		this.repository = repository;
	}
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
	
}
