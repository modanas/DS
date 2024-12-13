import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> points = new ArrayList<>();

        // Read input points
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        scanner.close(); // Close the scanner

        // Compute the convex hull and the maximum area
        List<Point> convexHullPoints = convexHull(points);
        long maxArea = calculateArea(convexHullPoints); // Use long to store the result as an integer
        System.out.println(maxArea);
    }

    // Comparator function to sort points based on x-coordinate (and y-coordinate in case of a tie)
    static class PointComparator implements Comparator<Point> {
        public int compare(Point a, Point b) {
            if (a.x < b.x || (a.x == b.x && a.y < b.y)) {
                return -1;
            } else if (a.x == b.x && a.y == b.y) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    // Cross product of vectors (p1-p0) and (p2-p0)
    static int crossProduct(Point p0, Point p1, Point p2) {
        int x1 = p1.x - p0.x;
        int y1 = p1.y - p0.y;
        int x2 = p2.x - p0.x;
        int y2 = p2.y - p0.y;
        return x1 * y2 - x2 * y1;
    }

    // Graham's Scan algorithm to find the convex hull
    static List<Point> convexHull(List<Point> points) {
        int n = points.size();
        if (n <= 3) return points;

        points.sort(new PointComparator()); // Sort points based on x, then y coordinates

        List<Point> upperHull = new ArrayList<>();
        List<Point> lowerHull = new ArrayList<>();

        // Build upper hull
        for (int i = 0; i < n; i++) {
            while (upperHull.size() >= 2 &&
                    crossProduct(upperHull.get(upperHull.size() - 2),
                            upperHull.get(upperHull.size() - 1),
                            points.get(i)) <= 0) {
                upperHull.remove(upperHull.size() - 1);
            }
            upperHull.add(points.get(i));
        }

        // Build lower hull
        for (int i = n - 1; i >= 0; i--) {
            while (lowerHull.size() >= 2 &&
                    crossProduct(lowerHull.get(lowerHull.size() - 2),
                            lowerHull.get(lowerHull.size() - 1),
                            points.get(i)) <= 0) {
                lowerHull.remove(lowerHull.size() - 1);
            }
            lowerHull.add(points.get(i));
        }

        // Remove the last point of each half to avoid duplication
        upperHull.remove(upperHull.size() - 1);
        lowerHull.remove(lowerHull.size() - 1);

        // Combine upper and lower hull
        upperHull.addAll(lowerHull);
        return upperHull;
    }

    // Calculate the area of a polygon and return as an integer
    static long calculateArea(List<Point> polygon) {
        int n = polygon.size();
        if (n < 3) return 0; // Not a valid polygon

        long area = 0;

        for (int i = 0; i < n; i++) {
            int x1 = polygon.get(i).x;
            int y1 = polygon.get(i).y;
            int x2 = polygon.get((i + 1) % n).x;
            int y2 = polygon.get((i + 1) % n).y;
            area += (long) x1 * y2 - (long) x2 * y1; // Use long to avoid overflow
        }

        return Math.abs(area) / 2;
    }
}
