import java.util.*;
class Jobseq {
    char id;
    int deadline, profit;

    public Jobseq(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class Job {
    void print_jobseq(Jobseq arr[], int n) {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        boolean[] result = new boolean[n];
        char[] job = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, arr[i].deadline) - 1; j >= 0; j--) {
                if (!result[j]) {
                    result[j] = true;
                    job[j] = arr[i].id;
                    break;
                }
            }
        }

        for (char jb : job) {
            if (jb != 0) {
                System.out.println(jb + " ");
            }
        }
    }
    public static void main(String[] args) {
        Jobseq arr[] = {
            new Jobseq('a', 2, 100),
            new Jobseq('b', 1, 29),
            new Jobseq('c', 2, 27),
            new Jobseq('d', 1, 25),
            new Jobseq('e', 5, 15)
        };
        int n = arr.length;
        System.out.println("Following is the maximum profit sequence of jobs.");
        Job job = new Job();
        job.print_jobseq(arr, n);
    }
}
