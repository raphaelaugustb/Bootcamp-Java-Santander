import java.util.*;
import java.util.stream.Stream;

public class DesafioStreamApi {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().sorted((n1, n2) -> Integer.compare(n1, n2)).forEach(n -> System.out.println(n));
        System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2));
        numeros.stream().filter(n -> n > 0).forEach(System.out::println);
        numeros.stream().filter(n -> n > 5).reduce(Integer::sum).stream().forEach(n -> System.out.println(n));
        System.out.printf(String.valueOf(numeros.stream().anyMatch(n -> n > 10)));
        System.out.println(numeros.stream().sorted().skip(12).toList());
        System.out.println(numeros.stream().filter(n -> !(n % 2 == 0)).filter(n -> n % 3 == 0 || n % 5 == 0).sorted().toList());
        numeros.stream().map(n -> n * n).sorted().forEach(n -> System.out.println(n));
        System.out.println(numeros.stream().reduce((n1, n2) -> n1 * n2));
        numeros.stream().anyMatch(n -> n < 0);
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> impares = numeros.stream().filter(n -> !(n % 2 == 0)).toList();
        numeros.stream().filter(n -> n % n == 0 && !(n % 2 == 0)).forEach(n -> System.out.println(n));
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(Integer::sum));
    }}
