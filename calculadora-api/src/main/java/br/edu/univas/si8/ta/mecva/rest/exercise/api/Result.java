package br.edu.univas.si8.ta.mecva.rest.exercise.api;

public class Result {
	
	private int first;
	private int second;
	private int result;
	
	
	public int getFirst() {
		return first;
	}


	public void setFirst(int first) {
		this.first = first;
	}
	
	public Result withFirst(int first) {
		this.first = first;
		return this;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public Result withSecond(int second) {
		this.second = second;
		return this;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}


	public Result withResult(int result) {
		this.result = result;
		return this;
	}
}
