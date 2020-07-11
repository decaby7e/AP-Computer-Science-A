//precondition x, y non-negative
public int gcd(int x, int y)
{
        if(x < y)
                return gcd(y, x);

        else if(y == 0)
                return x;

        else
                return gcd(y, x % y);
}

/* Example

x = 126, y = 90    x or y ≠ 0   ∴   126 / 90 = 1 remainder 36
x = 90, y = 36     x or y ≠ 0   ∴   90 / 36 = 2 remainder 18
x = 36, y = 18     x or y ≠ 0   ∴   36 / 18 = 2 remainder 0
x = 18, y = 0      x or y = 0   ∴   GCD = 18

Base Case:         GCD(x, y) = y     if y is a divisor of x
Recursive Cases:   GCD(x, y) = GCD(y, x)      if x < n,
                   GCD(x, y) = GCD(y, x % y)  otherwise.

*/
