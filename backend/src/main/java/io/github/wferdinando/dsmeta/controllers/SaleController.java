package io.github.wferdinando.dsmeta.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<Sale> findSales(){
		return service.findSales();
	}
	
	
}
