import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class KuadranTertentuDipindahkan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah elemen M
        int M = scanner.nextInt();

        // Membaca array of Point A
        Point[] A = new Point[M];
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            A[i] = new Point(x, y);
        }

        // Membaca kuadran N
        int N = scanner.nextInt();

        // Memilih titik-titik yang berada di kuadran N
        Point[] B = selectPointsInQuadrant(A, N);

        // Menampilkan jumlah titik di kuadran N
        System.out.println(B.length);

        // Menampilkan titik-titik yang berada di kuadran N
        for (Point point : B) {
            System.out.println(point.x + " " + point.y);
        }
    }

    // Method untuk memilih titik-titik yang berada di kuadran N
    public static Point[] selectPointsInQuadrant(Point[] points, int quadrant) {
        int count = 0;
        // Menghitung jumlah titik yang berada di kuadran N
        for (Point point : points) {
            if (isInQuadrant(point, quadrant)) {
                count++;
            }
        }

        // Mengumpulkan titik-titik yang berada di kuadran N ke dalam array B
        Point[] result = new Point[count];
        int index = 0;
        for (Point point : points) {
            if (isInQuadrant(point, quadrant)) {
                result[index++] = point;
            }
        }

        return result;
    }

    // Method untuk memeriksa apakah suatu titik berada di kuadran tertentu
    public static boolean isInQuadrant(Point point, int quadrant) {
        switch (quadrant) {
            case 1:
                return (point.x > 0 && point.y > 0);
            case 2:
                return (point.x > 0 && point.y < 0);
            case 3:
                return (point.x < 0 && point.y < 0);
            case 4:
                return (point.x < 0 && point.y > 0);
            default:
                return false;
        }
    }
}
