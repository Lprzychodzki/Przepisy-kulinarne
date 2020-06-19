package pl.projekt.spring.model;

public class Recipe {
	private int id;
	private String name;
	private String type;
	private String hardtype;
	private String ingredients;
	private String time;
	private String description;
	private String author;
	private String imgurl;
	
	public Recipe(id, name, type, hardtype, ingredients, time, description, author, imgurl) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.hardtype = hardtype;
		this.ingredients = ingredients;
		this.time = time;
		this.description = description;
		this.author = author;
		this.imgurl = imgurl;
	}
	
	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getHardType() {
		return hardtype;
	}
	
	public String getIngredients() {
		return ingredients;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getImg() {
		return imgurl;
	}
	
}
