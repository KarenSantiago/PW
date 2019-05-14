package com.ordenar.ordenamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ordenar.ordenamento.models.Numeros;

@Controller
public class NumerosController {
	@RequestMapping("/ordenar")
	public String ordenar() {
		return "ordenado";
	}
	@RequestMapping(value="/ordenar", method=RequestMethod.POST)
	public ModelAndView ordenar(Numeros numeros) {
		ModelAndView mv = new ModelAndView("ordenado");
		double v1 = numeros.getV1();
		double v2 = numeros.getV2();
		
		if (v1 > v2) {
			double v3 = 0; // criação da variável temporária para armazenar v1
			v3 = v1; // armazena o valor do v1 na variável temporária v3...
			v1 = v2; // v1 recebe o valor de v2 
			v2 = v3; // por fim v2 recebe a variável v3 com o valor de v1.
		}
		mv.addObject("valor1", v1);
		mv.addObject("valor2", v2);
		return mv;
	}
}
