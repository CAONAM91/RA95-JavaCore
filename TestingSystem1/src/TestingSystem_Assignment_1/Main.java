package TestingSystem_Assignment_1;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		// Department
		Department dep1 = new Department();
		dep1.departmentId = 1;
		dep1.departmentName = "Sales";
		Department dep2 = new Department();
		dep2.departmentId = 2;
		dep2.departmentName = "Marketing";
		Department dep3 = new Department();
		dep3.departmentId = 3;
		dep3.departmentName = "IT";

		// Position
		Position pos1 = new Position(1, PositionNameEnum.DEV);
		Position pos2 = new Position(2, PositionNameEnum.TEST);
		Position pos3 = new Position(3, PositionNameEnum.PM);

		// Account
		Account acc1 = new Account();
		acc1.accountId = 1;
		acc1.email = "teo@example.com";
		acc1.userName = "teo";
		acc1.fullName = "Nguyen Van Teo";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.of(2024, 1, 11);

		Account acc2 = new Account();
		acc2.accountId = 2;
		acc2.email = "ty@example.com";
		acc2.userName = "ty";
		acc2.fullName = "Tran Thi Ty";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2024, 2, 1);

		Account acc3 = new Account();
		acc3.accountId = 3;
		acc3.email = "binh@example.com";
		acc3.userName = "binh";
		acc3.fullName = "Pham Van Binh";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.of(2024, 3, 5);

		// Group
		Group group1 = new Group(1, "Fresher", acc1, LocalDate.of(2025, 2, 1));
		Group group2 = new Group(2, "Junior", acc2, LocalDate.of(2022, 6, 1));
		Group group3 = new Group(3, "Senior", acc3, LocalDate.of(2021, 2, 1));

		acc1.groups = new Group[] { group1, group2 };
		acc2.groups = new Group[] { group3, group2 };
		acc3.groups = new Group[] { group1, group3 };

		group1.accounts = new Account[] { acc1, acc2, acc3 };
		group2.accounts = new Account[] { acc2, acc3 };
		group3.accounts = new Account[] { acc1, acc3 };

		// GroupAccount
		GroupAccount groupacc1 = new GroupAccount(group1, acc1, LocalDate.of(2020, 2, 1));
		GroupAccount groupacc2 = new GroupAccount(group2, acc1, LocalDate.of(2021, 2, 1));
		GroupAccount groupacc3 = new GroupAccount(group3, acc3, LocalDate.of(2022, 2, 1));
		GroupAccount groupacc4 = new GroupAccount(group1, acc2, LocalDate.of(2022, 2, 1));

//		Question 2:
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text &quot;Nhân viên này chưa có group&quot;
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text &quot;Group của nhân viên này là Java
//			Fresher, C# Fresher&quot;
//			Nếu có mặt trong 3 Group thì sẽ in ra text &quot;Nhân viên này là người quan trọng, tham
//			gia nhiều group&quot;
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text &quot;Nhân viên này là người hóng
//			chuyện, tham gia tất cả các group&quot;

		Account[] groupaccs = { groupacc1.account, groupacc2.account, groupacc3.account };
		int i = 0;
		int countacc2 = 0;
		for (i = 0; i < groupaccs.length; i++) {
			if (groupaccs[i].accountId == 2)
				countacc2++;
		}
		;
		switch (countacc2) {
		case 0:
			System.out.println("Nhan vien nay chua co group");
			break;
		case 1:
			System.out.println("Nhan vien nay co group la Java Fresher, C# fresher");
			break;
		case 2:
			System.out.println("Nhan vien nay co group la Java Fresher, C# fresher");
			break;
		case 3:
			System.out.println("Nhan vien nay la người quan trọng, tham gia nhiều group");
			break;

		default:
			System.out.println("Nhan vien nay la người hóng chuyện, tham gia tất cả các group");
			break;
		}

//		
//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1

		System.out.println(acc2.department == null ? "nhan vien ko co department"
				: "nhan vien co deparment la " + acc2.department.departmentName);

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text &quot;Đây là Developer&quot;
//			Nếu không phải thì in ra text &quot;Người này không phải là Developer&quot;

		System.out.println(
				(acc1.position.positionName.equals("DEV")) ? "Day la Developer" : "Người này không phải là Developer");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau: Nếu số lượng
//			account = 1 thì in ra &quot;Nhóm có một thành viên&quot;
//			Nếu số lượng account = 2 thì in ra &quot;Nhóm có hai thành viên&quot;
//			Nếu số lượng account = 3 thì in ra &quot;Nhóm có ba thành viên&quot;
//			Còn lại in ra &quot;Nhóm có nhiều thành viên&quot;

		if (group1.accounts == null || group1.accounts.length == 0) {
			System.out.println("ko co accoount nao");

		} else {
			int soluong = group1.accounts.length;
			switch (soluong) {
			case 1:
				System.out.println("Nhom co 1 thanh vien");
				break;
			case 2:
				System.out.println("Nhom co 2 thanh vien");
				break;
			case 3:
				System.out.println("Nhom co 3 thanh vien");
				break;

			default:
				System.out.println("Nhom co nhieu thanh vien");
				break;
			}
		}

//		
//	Question 7:
//	Sử dụng switch case để làm lại Question 4

		String a = acc1.position.positionName.toString();
		switch (a) {
		case "DEV":
			System.out.println("Day la Developer");
			break;

		default:
			System.out.println("Day ko phai la Developer");
			break;
		}
//	foreach
//	Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
		System.out.println("============quest 8 ===============");
		Account[] account = { acc1, acc2, acc3 };
		for (Account accounts : account) {
			System.out.println("Email la : " + accounts.email);
			System.out.println("FullName la :" + accounts.fullName);
			System.out.println("Phong ban la :" + accounts.department.departmentName);

		}

//		Question 9:
//		In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("============quest 9 ===============");
		Department[] department = { dep1, dep2, dep3 };
		for (Department departments : department) {
			System.out.println("id phong ban " + departments.departmentId);
			System.out.println("Ten phong ban " + departments.departmentName);
		}

//		FOR
//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		System.out.println("============quest 11 ===============");
		for (int x = 0; x < department.length; x++) {
			System.out.println("Thong tin department thu " + (x + 1) + " la");
			System.out.println("Id :" + department[x].departmentId);
			System.out.println("Name :" + department[x].departmentName);

		}

		// Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
		// Question 10
		System.out.println("============quest 12 ===============");
		for (int v = 0; v < account.length; v++) {
			if (v == 2) {
				break;
			}
			System.out.println("Email la : " + account[v].email);
			System.out.println("FullName la :" + account[v].fullName);
			System.out.println("Phong ban la :" + account[v].department.departmentName);

		}

//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2

		System.out.println("===============quest 13 ====================");
		for (int t = 0; t < account.length; t++) {
			if (t == 1) {
				continue;
			}
			System.out.println("Email la : " + account[t].email);
			System.out.println("FullName la :" + account[t].fullName);
			System.out.println("Phong ban la :" + account[t].department.departmentName);

		}

//		Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("===============quest 15 ====================");
		for (int y = 0; y <= 20; y++) {
			if (y % 2 == 1) {
				continue;
			}
			System.out.println(y);
		}

//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break,
//		continue
		System.out.println("===============quest 16 ====================");
		int u = 0;
		while (u < 21) {
			u++;
			if (u % 2 == 0) {

				System.out.println(u);

			}

		}
	}
}
