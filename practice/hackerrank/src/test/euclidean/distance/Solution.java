package test.euclidean.distance;

public class Solution {

  // Function to calculate the minimum sum
  // of the euclidean distances to all points
  static double solution(int[][] p) {

    // Calculate the centroid
    double x = 0, y = 0;
    for (int i = 0; i < p.length; i++) {
      x += p[i][0];
      y += p[i][1];
    }

    x = x / p.length;
    y = y / p.length;

    // Calculate distance of all points
    return find(x, y, p);
  }

  // Function to calculate Euclidean distance
  static double find(double x, double y,
      int[][] p) {
    double mind = 0;

    for (int i = 0; i < p.length; i++) {
      double a = p[i][0], b = p[i][1];
      mind += Math.sqrt(Math.pow((x - a), 2) + Math.pow((y - b), 2)

      );
    }
    return mind;
  }

  public static void main(String[] args) {
    // Initializing the points
    int[][] point = {{0, 11}, {-7, 1}, {-5, -3}};

    double distance = solution(point);

    System.out.println(distance);
  }

  //euclidean distance (?)
  //  double distance(Point other) {
  //    Point result = new Point();
  //    result.y = Math.abs(y - other.y);
  //    result.x = Math.abs(x - other.x);
  //    result.distance = Math.sqrt((result.y) * (result.y) + (result.x) * (result.x));
  //    System.out.println(result);
  //    return result.distance;
  //  }
  //} 

}
