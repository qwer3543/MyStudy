package com.mystudy.ex03_sungjuk;

public class JumsuOutValueException extends sungjukProcessException {

	public JumsuOutValueException() {
		super("점수 범위을 벗어난 값입니다");
	}
}
