package com.mobileapp.mobilelaba1.utils;


public class MathUtil {
    public static double evaluatePolynomial(double[] coefficients, double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, coefficients.length - 1 - i);
        }
        return result;
    }

    public static double evaluatePolynomialDerivative(double[] coefficients, double x) {
        double derivative = 0.0;
        int n = coefficients.length; // Найвищий степінь многочлена

        for (int i = 0; i < n - 1; i++) {
            derivative *= x;
            derivative += (n - i - 1) * coefficients[i];
        }

        return derivative;
    }
}
