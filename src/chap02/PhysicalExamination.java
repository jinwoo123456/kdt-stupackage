package chap02;

public class PhysicalExamination {
    static final int VMAX = 21;

    static class PhyscData {

        String name;
        int height;
        double vision;

        PhyscData(
                String name,
                int height,
                double vision) {

            this.name = name;
            this.height = height;
            this.vision = vision;
        }

    }

    public static void main(String[] args) {

        PhyscData[] x = {

                new PhyscData("김진우", 173, 0.5),
                new PhyscData("김다미", 111, 1.5),
                new PhyscData("김길동", 166, 2.5),
                new PhyscData("홍홍홍", 177, 1.5),
                new PhyscData("김다라미", 222, 0.3),
                new PhyscData("김잠잠", 132, 0.2),
                new PhyscData("김고고", 165, 0.1),
                new PhyscData("김기기", 142, 0.5),
                new PhyscData("김부부", 177, 0.7),
                new PhyscData("나나미", 175, 0.8),
        };
        int[] physc_height_tot = new int[x.length];

    }

}
