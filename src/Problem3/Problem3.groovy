package Problem3

import Common.Primes

//final long number = 13195
final long NUMBER = 600851475143

long start = Math.sqrt(NUMBER)
long remainder = NUMBER;

for (long i = start; i > 0; i--) {
    if (Primes.isPrime(i)) {
        if (NUMBER % i == 0) {
            long x = NUMBER / i;
            remainder = remainder - x
            println "Prime factor = " + i
        }
    }
}
