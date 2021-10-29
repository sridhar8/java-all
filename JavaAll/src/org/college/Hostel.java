package org.college;

public class Hostel extends College{
public void HostelName() {
System.out.println("veni");
}
public static void main(String[] args) {
	Hostel he = new Hostel();
	he.HostelName();
	he.CollegeName();
	he.CollegeCode();
	he.CollegeRank();
}
}
