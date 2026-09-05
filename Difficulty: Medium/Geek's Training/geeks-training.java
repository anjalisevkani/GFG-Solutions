class Solution {

    public int maximumPoints(int[][] points) {
        int n=points.length;

        int[] prev = new int[4];

        // Day 0
        prev[0] = Math.max(points[0][1], points[0][2]);

        prev[1] = Math.max(points[0][0], points[0][2]);

        prev[2] = Math.max(points[0][0], points[0][1]);

        prev[3] = Math.max(
            points[0][0],
            Math.max(points[0][1], points[0][2])
        );

        // Remaining days
        for (int day = 1; day < n; day++) {

            int[] curr = new int[4];

            for (int last = 0; last < 4; last++) {

                for (int activity = 0; activity < 3; activity++) {

                    if (activity != last) {

                        int currentPoints =
                            points[day][activity]
                            + prev[activity];

                        curr[last] =
                            Math.max(curr[last], currentPoints);
                    }
                }
            }

            prev = curr;
        }

        return prev[3];
    }
}