package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
//연속합
//https://www.acmicpc.net/problem/1912
//△
public class serialSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> serialSum = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int temp = arr[0];
        for (int i = 1; i < num; i++) {
            temp  = Integer.max(arr[i] + temp , arr[i]);
            serialSum.add(temp);
        }

        System.out.println(Collections.max(serialSum));
    }

}

