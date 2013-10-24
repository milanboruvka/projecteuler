package Problem16

//long x = 2
//long n = 15


BigDecimal x = 2
int n = 1000

x = x.pow(n)
String s = String.valueOf(x)

//println s

result = 0

for (int i = 0; i < s.length(); i++) {
    int a = Integer.parseInt("" + s.charAt(i))
    result += a
}

println result