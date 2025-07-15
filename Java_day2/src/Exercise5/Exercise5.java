package Exercise5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

//			Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap 3 so nguyen ");
//		int[] n = new int[3];
//
//		for (int i = 0; i < n.length; i++) {
//			n[i] = scanner.nextInt();
//
//		}
//		System.out.println("Ban da nhap cac so : " + Arrays.toString(n));
//
////			Question 2:
////			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
//
//		System.out.println("==================Question 2 ==================");
//		System.out.println("Nhap vao 2 so thuc");
//		double[] d = new double[2];
//
//		for (int i = 0; i < d.length; i++) {
//			d[i] = scanner.nextDouble();
//		}
//		System.out.println("Ban da nhap vao 2 so thuc : " + Arrays.toString(d));

//			Question 3:
//			Viết lệnh cho phép người dùng nhập họ và tên
		System.out.println("==================Question 3 ==================");
		System.out.println("Hay nhap ho ");
		String ho = scanner.nextLine();

		System.out.println("Hay nhap ten");
		String ten = scanner.nextLine();
		System.out.println("Ho va ten cua ban la : " + ho + " " + ten);

//			Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("==================Question 4 ==================");
		System.out.println("Hay nhap ngay sinh nhat cua ban");
		String birthday = scanner.nextLine();
		System.out.println("Ngay sinh nhat cua ban la : " + birthday);

//		Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method) Đối với property
//			Position, Người dùng nhập vào 1 2 3 4 5 và vào chương trình sẽ chuyển thành
//			Position.Dev, Position.Test, Position.ScrumMaster, Position.PM

	}

}
