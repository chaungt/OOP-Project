package com.example.server.model;

import java.time.LocalDateTime;
import java.util.List;

public class SocialPostEntity {
    private Long id;
    private String content;
    private LocalDateTime postDate;
    private String source;
    private String disasterName;
    private List<String> keywords;
    private String sentiment;
    private String damageType;
    private String reliefItem;

    // Constructor mặc định
    public SocialPostEntity() { }

    // Constructor để test
    public SocialPostEntity(String content, LocalDateTime postDate, String source) {
        this.content = content;
        this.postDate = postDate;
        this.source = source;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDateTime getPostDate() { return postDate; }
    public void setPostDate(LocalDateTime postDate) { this.postDate = postDate; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDisasterName() { return disasterName; }
    public void setDisasterName(String disasterName) { this.disasterName = disasterName; }

    public List<String> getKeywords() { return keywords; }
    public void setKeywords(List<String> keywords) { this.keywords = keywords; }

    public String getSentiment() { return sentiment; }
    public void setSentiment(String sentiment) { this.sentiment = sentiment; }

    public String getDamageType() { return damageType; }
    public void setDamageType(String damageType) { this.damageType = damageType; }

    public String getReliefItem() { return reliefItem; }
    public void setReliefItem(String reliefItem) { this.reliefItem = reliefItem; }

    // toString()
    @Override
    public String toString() {
        return "SocialPostEntity{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", postDate=" + postDate +
                ", source='" + source + '\'' +
                ", disasterName='" + disasterName + '\'' +
                ", keywords=" + keywords +
                ", sentiment='" + sentiment + '\'' +
                ", damageType='" + damageType + '\'' +
                ", reliefItem='" + reliefItem + '\'' +
                '}';
    }
}

