package Problem7

import Common.Primes

int primesCount = 10001;
int count = 0;

for (int i = 0; ; i++) {

    if (Primes.isPrime(i)) {

        count++
        //println "count = " + count

        if (count == primesCount) {
            println "i = " + i
            break
        }
    }


}