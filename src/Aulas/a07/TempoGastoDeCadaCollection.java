package Aulas.a07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;


/**
 * 
 * 1. Crie um código que insere 50k números em um ArrayList e pesquise-os: Collection<Integer> lista = new ArrayList<Integer>();
 * 2. Utilize o método System.currentMillis(); para cronometrar o tempo gasto: long inicio = System.currentMillis();
 * 3. Faça um laço para popular a lista com 50k números inteiros.
 * 4. Utilize novamente o System.currentMillis(); para cronometrar o tempo gasto: long fim = System.currentMillis();
 * 5. Calcule o tempo gasto: long tempo = fim – inicio;
 * 6. Exiba o tempo gasto;
 * 7. Troque o ArrayList por HashSet e verifique o tempo
 * 8. Troque o ArrayList por LinkedList e verifique o tempo
 * 
 * @author Miguel
 *
 */
public class TempoGastoDeCadaCollection {

	public static void main(String[] args) {
		long inicio, fim, tempo;
		Collection<Integer> listaArrayLista = new ArrayList<Integer>();
		Collection<Integer> listaHashSet = new HashSet<Integer>();
		Collection<Integer> listaLinkedList = new LinkedList<Integer>();

		inicio = System.currentTimeMillis();

		System.out.println("tempo gasto --> " + popularArrayList(listaArrayLista, inicio));
		System.out.println("tempo gasto --> " + popularHashSet(listaHashSet, inicio));
		System.out.println("tempo gasto --> " + popularLinkedList(listaLinkedList, inicio));

	}

	public static long popularArrayList(Collection<Integer> lista, long inicio) {
		long fim = 0, tempo = 0;
		for (int i = 0; i <= 50000; i++) {
			lista.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("\n---------------- ArrayList ----------------");
		System.out.println("inicio - " + inicio);
		System.out.println("fim - " + fim);
		return tempo;
	}

	public static long popularHashSet(Collection<Integer> lista, long inicio) {
		long fim = 0, tempo = 0;
		for (int i = 0; i <= 50000; i++) {
			lista.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("\n---------------- HashSet ----------------");
		System.out.println("inicio - " + inicio);
		System.out.println("fim - " + fim);
		return tempo;
	}

	public static long popularLinkedList(Collection<Integer> lista, long inicio) {
		long fim = 0, tempo = 0;
		for (int i = 0; i <= 50000; i++) {
			lista.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("\n---------------- LinkedList ----------------");
		System.out.println("inicio - " + inicio);
		System.out.println("fim - " + fim);
		return tempo;
	}

}
