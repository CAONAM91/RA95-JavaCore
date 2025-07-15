package TestingSystem_Assignment_1;

import java.time.LocalDate;

public class GroupAccount {
	public Group group;
	public Account account;
	public LocalDate joinDate;

	public GroupAccount(Group group, Account account, LocalDate joinDate) {
		super();
		this.group = group;
		this.account = account;
		this.joinDate = joinDate;
	}

}
