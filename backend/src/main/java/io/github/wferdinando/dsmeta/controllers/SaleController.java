package io.github.wferdinando.dsmeta.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.wferdinando.dsmeta.entities.Sale;
import io.github.wferdinando.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	private final SaleService service;

	public SaleController(SaleService service) {
		this.service = service;
	}

	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);
	}

}
