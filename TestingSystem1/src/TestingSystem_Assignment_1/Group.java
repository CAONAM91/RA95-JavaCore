package TestingSystem_Assignment_1;

import java.time.LocalDate;

public class Group {
	public int groupId;
	public String groupName;
	public Account creator;
	public LocalDate createDate;
	public Account[] accounts;

	public Group(int groupId, String groupName, Account creator, LocalDate createDate) {

		this.groupId = groupId;
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
	}

}
