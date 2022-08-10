package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num%2 == 0;
		Predicate<Integer> isTresDigitos =
				num -> num%100 >= 1;
		
		System.out.println(isPar.and(isTresDigitos).test(333));
	}
}
