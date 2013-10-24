package Problem9

int a = 0
int b = 0
int c = 0
int sum = 1000
c = sum

for (; c > 0; c--) {
    for (b = c - 1; b > 0; b--) {
        for (a = b - 1; a > 0; a--) {
            int ret = a + b + c
            if (ret == sum) {
                boolean check = (a * a + b * b == c * c)
                if (check) {
                    long product = a * b * c
                    println "Product = " + product
                    System.exit(0)
                }
            }
        }
    }
}
