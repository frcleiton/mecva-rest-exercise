package br.edu.univas.si8.ta.mecva.rest.exercise.impl;

import br.edu.univas.si8.ta.mecva.rest.exercise.api.CalcService;
import br.edu.univas.si8.ta.mecva.rest.exercise.api.Result;

public class CalculadoraImpl implements CalcService{
	
	@Override
	public String sayHello(String name) {
		return String.format("<h1>Hello %s!!!</h1>", name);
	}

	@Override
	public Result sum(int first, int second) {
		int result = first + second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

	@Override
	public Result subtract(int first, int second) {
		int result = first - second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

}
