import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayString {

	public static void main(String[] args) {
		String [] a = new String[11];
		a[0] = "홍길동";
		a[1] = "로빈훗";
		a[2] = "이순신";
		a[3] = "정약용";
		a[4] = "이황";
		a[5] = "정우성";
		a[6] = "고현정";
		a[7] = "박명수";
		a[8] = "홍진경";
		a[9] = "이영자";
		a[10] = "이준기";
		Arrays.sort(a);
		// sort() 메소드는 퀵정렬 (QuickSort) 알고리즘 사용
		for(int i=0; i<a.length; i++) {
			System.out.println("[i = "+i+"]-----"+a[i]+"]");
		}
		
		String[] s = {"홍길동","로빈훗","이순신","정약용","이황","정우성"
				,"고현정","박명수","홍진경","이영자","이준기"
		};
		for(int i=0; i<s.length; i++) {
			System.out.println("[i = "+i+"]-----"+s[i]+"]");
		}
	}

}
