import java.util.ArrayList;

import jdk.internal.org.jline.utils.Status;

public class C206_CaseStudy {
	private static final int OPTIONNO = 3;
	private static final int OPTIONNO1 = 4;
	private static final int OPTIONNO2 = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UserAccount
		ArrayList<UserAccount> userList = new ArrayList<UserAccount>();
		
		userList.add(new UserAccount("Angelika", "Customer","20006337@myrp.edu.sg", "RP123@456"));
		userList.add(new UserAccount("Ji Fu", "Customer", "19022507@myrp.edu.sg", "RP765@4321"));
		userList.add(new UserAccount("Fatheen", "Designer", "19006266@myrp.edu.sg", "RP12345"));
		
		//Package
		ArrayList<Package> packageList = new ArrayList<Package>();

		packageList.add(new Package("WP123", "whole place", "15/09/2021", "13/10/2021", 500));
		packageList.add(new Package("R1234", "restrooms only", "05/08/2021", "15/12/2021", 100));
		packageList.add(new Package("K1234", "kitchen only", "21/06/2021", "10/08/2021", 200));

		int option = 0;
		int option1 = 0;
		int option2 = 0;
		while (option != OPTIONNO) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				// customer
				C206_CaseStudy.menu1();
				option1 = Helper.readInt("Enter an option > ");
				while (option1 != OPTIONNO1) {
					if (option1 == 1) {
						// register visitor account
						UserAccount ua= AddAccount();
						C206_CaseStudy.addUser(userList, ua);
						break;
						
					} else if (option1 == 2) {
						// quotation request
						return;
					} else if (option1 == 3) {
						// manage appointment
						return;
					} else if (option1 == 4) {
						System.out.println("Thanks for using!");
					} else {
						Helper.line(80, "-");
						System.out.println("Invalid option");
						break;
					}
				}
			} else if (option == 2) {
				C206_CaseStudy.menu2();
				option2 = Helper.readInt("Enter an option > ");
				while (option2 != OPTIONNO2) {
					if (option2 == 1) {
						// manage customer
						C206_CaseStudy.viewAllAccounts(userList);
						return;
					} else if (option2 == 2) {
						// manage package
						C206_CaseStudy.setHeader("Manage Packages");
						System.out.println("1. Add Package");
						System.out.println("2. View All Packages");
						System.out.println("3. Delete Package by Package Code");
						Helper.line(80, "-");
						int packageOption = Helper.readInt("Enter option > ");

						if (packageOption == 1) {
							Package p = inputPackage();
							C206_CaseStudy.addPackage(packageList, p);

						} else if (packageOption == 2) {
							C206_CaseStudy.viewAllPackage(packageList);
						} else if (packageOption == 3) {
							C206_CaseStudy.deletePackage(packageList);

						} else {
							Helper.line(80, "-");
							System.out.println("Invalid option");
							break;
						}
					} else if (option2 == 3) {
						// manage request for quotation
						return;
					} else if (option2 == 4) {
						return;
						// manage quotation
					} else if (option2 == 5) {
						return;
						// manage appointment
					} else if (option2 == 6) {
						System.out.println("Thanks for using!");
					} else {
						Helper.line(80, "-");
						System.out.println("Invalid option");
						break;

					}
				}
			}

			else if (option == 3) {
				System.out.println("Thanks for using the application");
			} else {
				Helper.line(80, "-");
				System.out.println("Invalid option");

			}
		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("Home Page");
		System.out.println("1. Customer");
		System.out.println("2. Admin/Designer");
		System.out.println("3. Quit");
		Helper.line(80, "-");

	}

	public static void menu1() {
		C206_CaseStudy.setHeader("Home Page for Customers");
		System.out.println("1. Visitor account Registration");
		System.out.println("2. Request for Quotation");
		System.out.println("3. Manage Appointment");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void menu2() {
		C206_CaseStudy.setHeader("Home Page for Admin/Designers");
		System.out.println("1. Manage Customer");
		System.out.println("2. Manage Package");
		System.out.println("3. Manage Request for Quotation");
		System.out.println("4. Manage Quotation");
		System.out.println("5. Manage Appointment");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//UserAccount
	public static UserAccount AddAccount() {
		String name = Helper.readString("Enter Name> ");
		String role= Helper.readString("Enter Role> ");
		String email= Helper.readString("Enter email address > ");
		String password = Helper.readString("Enter password > ");
		
		UserAccount ua = new UserAccount(name, role, email, password );
		return ua;
	}

	public static void addUser(ArrayList<UserAccount> userList, UserAccount ua) {
		userList.add(ua);
		System.out.println("Account Added!");
	}

	public static String retrieveAllAccounts(ArrayList<UserAccount> userList) {
		String output = "";
		for (int i = 0; i < userList.size(); i++) {
			output += String.format("%-15s %-30s %-20s %-20s %-10s\n", userList.get(i).getName(), userList.get(i).getRole(), userList.get(i).getEmail(),
					userList.get(i).getPassword(), userList.get(i).getStatus());
		}
		return output;
	}

	public static void viewAllAccounts(ArrayList<UserAccount> userList) {
		C206_CaseStudy.setHeader("USER ACCOUNTS");
		String output = String.format("%-15s %-30s %-20s %-20s %-10s\n", "NAME", "ROLE",
				"EMAIL", "PASSWORD", "STATUS");
		output += retrieveAllAccounts(userList);
		System.out.println(output);
	}

	public static void deleteAccount(ArrayList<UserAccount> userList) {
		String name = Helper.readString("Enter name of user to be deleted> ");
		boolean check = false;
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getName().equals(name)) {
				userList.remove(i);
				check = true;
			}

		}
		if (check == true) {
			Helper.line(80, "-");
			System.out.println("Account deleted");
		}
		else {
			Helper.line(80, "-");
			System.out.println("No Account found");
		}

	}
	
	
	//Package
	public static Package inputPackage() {
		String code = Helper.readString("Enter Package Code> ");
		String description = Helper.readString("Enter description> ");
		String startDate = Helper.readString("Enter date (dd/MM/yyyy) > ");
		String endDate = Helper.readString("Enter date (dd/MM/yyyy) > ");
		int amount = Helper.readInt("Enter Package Amount> ");

		Package p = new Package(code, description, startDate, endDate, amount);
		return p;
	}

	public static void addPackage(ArrayList<Package> packageList, Package p) {
		packageList.add(p);
		System.out.println("Package Added!");
	}

	public static String retrieveAllPackage(ArrayList<Package> packageList) {
		String output = "";
		for (int i = 0; i < packageList.size(); i++) {
			output += String.format("%-15s %-30s %-20s %-20s $%-10d\n", packageList.get(i).getCode(),
					packageList.get(i).getDescription(), packageList.get(i).getstartDate(),
					packageList.get(i).getendDate(), packageList.get(i).getAmount());
		}
		return output;
	}

	public static void viewAllPackage(ArrayList<Package> packageList) {
		C206_CaseStudy.setHeader("PACKAGE LIST");
		String output = String.format("%-15s %-30s %-20s %-20s %-10s\n", "PACKAGE CODE", "PACKAGE DESCRIPTION",
				"PACKAGE START DATE", "PACKAGE END DATE", "PACKAGE AMOUNT");
		output += retrieveAllPackage(packageList);
		System.out.println(output);
	}

	public static void deletePackage(ArrayList<Package> packageList) {
		String code = Helper.readString("Enter Package Code of Package to be deleted> ");
		boolean check = false;
		for (int i = 0; i < packageList.size(); i++) {
			if (packageList.get(i).getCode().equals(code)) {
				packageList.remove(i);
				check = true;
			}

		}
		if (check == true) {
			Helper.line(80, "-");
			System.out.println("Package deleted");
		}
		else {
			Helper.line(80, "-");
			System.out.println("No such package found");
		}

	}

}
