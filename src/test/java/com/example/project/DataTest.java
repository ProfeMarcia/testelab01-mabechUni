package com.example.project;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DataTest {
	@Test
	public void Data1() {
		int dia = 0;
		int mes = 0;
		int ano = 0;
		Data actual = new Data(dia, mes, ano);

		assertTrue((actual.getDia() == 0),"[OK]");
		assertTrue((actual.getAno() == 0),"[OK]");
		assertTrue((actual.getMes() == 0),"[OK]");
	}

	@Test
	public void getAno() {
		Data d =  new Data(0, 0, 0);
		int expected = 0;
		int actual = d.getAno();

		assertEquals(expected, actual,"[OK]");
	}

	@Test
	public void getDia() {
		Data d =  new Data(0, 0, 0);
		int expected = 0;
		int actual = d.getDia();

		assertEquals(expected, actual,"[OK]");
	}

	@Test
	public void getMes() {
		Data d =  new Data(0, 0, 0);
		int expected = 0;
		int actual = d.getMes();

		assertEquals(expected, actual,"[OK]");
	}

	@Test
	public void setAno() {
		Data d = new Data(0, 0, 0);
		int ano = 1984;
		d.setAno(ano);
		assertEquals(1984, d.getAno(),"[OK]");
	}

	@Test
	public void setDia() {
		Data d = new Data(0, 0, 0);
		int dia = 30;
		d.setDia(dia);
		assertEquals(30, d.getDia(),"[OK]");
	}

	@Test
	public void setMes() {
		Data d = new Data(0, 0, 0);
		int mes = 06;
		d.setMes(mes);
		assertEquals(06, d.getMes(),"[OK]");
	}
}
