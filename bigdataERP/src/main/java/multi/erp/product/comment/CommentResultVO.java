package multi.erp.product.comment;

public class CommentResultVO {
	private String content;
	private int count;
	public CommentResultVO(){
		
	}
	public CommentResultVO(String content, int count) {
		super();
		this.content = content;
		this.count = count;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "CommentResultVO [content=" + content + ", count=" + count + "]";
	}
	
}
