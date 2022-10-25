package enumeracoes_composicao;

import java.util.Calendar;

public class Post {
	private Calendar moment;
	private String title;
	private String content;
	private Integer likes;
	
	private Comment comentario; 
	
	Post(Calendar moment, String title, String content, Integer likes){
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void setComentario(String text) {
		comentario.setText(text);
	}
	
	public String getComentario() {
		return this.comentario.getText();
	}
	
	public Calendar getMoment() {
		return moment;
	}
	public void setMoment(Calendar moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}	
}
