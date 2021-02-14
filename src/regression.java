public class regression {

    public static void main(String[] args) {

        int[] xs = {-100, -10, -3, 0, 1, 2, 3, 4, 10, 100};
        int[] ys = {9901, 91, 7, 1, 3, 7, 13, 21, 111, 10101};
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;

        int epochs = 10000;
        double a = 0.00000001;

        for (int i = 0; i < epochs; i++) {

            float cost = 0;

            for (int j =0; j < xs.length; j++) {

                double h_w = w0 + (w1 * xs[j]) + ((w2 * xs[j] * xs[j]));     //prediction
                cost += (ys[j] - h_w) * (ys[j] - h_w);       //cost

                w2 += a * (ys[j] - h_w) * xs[j] * xs[j];
                w1 += a * (ys[j] - h_w) * xs[j];
                w0 += a * (ys[j] - h_w);

            }

            System.out.println("Current Cost: " + cost + " w0: " + w0 + " w1: " + w1 + " w2: " + w2 );


        }

        System.out.println("Final equation: h(x) = " + w0 + " + " + w1 +"x + " + w2 + "x^2");

    }
}
