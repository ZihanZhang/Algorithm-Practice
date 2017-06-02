package Binary_Search;

/**
 * Created by ZihanZhang on 17/6/1.
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length;
        int mid;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;

            if (matrix[mid][1] == target) {
                return true;
            }
            else if (matrix[mid][1] < target) {
                start = mid;
            }
            else if (matrix[mid][1] > target) {
                end = mid;
            }
        }

        if (matrix[start][1] > target) {
            return false;
        }
        else if (matrix[start][1] <= target && matrix[end][1] > target) {
            int rstart = 0;
            int rend = matrix[start].length;
            int rmid;

            while (rstart + 1 < rend) {
                rmid = rstart + (rend - rstart) / 2;

                if (matrix[start][rmid] == target) {
                    return true;
                }
                else if (matrix[start][rmid] < target) {
                    rstart = rmid;
                }
                else if (matrix[start][rmid] > target) {
                    rend = rmid;
                }
            }

            if (matrix[start][rstart] == target) {
                return true;
            }
            else if (matrix[start][rend] == target) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (matrix[end][1] <= target && matrix[end][matrix[end].length] >= target) {
            int rstart = 0;
            int rend = matrix[end].length;
            int rmid;

            while (rstart + 1 < rend) {
                rmid = rstart + (rend - rstart) / 2;

                if (matrix[end][rmid] == target) {
                    return true;
                }
                else if (matrix[end][rmid] < target) {
                    rstart = rmid;
                }
                else if (matrix[end][rmid] > target) {
                    rend = rmid;
                }
            }

            if (matrix[end][rstart] == target) {
                return true;
            }
            else if (matrix[end][rend] == target) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
