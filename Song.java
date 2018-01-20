public class Song {


static Song songs[]=new Song[10];

	private String title;
	private Singer singer;
	static String url;
    static int counter=0;

	public Song(String title1,Singer singer1,String url1) {
		this.title = title1;
		this.singer=singer1;
		this.url=url1;
		songs[counter]=this;
		counter ++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title1) {
		this.title = title1;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer1) {
		this.singer = singer1;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url1) {
		this.url = url1;
	}

	public String toString() {
		return "Song : title"+title +",singer : "+ singer + ", url=" + url ;
	}
}
