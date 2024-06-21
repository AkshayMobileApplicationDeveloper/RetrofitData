

package com.app.retrofitdata.Model;
import java.util.List;

public class userModel {
    private long albumId;
    private long id;
    private String title;
    private String url;
    private String thumbnailUrl;


    public userModel(long albumId, long id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public long getAlbumId() { return albumId; }
    public void setAlbumId(long value) { this.albumId = value; }

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String geturl() { return url; }
    public void seturl(String value) { this.url = value; }

    public String getThumbnailUrl() { return thumbnailUrl; }
    public void setThumbnailUrl(String value) { this.thumbnailUrl = value; }
}
