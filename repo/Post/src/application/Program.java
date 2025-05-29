package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//instante do post
		// instanciar obejto date a partir do textp
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("have a nice trip!");
		Comment c2 = new Comment("wow thats awesome");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
							"Traveling to new zeland",
							"im going to visit this wonderful country",
							12);
		//associações
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("good night");
		Comment c4 = new Comment("may the force be wth you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:44:19"),
							"g nigth guys",
							"cu tomorrow",
							5);
		//associações
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
