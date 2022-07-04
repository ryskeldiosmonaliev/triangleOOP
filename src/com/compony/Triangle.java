package com.compony;

public class Triangle {
    int a;
    int b;
    int c;

    void area(){
        int p = (a+b+c)/2;
double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("площадь треугольника = "+ S);
    }
}
