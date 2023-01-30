import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        float A = 0, B = 0;
        int k;
        char[] b = new char[1760];
        float[] z = new float[7040];
        while (true) {
            Arrays.fill(b, (char) 32);
            Arrays.fill(z, 0);
            for (float j = 0; j < 6.28; j += 0.07) {
                for (float i = 0; i < 6.28; i += 0.02) {
                    float sini = (float) Math.sin(i);
                    float cosj = (float) Math.cos(j);
                    float sinA = (float) Math.sin(A);
                    float sinj = (float) Math.sin(j);
                    float cosA = (float) Math.cos(A);
                    float cosj2 = cosj + 2;
                    float mess = 1 / (sini * cosj2 * sinA + sinj * cosA + 5);
                    float cosi = (float) Math.cos(i);
                    float cosB = (float) Math.cos(B);
                    float sinB = (float) Math.sin(B);
                    float t = sini * cosj2 * cosA - sinj * sinA;
                    int x = 40 + (int) (30 * mess * (cosi * cosj2 * cosB - t * sinB));
                    int y = 12 + (int) (15 * mess * (cosi * cosj2 * sinB + t * cosB));
                    int o = x + 80 * y;
                    int N = (int) (8 * ((sinj * sinA - sini * cosj * cosA) * cosB - sini * cosj * sinA - sinj * cosA - cosi * cosj * sinB));
                    if (y > 0 && y < 22 && x > 0 && x < 80 && mess > z[o]) {
                        z[o] = mess;
                        b[o] = ".,-~:;=!*#$@".charAt(N > 0 ? N : 0);
                    }
                }
            }
            System.out.print("\033[2J");
            for (k = 0; k < 1761; k++) {
                System.out.print(k % 80 == 0 ? '\n' : b[k]);
            }
            A += 0.04;
            B += 0.02;
        }
    }
}
