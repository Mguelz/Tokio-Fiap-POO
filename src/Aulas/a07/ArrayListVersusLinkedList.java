package Aulas.a07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayListVersusLinkedList {
	public static void main(String[] args) {
		Collection<Long> listaArrayList = new ArrayList<Long>(); // Tempo gasto --> 259
		Collection<Long> listaHashSet = new HashSet<Long>(); // Tempo gasto --> 621
		Collection<Long> listaLinkedList = new LinkedList<Long>(); // Tempo gasto --> 1237

		long inicio = System.currentTimeMillis(), fim, tempo;
		// ArrayList
		for (long i = 0; i < 10000000; i++) {
			listaArrayList.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("ArrayList --> " + tempo);

		// HashSet
		inicio = System.currentTimeMillis();

		for (long i = 0; i < 10000000; i++) {
			listaHashSet.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("hashSet --> " + tempo);

		// LinkedList
		inicio = System.currentTimeMillis();

		for (long i = 0; i < 10000000; i++) {
			listaLinkedList.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("LinkedList --> " + tempo);
	}
}
/*
 * TESTES FEITOS
 * 
 * ArrayList --> 209
 * hashSet --> 343
 * LinkedList --> 1291
 * 
 * 
 * ArrayList --> 209
 * hashSet --> 341
 * LinkedList --> 1383
 * 
 * 
 * ArrayList --> 208
 * hashSet --> 335
 * LinkedList --> 1463
 * 
 * 
 */