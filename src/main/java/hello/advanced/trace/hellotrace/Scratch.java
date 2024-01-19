package hello.advanced.trace.hellotrace;

public class Scratch {

    public static void main(String[] args) {


        long beforeTime1 = System.currentTimeMillis();

        long sum1 = 0;
        for (long i = 0; i < 100_000_000L; i++) {
            sum1 += i * i;
        }

        long afterTime1 = System.currentTimeMillis();
        long secDiffTime1 = (afterTime1 - beforeTime1) / 1000;
        System.out.println("시간차이 : "+secDiffTime1 + " 초");

    }
}
