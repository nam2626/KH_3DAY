package e06_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementDelete {

	public static void main(String[] args) {
int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 숫자 입력 : ");
		int n = sc.nextInt();
		
		//삭제 -> 검색이 선행
		//삭제할 데이터가 몇번 인덱스에 있는 지 출력
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				//System.out.println("삭제할 값 인덱스 : "+i);
				//1칸씩 땡겨옴.
				for(int j=i;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
