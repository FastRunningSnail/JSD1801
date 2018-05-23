package me.ljp.bms.entity;

public class BookInfo {
	private Integer bid;
	private String bookName;
	private int amount;
	public BookInfo() {
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "BookInfo [bid=" + bid + ", bookName=" + bookName + ", amount=" + amount + "]";
	}
	
	

}
