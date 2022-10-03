package com.example;

import java.lang.Math;
    import java.util.Random;

    public class Main
    {
        public static void main(String[] args) {
            int i = 14, j = 12;
            double[][] n = new double[j][i];
            long [] c = {3,5,7,9,11,13,15,17,19,21,23,25};
            for (j = 0; j < 12;j++){
                int k = j;
                double[] x = new double[14];
                double mx = 10.0d;
                double mb = -7.0d;
                double difference = mx - mb;
                Random randomize = new Random();
                for (int b = 0; b < 14; b++){
                    x[b] = mb + randomize.nextDouble(difference);
                }
                for(i = 0; i < 14; i++){
                    if (c[k]==(21)){
                        n[j][i]=(Math.cbrt(Math.pow(Math.pow(x[i], x[i]+0.5)+0.5/Math.tan(x[i]), 3)));}
                    else {
                        if (c[k]==7||c[k]==11||c[k]==15||c[k]==17||c[k]==23||c[k]==25){
                            n[j][i]=Math.pow(((((Math.tan(Math.pow((3/Math.PI+x[i]), x[i])))-0.75)/3)/4), 2);}
                        else {
                            n[j][i]=Math.pow(Math.cbrt(Math.pow(Math.log(Math.abs(x[i])-1)/Math.pow((x[i])/(1-x[i]), 2), 2))+4, 2);}

                    }
                    double result = n[j][i];
                    String printResult = String.format("%.2f", result);
                    System.out.print(printResult + " ");
                }
                System.out.println("\n");
            }
        }
    }

