package Problem10

long limit = 2000000;
//long limit = 10;

public static boolean isPrime(long n) {
    boolean prime = true;
    for (long i = 3; i <= Math.sqrt(n); i += 2)
        if (n % i == 0) {
            prime = false;
            break;
        }
    if ((n % 2 != 0 && prime && n > 2) || n == 2) {
        return true;
    } else {
        return false;
    }
}

long sum = 0;

for (int i = 0; i < limit; i++) {

    if (isPrime(i)) {
        println "i=" + i
        sum += i
    }

}

println "sum = " + sum
