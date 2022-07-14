package io.github.wferdinando.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.github.wferdinando.dsmeta.entities.Sale;
import io.github.wferdinando.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	private final SaleRepository repository;

	public SaleService(SaleRepository repository) {
		this.repository = repository;
	}

	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);// Converte data em string para data
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		return repository.findSales(min, max, pageable);
	}

}