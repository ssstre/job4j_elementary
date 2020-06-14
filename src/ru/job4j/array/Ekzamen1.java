package ru.job4j.array;

import java.security.spec.RSAOtherPrimeInfo;

public class Ekzamen1 {
  public static boolean sorting(int in[], int in2[]) {
      boolean x = true;
      for (int i = 0; i < in.length; i++) {
          for (int j = 0; j < in2.length; j++) {
              if(x = in[i] == in2[j]) {

                  break;
              }

          }

      }
      return x;
  }

    public static boolean poryadok(int in1[]) {

        boolean x = true;
        for (int i = 0; i < in1.length - 1; i++) {
            if (in1[i] > in1[i + 1]) {
                x = false;
            break;
            }
        }
        return x;
    }
}
