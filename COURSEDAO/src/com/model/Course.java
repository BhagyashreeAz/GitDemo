package com.model;

public class Course {

	private int cid,cduration;
	private String cname;
	private int fees;
	public Course(int cid, int cduration, String cname,int fees) {
		super();
		this.cid = cid;
		this.cduration = cduration;
		this.cname = cname;
		this.fees =fees;
	}
	public Course() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCduration() {
		return cduration;
	}
	public void setCduration(int cduration) {
		this.cduration = cduration;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getFees() {
		// TODO Auto-generated method stub
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
		
		
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cduration=" + cduration + ", cname=" + cname + ",fees=" + fees + "]";
	}
	@Override
	public boolean equals(Object ob)
	{
		try
		{
			Course course=(Course) ob;
			if(this.cid==course.cid)
				return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return super.equals(ob);
		}
	}
	
	
}
