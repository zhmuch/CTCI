int multiply(int a, int b) {
    int res = 0;
    for (int i = 0; i < b; i++)
        res += a;
    return res;
}

int subtract(int a, int b) {
    //...
}


/**
 * Standard Solution;
 * 
 */
 
/* Flip a positive sign to negative or negative sign to pos. */
int negate(int a) {
    int neg = 0;
    int newSign = a < 0 ? 1 : -1;
    while (a != 0) {
        neg += newSign;
        a += newSign;
    }
    return neg;
}

/* Optimal Flip. */
int negate(int a) {
    int neg = 0;
    int newSign = a < 0 ? 1 : -1;
    int delta = newSign;
    while (a != 0) {
        boolean differentSigns = (a + delta > 0) != (a > 0);
        if (a + delta != 0 && differentSigns) { // If delta is too big, reset it
            delta = newSign;
        }
        neg += delta;
        a += delta;
        delta += delta; // Double the delta
    }
    return reg;
}


/**
 * Multiplication;
 * 
 */

int multiply(int a, int b) {
    if (a < b) {
        return multiply(b, a);
    }
    
    int sum = 0;
    for (int i = abs(b); i > 0; i = minus(i, 1)) {
        sum += a;
    }
    
    if (b < 0) {
        sum = negate(sum);
    }
    return sum;
}


/**
 * Division;
 * 
 */

int divide(int a, int b) throws java.lang.ArithmeticException {
    if (b == 0) {
        throw new java.lang.ArithmeticException("ERROR");
    }
    int absa = abs(a);
    int absb = abs(b);
    
    int product = 0;
    int x = 0;
    while (product + absb <= absa) {    /* do not go past a */
        product += absb;
        x++;
    }
    
    if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
        return x;
    } else {
        return negate(x);
    }
}
