package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	//nao tenha uma copia do objketo para cada copia da minha aplicação post
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//ASSSOCIAÇÃO
	private List<Comment> comments = new ArrayList<>();

	public Post () {
	}
	//a lista nao poe
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
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
	public List<Comment> getComments() {
		return comments;
	}
	
	//se for lista nao poe set poe add e remove
	//no lugar do set comments pq no set ele cria outra lista e tem que adc eh na que a gnt ligou
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	//pode ter varios comentarios varios textos
	//cosnome mt memmoria e mt lentp
	
	public String toString() {
		//string builder - string mt grande a partir de vaaarios strings
		StringBuilder sb = new StringBuilder();
		//append = acrescentar no final
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comment: \n");
		// para cada comentario c na minha lista de comentarios no post
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		//converte meu string builder para string
		return sb.toString();
	}
	
	
}
