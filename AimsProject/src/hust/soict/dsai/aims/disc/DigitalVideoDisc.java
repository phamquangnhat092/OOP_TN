package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String category, String title, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String director, String category, String title, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}

	@Override
	public boolean equals(Object obj) {
		DigitalVideoDisc disc = (DigitalVideoDisc) obj;
		if (this.title.equals(disc.title) && this.category.equals(disc.category)
				&& this.director.equals(disc.director) && this.length == disc.length && this.cost == disc.cost) {
			return true;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		String result = id + ".DVD-";
		if (title != null) {
			result += title;
		}
		if (category != null) {
			result += "-" + category;
		}
		if (director != null) {
			result += "-" + director;
		}
		if (length > 0) {
			result += "-" + length;
		}
		return result + ":" + cost + "$";
	}

	public boolean isMatch(String title) {
		if (this.title.equals(title)) {
			return true;
		}
		return false;
	}

	public boolean isMatch(int id) {
		if (this.id == id) {
			return true;
		}
		return false;
	}

}